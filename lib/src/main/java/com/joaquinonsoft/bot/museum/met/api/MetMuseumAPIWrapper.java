package com.joaquinonsoft.bot.museum.met.api;

import com.joaquinonsoft.bot.museum.IMuseumAPIWrapper;
import com.joaquinonsoft.bot.museum.met.pojo.MetMuseumObject;
import com.joaquinonsoft.bot.museum.met.pojo.MetMuseumObjects;
import com.joaquinonsoft.bot.museum.pojo.MuseumAsset;
import com.joaquinonsoft.util.RandomUtil;

public class MetMuseumAPIWrapper implements IMuseumAPIWrapper{

	private MetMuseumAPI api;
	
	public MetMuseumAPIWrapper(){
		api = new MetMuseumAPI();
	}
	
	@Override
	public MuseumAsset getRandomAsset() {
		MetMuseumObjects metObjects = api.objects();
		if(metObjects != null) {
			int totalAssets = metObjects.getTotal();
			
			int id = RandomUtil.nextInt(1, totalAssets);
			MetMuseumObject metObject = api.object(id);
		}
		
		return null;
	}

}
