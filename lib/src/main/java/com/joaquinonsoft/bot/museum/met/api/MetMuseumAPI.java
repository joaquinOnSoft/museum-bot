package com.joaquinonsoft.bot.museum.met.api;

import com.joaquinonsoft.bot.museum.met.pojo.MetMuseumObject;
import com.joaquinonsoft.bot.museum.met.pojo.MetMuseumObjects;
import com.joaquinonsoft.bot.net.AbstractAPIWrapper;

/**
 * <strong>Metropolitan Museum of Art Met Collection API</strong>
 * New York City's Metropolitan Museum of Art contains over 5000 
 * years of art from around the world in its collection. The 
 * Metropolitan Museum of Art Met Collection APITrack this API 
 * is a Public API released in 2018 that provides select datasets 
 * of information on more than 400,000 artworks for unrestricted 
 * commercial and non commercial use. The API provides access to 
 * all of the Met's Open Access data and to corresponding high 
 * resolution images.
 * 
 * @see https://metmuseum.github.io/#search
 * @author Joaquín Garzón
 */
public class MetMuseumAPI extends AbstractAPIWrapper{
	
	public static final String URL_BASE = "https://collectionapi.metmuseum.org/public";
	public static final String METHOD_OBJECTS = "/collection/v1/objects";
	
	/**
	 * Objects 
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
	
	/**
	 * Object
	 * <strong>GET<strong> 
	 * <pre>
	 * /public/collection/v1/objects/[objectID] 
	 * </pre>
	 * returns a record for an object, containing all open access data about that object, including its image (if the image is available under Open Access)
	 * */
	public MetMuseumObject object(int id) {
		MetMuseumObject metObject = null;
		
		String result = get(URL_BASE + METHOD_OBJECTS + "/" + id, null, null);
		if(result != null) {
			metObject = (MetMuseumObject) jsonStringToObject(result, MetMuseumObject.class);
		}
		
		return metObject;
	}	
	
}
