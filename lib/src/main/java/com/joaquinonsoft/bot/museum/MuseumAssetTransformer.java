package com.joaquinonsoft.bot.museum;

import com.joaquinonsoft.bot.museum.met.pojo.MetMuseumObject;
import com.joaquinonsoft.bot.museum.pojo.MuseumAsset;
import com.joaquinonsoft.bot.museum.smithsonian.pojo.Medium;
import com.joaquinonsoft.bot.museum.smithsonian.pojo.Name;
import com.joaquinonsoft.bot.museum.smithsonian.pojo.Row;

public class MuseumAssetTransformer {
	private static final String LABEL_ARTIST = "Artist";

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
	
	public static MuseumAsset toMusseumAsset(Row smithsonianContent) {
		MuseumAsset asset = null;
		
		if(smithsonianContent != null) {
			
			String artistName = "", date = "", imageLink = "";
			
			if (smithsonianContent.getContent() != null) {
				if (smithsonianContent.getContent().getFreetext() != null) {

					if (smithsonianContent.getContent().getFreetext().getName() != null) {
						for(Name name: smithsonianContent.getContent().getFreetext().getName()) {
							if(name.getLabel() == LABEL_ARTIST) {
								artistName = name.getContent();
							}
						}
					}					
					
					if (smithsonianContent.getContent().getFreetext().getDate() != null) {
						date = smithsonianContent.getContent().getFreetext().getDate().get(0).getContent();
					}
				}
				
				if (smithsonianContent.getContent().getDescriptiveNonRepeating() != null &&
						smithsonianContent.getContent().getDescriptiveNonRepeating().getOnlineMedia() != null &&
						smithsonianContent.getContent().getDescriptiveNonRepeating().getOnlineMedia().getMedia() != null ) {

					Medium media = smithsonianContent.getContent()
							.getDescriptiveNonRepeating()
							.getOnlineMedia()
							.getMedia()
							.get(0);
					
					imageLink = media.getThumbnail();
				}
				
			}
			
			asset = new MuseumAsset(
					smithsonianContent.getTitle(),
					artistName,
					date,
					imageLink					
					);
		}
		
		return asset;
	}	
}
