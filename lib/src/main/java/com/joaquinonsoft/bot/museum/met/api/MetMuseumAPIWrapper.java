package com.joaquinonsoft.bot.museum.met.api;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.joaquinonsoft.bot.museum.IMuseumAPIWrapper;
import com.joaquinonsoft.bot.museum.MuseumAssetTransformer;
import com.joaquinonsoft.bot.museum.met.pojo.MetMuseumObject;
import com.joaquinonsoft.bot.museum.met.pojo.MetMuseumObjects;
import com.joaquinonsoft.bot.museum.pojo.MuseumAsset;
import com.joaquinonsoft.util.RandomUtil;

public class MetMuseumAPIWrapper implements IMuseumAPIWrapper{

	private MetMuseumAPI api;
	
	protected static final Logger log = LogManager.getLogger(MetMuseumAPIWrapper.class);
	
	
	public MetMuseumAPIWrapper(){
		api = new MetMuseumAPI();
	}
	
	@Override
	public MuseumAsset getRandomAsset() {
		MuseumAsset asset = null;
		MetMuseumObject metObject = null;
		
		MetMuseumObjects metObjects = api.objects();
		if(metObjects != null) {
			int totalAssets = metObjects.getTotal();
			
			int id = -1; 
			boolean validId = false;
			
			do {
				id= RandomUtil.nextInt(1, totalAssets);
				log.debug("Random id generated: ", id);
				
				//NOTE: not all the ids between 1 and totalAssets are contained in the list
				validId = metObjects.getObjectIDs().contains(id);
			} while(!validId);
			
			metObject = api.object(id);
			
			if(metObject != null) {
				asset = MuseumAssetTransformer.toMusseumAsset(metObject);
			}
		}
		
		
		return asset;
	}

}
