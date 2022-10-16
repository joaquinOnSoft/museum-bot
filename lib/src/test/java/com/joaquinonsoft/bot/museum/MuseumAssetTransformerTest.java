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
	}
}
