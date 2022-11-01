/**   
 *  (C) Copyright 2022 joaquinonsoft.com and others.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *   Contributors:
 *     Joaquín Garzón - initial implementation
 *
 */
package com.joaquinonsoft.bot.museum.smithsonian;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.joaquinonsoft.bot.museum.smithsonian.pojo.SmithsonianCategorySearchContents;
import com.joaquinonsoft.bot.net.AbstractAPIWrapper;
import com.joaquinonsoft.util.FileUtil;

/**
 * <strong>Smithsonian Institution Open Access API</strong>
 * The Smithsonian Institution Open Access APITrack this API 
 * provides access to metadata about objects in the vast Smithsonian 
 * museums and galleries collection. Get metadata for the objects 
 * (name, type, etc) also metrics about objects. Search by category or terms. 
 * Smithsonian Open Access enables users to share and reuse millions of the 
 * Smithsonian's images. This includes images and data from across the 
 * Smithsonian's 19 museums, 9 research centers, libraries, archives, 
 * and the National Zoo.
 * 
 * <strong>API Endpoint</strong>: https://api.si.edu/openaccess/api/v1.0/
 * <strong>API Portal / Home Page</strong>: https://www.si.edu/openaccess/devtools
 * 
 * @see https://edan.si.edu/openaccess/apidocs
 * @author Joaquín
 */
public class SmithsonianMuseumAPI extends AbstractAPIWrapper {
	
	protected static final Logger log = LogManager.getLogger(SmithsonianMuseumAPI.class);
		
	private static final String SMITHSONIAN_PROPERTIES = "smithsonian.properties";

	private final String URL_BASE = "https://api.si.edu/openaccess/api/v1.0";
	
	private final String METHOD_CATEGORY_SEARCH = "/category/:cat/search";
	
	private final String PATTERN_CAT = ":cat";
	
	private String apiKey = null;
	
	public SmithsonianMuseumAPI() {
		InputStream stream = FileUtil.getStreamFromResources(SMITHSONIAN_PROPERTIES);
		if(stream != null) {
			Properties prop = new Properties();
			try {
				prop.load(stream);
				apiKey = prop.getProperty("api_key");
			} catch (IOException e) {
				log.error("Properties file " + SMITHSONIAN_PROPERTIES, e);
			}
		}
	}
	
	/**
	 * <strong>search - category_search</strong>
	 * fetches content based on a query against a category. 
	 * art_design, history_culture or science_technology.
	 * <strong>GET</strong>
	 * <pre>
	 * https://api.si.edu/openaccess/api/v1.0/category/:cat/search
	 * </pre>
	 * <strong>NOTE</strong>: Start on position 0, page size 10.
	 */	
	public SmithsonianCategorySearchContents categorySearch(SmithsonianCategory category, String q) {
		return categorySearch(category, q, 0, 10);
	}

	
	/**
	 * <strong>search - category_search</strong>
	 * fetches content based on a query against a category. 
	 * art_design, history_culture or science_technology.
	 * <strong>GET</strong>
	 * <pre>
	 * https://api.si.edu/openaccess/api/v1.0/category/:cat/search
	 * </pre>
	 * <strong>NOTE</strong>: Page size 10.
	 */ 
	public SmithsonianCategorySearchContents categorySearch(SmithsonianCategory category, String q, int start) {
		return categorySearch(category, q, start, 10);
	}	
	
	/**
	 * <strong>search - category_search</strong>
	 * fetches content based on a query against a category. 
	 * art_design, history_culture or science_technology.
	 * <strong>GET</strong>
	 * <pre>
	 * https://api.si.edu/openaccess/api/v1.0/category/:cat/search
	 * </pre>
	 * 
	 * @param category - the category you are filtering against.
	 * Valid values: art_design, history_culture, science_technology
	 * 
	 * @param  q - the query you would like to issue. query field 
	 * accepts boolean operators [AND|OR] as well as fielded 
	 * searches [topic:Gastropoda].
	 * 
	 * @param start - (optional) the start row of your query. Default value: 0
	 * 
	 * @param rows - (optional) size of array to be returned. 
	 * Default value: 10. 
	 * Range size: 0..1000
	 */
	public SmithsonianCategorySearchContents categorySearch(SmithsonianCategory category, String q, int start, int rows) {
		SmithsonianCategorySearchContents smithsonianContent= null;
		String url = URL_BASE + METHOD_CATEGORY_SEARCH.replace(PATTERN_CAT, category.toString());
		
		log.debug("URL: " + url);
		
		List<NameValuePair> params = new LinkedList<NameValuePair>();
		params.add(new BasicNameValuePair("api_key", apiKey));
		params.add(new BasicNameValuePair("q", q));
		params.add(new BasicNameValuePair("start", Integer.toString(start)));
		params.add(new BasicNameValuePair("rows", Integer.toString(rows)));
		
		String result = get(url, null, params);
		if(result != null) {
			smithsonianContent = (SmithsonianCategorySearchContents) jsonStringToObject(result, SmithsonianCategorySearchContents.class);
		}		
		
		return smithsonianContent;
	}
	
}
