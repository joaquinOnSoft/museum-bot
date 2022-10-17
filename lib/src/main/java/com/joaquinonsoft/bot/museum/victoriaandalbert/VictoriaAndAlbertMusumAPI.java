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
package com.joaquinonsoft.bot.museum.victoriaandalbert;

import java.util.LinkedList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.joaquinonsoft.bot.museum.smithsonian.pojo.SmithsonianCategorySearchContents;
import com.joaquinonsoft.bot.museum.victoriaandalbert.pojo.VictoriaAndAlbertRecords;
import com.joaquinonsoft.bot.net.AbstractAPIWrapper;

/**
 * <strong>The Victoria & Albert Museum API</strong>
 * The Victoria & Albert Museum API is designed as a RESTful interface 
 * to our collections and what we know about them. It returns all items 
 * in the database (paginated) in XML or JSON format. The purpose of 
 * the V&A API is to maximize access to all our collections and 
 * encourage use of them.
 * 
 * <strong>API Endpoint</strong>: http://www.vam.ac.uk/api
 * <strong>API Portal / Home Page</strong>: http://www.vam.ac.uk/api/
 *
 * @author Joaquín
 */
public class VictoriaAndAlbertMusumAPI extends AbstractAPIWrapper {
	
	private static final int DEFAULT_PAGE = 1;

	private static final int DEFAULT_PAGE_SIZE = 15;

	private static final int MAX_PAGE_SIZE = 100;

	private static final int MIN_PAGE_SIZE = 1;

	private final String URL_BASE = "https://api.vam.ac.uk";
	
	private final String METHOD_CATEGORY_SEARCH = "/v2/objects/search";
	
	protected static final Logger log = LogManager.getLogger(VictoriaAndAlbertMusumAPI.class);


	/**
	 * <strong>Full Search</strong>
	 * Elasticsearch queries returning all data from Index
	 * <strong>GET</strong>
	 * <pre>
	 * /v2/objects/search
	 * </pre>
	 * Object Full Search
	 * 
	 * @param q - the query you would like to issue. Query (use * for all topics)
	 * 
	 * @see https://api.vam.ac.uk/docs#/Full%20Search/object_full_search_v2_objects_search_get 
	 */
	public VictoriaAndAlbertRecords search(String q) {	
		return search(q, DEFAULT_PAGE, DEFAULT_PAGE_SIZE);
	}	

	/**
	 * <strong>Full Search</strong>
	 * Elasticsearch queries returning all data from Index
	 * <strong>GET</strong>
	 * <pre>
	 * /v2/objects/search
	 * </pre>
	 * Object Full Search
	 * 
	 * @param q - the query you would like to issue. Query (use * for all topics)
	 * @param page - Page number. Default value : 1
	 * 
	 * @see https://api.vam.ac.uk/docs#/Full%20Search/object_full_search_v2_objects_search_get 
	 */
	public VictoriaAndAlbertRecords search(String q, int page) {	
		return search(q, page, DEFAULT_PAGE_SIZE);
	}
	
	
	/**
	 * <strong>Full Search</strong>
	 * Elasticsearch queries returning all data from Index
	 * <strong>GET</strong>
	 * <pre>
	 * /v2/objects/search
	 * </pre>
	 * Object Full Search
	 * 
	 * @param q - the query you would like to issue. Query (use * for all topics)
	 * @param page - Page number. Default value : 1
	 * @param pageSize - Page size. Default value : 15. maximum: 100, minimum: 1
	 * 
	 * @see https://api.vam.ac.uk/docs#/Full%20Search/object_full_search_v2_objects_search_get 
	 */
	public VictoriaAndAlbertRecords search(String q, int page, int pageSize) {
		VictoriaAndAlbertRecords records = null;
		String url = URL_BASE + METHOD_CATEGORY_SEARCH;
		
		if(page < DEFAULT_PAGE) {
			page = DEFAULT_PAGE;
		}
		
		if(pageSize  < MIN_PAGE_SIZE || pageSize > MAX_PAGE_SIZE) {
			pageSize = DEFAULT_PAGE_SIZE;
		}
		
		List<NameValuePair> params = new LinkedList<NameValuePair>();
		params.add(new BasicNameValuePair("q", q));
		params.add(new BasicNameValuePair("page", Integer.toString(page)));
		params.add(new BasicNameValuePair("page_size", Integer.toString(pageSize)));
		
		String result = get(url, null, params);
		if(result != null) {
			records = (VictoriaAndAlbertRecords) jsonStringToObject(result, VictoriaAndAlbertRecords.class);
		}		
		
		return records;
	}
}
