package com.joaquinonsoft.bot.museum;

import com.joaquinonsoft.bot.museum.met.pojo.MetMuseumObject;
import com.joaquinonsoft.bot.museum.pojo.MuseumAsset;

public class MuseumAssetTransformer {
	public static MuseumAsset toMusseumAsset(MetMuseumObject metObj) {
		MuseumAsset asset = null;
		
		if(metObj != null) {
			asset = new MuseumAsset(
					metObj.getTitle(),
					metObj.getArtistDisplayName(),
					metObj.getObjectDate(),
					metObj.getPrimaryImage()
					
					);
		}
		
		return asset;
	}
}
