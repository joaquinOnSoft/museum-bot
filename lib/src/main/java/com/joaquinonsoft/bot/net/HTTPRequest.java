package com.joaquinonsoft.bot.net;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HTTPRequest {
	
	private String urlBase;

	protected static final Logger log = LogManager.getLogger(HTTPRequest.class);

	public HTTPRequest(String urlBase) {
		this.urlBase = urlBase;
	}
	
	public void get() throws IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault();

        try {

            HttpGet request = new HttpGet("https://httpbin.org/get");

            // add request headers
            request.addHeader("custom-key", "mkyong");
            request.addHeader(HttpHeaders.USER_AGENT, "Googlebot");

            CloseableHttpResponse response = httpClient.execute(request);

            try {

                // Get HttpResponse Status
            	log.info(response.getProtocolVersion());              // HTTP/1.1
            	log.info(response.getStatusLine().getStatusCode());   // 200
            	log.info(response.getStatusLine().getReasonPhrase()); // OK
            	log.info(response.getStatusLine().toString());        // HTTP/1.1 200 OK

                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    // return it as a String
                    String result = EntityUtils.toString(entity);
                    System.out.println(result);
                }

            } finally {
                response.close();
            }
        } finally {
            httpClient.close();
        }
	}
}
