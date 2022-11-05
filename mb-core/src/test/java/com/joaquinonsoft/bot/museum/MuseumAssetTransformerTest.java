/**
 *   (C) Copyright 2021 OpenText and others.
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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.joaquinonsoft.bot.museum.pojo.MuseumAsset;
import com.joaquinonsoft.bot.museum.met.pojo.MetMuseumObject;
import com.joaquinonsoft.bot.museum.victoriaandalbert.pojo.Images;
import com.joaquinonsoft.bot.museum.victoriaandalbert.pojo.PrimaryMaker;
import com.joaquinonsoft.bot.museum.victoriaandalbert.pojo.Record;


public class MuseumAssetTransformerTest {
	@Test
	public void toMusseumAssetFromMet() {
		MetMuseumObject metObj = new MetMuseumObject();
		metObj.setTitle("Chandelier");
		metObj.setArtistDisplayName("");
		metObj.setObjectDate("1765–85");
		metObj.setPrimaryImage("https://images.metmuseum.org/CRDImages/ad/original/56568.jpg");
		
		MuseumAsset asset = MuseumAssetTransformer.toMusseumAsset(metObj);
		assertNotNull(asset);
		assertEquals("Chandelier", asset.getTitle());
		assertEquals("", asset.getArtistName());
		assertEquals("1765–85", asset.getDate());
		assertEquals("https://images.metmuseum.org/CRDImages/ad/original/56568.jpg", asset.getImageLink());
		assertEquals(MuseumAsset.MET, asset.getMuseum());
	}
	
	@Test
	public void toMusseumAssetFromVictoriaAndAlbertMuseum() {
		Record vaRecored = new Record();
		PrimaryMaker maker = new PrimaryMaker();
		maker.setName("Rose Emma Drummond");
		vaRecored.setPrimaryMaker(maker);
		vaRecored.setPrimaryTitle("Miss. Margaret Taylor ");;
		vaRecored.setPrimaryDate("1819");
		Images imgs = new Images();
		imgs.setPrimaryThumbnail("https://framemark.vam.ac.uk/collections/2013GU9998/full/!100,100/0/default.jpg");
		vaRecored.setImages(imgs);
		
		MuseumAsset asset = MuseumAssetTransformer.toMusseumAsset(vaRecored);
		assertNotNull(asset);
		assertEquals("Miss. Margaret Taylor ", asset.getTitle());
		assertEquals("Rose Emma Drummond", asset.getArtistName());
		assertEquals("1819", asset.getDate());
		assertEquals("https://framemark.vam.ac.uk/collections/2013GU9998/full/!100,100/0/default.jpg", 
				asset.getImageLink());
		assertEquals(MuseumAsset.VICTORIA_AND_ALBERT_MUSEUM, asset.getMuseum());
	}	
}
