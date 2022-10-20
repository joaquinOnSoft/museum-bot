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
package com.joaquinonsoft.bot.museum.nhm;

import java.util.LinkedList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.joaquinonsoft.bot.museum.nhm.pojo.NHMPackageShow;
import com.joaquinonsoft.bot.museum.nhm.pojo.packagelist.NHMPackageList;
import com.joaquinonsoft.bot.net.AbstractAPIWrapper;

/**
 * <strong>Natural History Museum REST API</strong>
 * This REST API lets users access the data portal of 
 * London's Natural History Museum to retrieve collection 
 * and research datasets for use in software or applications.  
 * The datasets, returned in JSON, hold 2.7 million specimen 
 * records from the Museum’s Zoology, Botany, Mineralogy, Palaeontology 
 * and Entomology collections.
 * 
 * <strong>API Endpoint<strong>: http://data.nhm.ac.uk/api/3
 * <strong>API Portal</strong>: <a href="http://data.nhm.ac.uk/about/download">Home PageNatural History Museum</a>
 * @author Joaquín
 * @see https://docs.ckan.org/en/latest/api/index.html
 * @see https://www.programmableweb.com/api/natural-history-museum-rest-api
 */
public class NationalHistoryMuseumAPI extends AbstractAPIWrapper {

	private final int NO_VALUE = -1;
	
	private final String URL_BASE = "https://data.nhm.ac.uk/api/3";
	
	private final String METHOD_PACKAGE_LIST = "/action/package_list";
	private final String METHOD_PACKAGE_SHOW = "/action/package_show";
	
	protected static final Logger log = LogManager.getLogger(NationalHistoryMuseumAPI.class);
		
	/**
	 * Return a list of the names of the site’s datasets (packages).
	 * @return list of strings
	 * @see https://docs.ckan.org/en/latest/api/index.html#api-examples:~:text=logic.action.get-,%C2%B6,-API%20functions%20for
	 */
	public NHMPackageList packageList() {
		return packageList(NO_VALUE, NO_VALUE);
	}
	
	/**
	 * Return a list of the names of the site’s datasets (packages).
	 * @param limit (int) – if given, the list of datasets will be broken 
	 * into pages of at most limit datasets per page and only one page 
	 * will be returned at a time (optional)
	 * @param offset (int) – when limit is given, the offset to start 
	 * returning packages from
	 * @return list of strings
	 * @see https://docs.ckan.org/en/latest/api/index.html#api-examples:~:text=logic.action.get-,%C2%B6,-API%20functions%20for
	 */
	public NHMPackageList packageList(int limit, int offset) {
		NHMPackageList packageList= null;
		String url = URL_BASE + METHOD_PACKAGE_LIST;
		
		log.debug("URL: " + url);
		
		List<NameValuePair> params = new LinkedList<NameValuePair>();
		if(limit != NO_VALUE) {
			params.add(new BasicNameValuePair("limit", Integer.toString(limit)));	
		}
		if(offset != NO_VALUE) {
			params.add(new BasicNameValuePair("offset", Integer.toString(offset)));	
		}
		
		String result = get(url, null, params);
		if(result != null) {
			packageList = (NHMPackageList) jsonStringToObject(result, NHMPackageList.class);
		}		
		
		return packageList;
	}
	
	/**
	 * Return the metadata of a dataset (package) and its resources.
	 * 
	 * <strong>Parameters</strong>:
	 * @param id (string) – the id or name of the dataset
	 * <br></br>
	 * <strong>NOTE</strong>: Other parameter not supported in this implementation
	 * <br></br>
	 * <ul>
	 * 	<li>
	 * 		<strong>use_default_schema</strong> (bool) – use default 
	 * 		package schema instead of a custom schema defined with an IDatasetForm plugin (default: False)
	 * 	</li>
	 * 	<li>  
	 * 		<strong>include_tracking</strong> (bool) – add tracking 
	 * 		information to dataset and resources (default: False)
	 * 	</li>
	 * 	<li>  
	 * 		<strong>include_plugin_data</strong> – Include the internal plugin 
	 * 		data object (sysadmin only, optional, default:False)
	 * 	</li> 
	 * </ul>
	 * <strong>Type</strong>
	 * <strong>include_plugin_data</strong>: bool 
	 * @return dictionary
	 */
	public NHMPackageShow packageShow(String id) {
		NHMPackageShow resources= null;
		String url = URL_BASE + METHOD_PACKAGE_SHOW;
		
		log.debug("URL: " + url);
		
		List<NameValuePair> params = new LinkedList<NameValuePair>();
		params.add(new BasicNameValuePair("id", id));	
		
		String result = get(url, null, params);
		if(result != null) {
			resources = (NHMPackageShow) jsonStringToObject(result, NHMPackageShow.class);
		}		
		
		return resources;
	}
}
