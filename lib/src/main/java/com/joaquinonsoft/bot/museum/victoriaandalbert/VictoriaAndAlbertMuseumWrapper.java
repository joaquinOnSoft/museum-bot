package com.joaquinonsoft.bot.museum.victoriaandalbert;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.joaquinonsoft.bot.museum.IMuseumAPIWrapper;
import com.joaquinonsoft.bot.museum.MuseumAssetTransformer;
import com.joaquinonsoft.bot.museum.pojo.MuseumAsset;
import com.joaquinonsoft.bot.museum.victoriaandalbert.pojo.Record;
import com.joaquinonsoft.bot.museum.victoriaandalbert.pojo.VictoriaAndAlbertRecords;
import com.joaquinonsoft.util.RandomUtil;

public class VictoriaAndAlbertMuseumWrapper implements IMuseumAPIWrapper {
	
	protected static final Logger log = LogManager.getLogger(VictoriaAndAlbertMuseumWrapper.class);
	
	private static final String IMG_SIZE_600_600 = "600,600";
	
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
							
							String imgLink = asset.getImageLink();
							asset.setImageLink(resizeImageLink(imgLink));
						}
					}
				}
			}
		}
			
		return asset;
	}

	protected String resizeImageLink(String imgLink) {
		String link = null;
		
		if(imgLink != null) {
			link = imgLink.replace("100,100", IMG_SIZE_600_600);
			
			log.debug("Image link resized: " + link);
		}
		
		return link;
	}
}