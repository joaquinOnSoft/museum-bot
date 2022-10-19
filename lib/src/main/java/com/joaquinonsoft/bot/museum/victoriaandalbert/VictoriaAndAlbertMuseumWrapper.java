package com.joaquinonsoft.bot.museum.victoriaandalbert;

import com.joaquinonsoft.bot.museum.IMuseumAPIWrapper;
import com.joaquinonsoft.bot.museum.MuseumAssetTransformer;
import com.joaquinonsoft.bot.museum.pojo.MuseumAsset;
import com.joaquinonsoft.bot.museum.victoriaandalbert.pojo.Record;
import com.joaquinonsoft.bot.museum.victoriaandalbert.pojo.VictoriaAndAlbertRecords;
import com.joaquinonsoft.util.RandomUtil;

public class VictoriaAndAlbertMuseumWrapper implements IMuseumAPIWrapper {
	private VictoriaAndAlbertMusumAPI api = null;
	
	public VictoriaAndAlbertMuseumWrapper() {
		api = new VictoriaAndAlbertMusumAPI();
	}
	
	/**
	 * Provides a random asset from the Victoria & Albert Museum catalog
	 */
	@Override
	public MuseumAsset getRandomAsset() {
		MuseumAsset asset = null;
		 
		VictoriaAndAlbertRecords records = api.search(QUERY_ALL);
		if(records != null) {
			if(records.getInfo() != null) {
				int pageSize = records.getInfo().getPageSize();
				int numPages = records.getInfo().getPages();
				
				int randomPage =  RandomUtil.nextInt(1, numPages);
				int randomItem =  RandomUtil.nextInt(0, pageSize - 1);
								
				records = api.search(QUERY_ALL, randomPage, pageSize);
				if(records != null) {
					if(records.getRecords() != null && 
							records.getRecords().size() >= randomItem) {
						
						Record record = records.getRecords().get(randomItem);
						
						if(record != null) {
							asset = MuseumAssetTransformer.toMusseumAsset(record);
						}
					}
				}
			}
		}
			
		return asset;
	}

}