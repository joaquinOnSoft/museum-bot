package com.joaquinonsoft.bot.museum.met.api;

import com.joaquinonsoft.bot.museum.met.pojo.MetMuseumObjects;
import com.joaquinonsoft.bot.net.AbstractAPIWrapper;

/**
 * The Metropolitan Museum of Art Collection API
 * @see https://metmuseum.github.io/#search
 * @author Joaquín Garzón
 */
public class MetMuseumAPI extends AbstractAPIWrapper{
	
	public static final String URL_BASE = "https://collectionapi.metmuseum.org/public";
	public static final String METHOD_OBJECTS = "/collection/v1/objects";
	/**
	 * <strong>GET<strong> 
	 * <pre>
	 * /public/collection/v1/objects
	 * </pre> returns a listing of all valid Object IDs available to use
	 */
	public MetMuseumObjects objects() {
		MetMuseumObjects metObjects = null;
		
		String result = get(URL_BASE + METHOD_OBJECTS, null, null);
		if(result != null) {
			metObjects = (MetMuseumObjects) jsonStringToObject(result, MetMuseumObjects.class);
		}
		
		return metObjects;
	}
}
