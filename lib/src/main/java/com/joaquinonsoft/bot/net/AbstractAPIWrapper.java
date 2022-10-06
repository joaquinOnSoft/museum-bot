/*
 *   (C) Copyright 2022 JoaquinOnSoft.com and others.
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
package com.joaquinonsoft.bot.net;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Joaquín Garzón
 * @since 20.2
 */
public abstract class AbstractAPIWrapper {

	/**
	 * The HTTP 200 OK success status response code indicates that the request has succeeded. 
	 * A 200 response is cacheable by default.
	 * 
	 * The meaning of a success depends on the HTTP request method:
	 * <ul>
	 *    <li>
	 *       <strong>GET</strong>: The resource has been fetched and is transmitted in the message body.
	 *    </li>
	 *    <li>
	 *       <strong>HEAD</strong>: The representation headers are included in the response without any message body
	 *    </li>
	 *    <li>
	 *       <strong>POST</strong>: The resource describing the result of the action is transmitted in the message body
	 *    </li>
	 *    <li>
	 *       <strong>TRACE</strong>: The message body contains the request message as received by the server.
	 *    </li>
	 * </ul>
	 * */
	private static int HTTP_RESPONSE_CODE_OK = 200;
	
	/**
	 * The HyperText Transfer Protocol (HTTP) 202 Accepted response status code indicates that 
	 * the request has been accepted for processing, but the processing has not been completed; 
	 * in fact, processing may not have started yet. The request might or might not eventually 
	 * be acted upon, as it might be disallowed when processing actually takes place.
	 * */
	private static int HTTP_RESPONSE_ACCEPTED = 202;	
	
	protected static final Logger log = LogManager.getLogger(AbstractAPIWrapper.class);

	protected CloseableHttpClient client;
	
	public AbstractAPIWrapper() {
		this.client = HttpClients.createDefault();	
	}

	/**
	 * SEE: Apache HttpClient Examples
	 * https://mkyong.com/java/apache-httpclient-examples/
	 * @param request
	 * @return
	 */
	protected String execute(HttpRequestBase request) {
		String result = null;
		CloseableHttpResponse response = null;

		CloseableHttpClient httpClient = HttpClients.createDefault();
				
		try {			
			response = httpClient.execute(request);

			// Get HttpResponse Status
			log.debug(response.getProtocolVersion());              // HTTP/1.1
			log.debug(response.getStatusLine().getStatusCode());   // 200
			log.debug(response.getStatusLine().getReasonPhrase()); // OK
			log.debug(response.getStatusLine().toString());        // HTTP/1.1 200 OK

			HttpEntity entity = response.getEntity();
			if (entity != null && 
					(response.getStatusLine().getStatusCode() == HTTP_RESPONSE_CODE_OK ||  
					response.getStatusLine().getStatusCode() == HTTP_RESPONSE_ACCEPTED) ) {
				// return it as a String
				result = EntityUtils.toString(entity);
				log.info(result);
			}

		} 
		catch (IOException e) {
			log.error(e.toString());
		}
		finally {
			try {
				if(response != null) {
					response.close();
				}
				//httpClient.close();
			}
			catch(IOException e) {
				log.error(e.toString());				
			}
		}

		return result;
	}

	

	/**
	 * HTTP GET request
	 * @param url - API's URL method
	 * @return response from server (usually in JSON format)
	 */
	protected String get(String url, List<NameValuePair> headers, List<NameValuePair> params) {
		String result = null;
	
		try {			
			HttpGet httpGet = new HttpGet(url);
			
			if(headers != null) {
				for(NameValuePair pair: headers) {
					httpGet.addHeader(pair.getName(), pair.getValue());
				}
			}
			
			if(params != null) {
				URI uri = new URIBuilder(httpGet.getURI())
					      .addParameters(params)
					      .build();
				
				((HttpRequestBase) httpGet).setURI(uri);
			}
	
			result = execute(httpGet);					
		} catch (ParseException | URISyntaxException e) {
			log.error("API " + url + " (Parse) ", e);
		}
		
		return result;
	}

	/**
	 * HTTP POST request
	 * @param url - API's URL method
	 * @param entities - Key/value
	 * @return
	 * @see https://www.baeldung.com/httpclient-post-http-request
	 */
	protected String post(String url, List<NameValuePair> headers, List<HttpEntity> entities) {
		String result = null;
	
		try {
			HttpPost httpPost = new HttpPost(url);
			if(headers != null) {
				for(NameValuePair pair: headers) {
					httpPost.addHeader(pair.getName(), pair.getValue());
				}
			}
	
			if(entities != null) {
				for(HttpEntity entity: entities) {
					httpPost.setEntity(entity);	
				}
			}
	
			result = execute(httpPost);	
		} catch (ParseException e) {
			log.error("API " + url + " (Parse) ", e);
		}
		
		return result;
	}
	

	protected Object jsonStringToObject(String json, Class<?> toClass) {
		if(json == null) {
			return null;	
		}
		else {		
			// Jackson 2 - Convert Java Object to / from JSON
			// https://www.mkyong.com/java/jackson-2-convert-java-object-to-from-json/
			Object obj = null;

			ObjectMapper mapper = new ObjectMapper();
			//JSON string to Java Object
			try {
				obj = mapper.readValue(json.toString(), toClass);
			} catch (IOException e) {
				log.warn("API response (JSON Str to Object): " + e.getMessage(), e);
				return null;
			}
			return obj;
		}
	}
	
	protected void finalize() throws Throwable {  
		if (client != null) {
			client.close();
		}
	}	
}