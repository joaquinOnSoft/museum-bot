/**   
 *  (C) Copyright 2022 joaquinonsoft.com and others.
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
package com.joaquinonsoft.bot.museum;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.joaquinonsoft.bot.museum.met.pojo.MetMuseumObject;
import com.joaquinonsoft.bot.museum.pojo.MuseumAsset;
import com.joaquinonsoft.bot.museum.smithsonian.pojo.Medium;
import com.joaquinonsoft.bot.museum.smithsonian.pojo.Name;
import com.joaquinonsoft.bot.museum.smithsonian.pojo.Row;
import com.joaquinonsoft.bot.museum.victoriaandalbert.pojo.Record;
import com.joaquinonsoft.util.FileUtil;

public class MuseumAssetTransformer {
	private static final String LABEL_ARTIST = "Artist";

	protected static final Logger log = LogManager.getLogger(FileUtil.class);

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
		
		log.debug("MET asset: " + asset);
		
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
		
		log.debug("Smithsonian asset: " + asset);

		return asset;
	}	
	
	public static MuseumAsset toMusseumAsset(Record vaRecord) {
		MuseumAsset asset = null;
		
		if(vaRecord != null) {
			String author = null;
			String imageURL = null;
			
			if(vaRecord.getPrimaryMaker() != null) {
				author = vaRecord.getPrimaryMaker().getName();
			}
			
			if(vaRecord.getImages() != null) {
				imageURL = vaRecord.getImages().getPrimaryThumbnail();
			}
						
			asset = new MuseumAsset(
					vaRecord.getPrimaryTitle(),
					author,
					vaRecord.getPrimaryDate(),
					imageURL					
					);
		}
				
		log.debug("V&A asset: " + asset);
		
		return asset;
	}
	
}
