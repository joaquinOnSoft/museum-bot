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
package com.joaquinonsoft.bot.museum.smithsonian;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.joaquinonsoft.bot.museum.pojo.MuseumAsset;

class SmithsonianMuseumAPIWrapperTest {
	private static SmithsonianMuseumAPIWrapper wrapper;
	
	@BeforeAll 
	public static void setup() {
		wrapper = new SmithsonianMuseumAPIWrapper();
	}
	
	
	@Test
	void getRandomAsset() {
		MuseumAsset asset = wrapper.getRandomAsset();
		assertNotNull(asset);
		assertNotNull(asset.getTitle());
		assertNotNull(asset.getArtistName());
	}
	
	@Test
	void getRandomCategory() {
		SmithsonianCategory cat = wrapper.getRandomCategory();
		
		assertNotNull(cat);
		assertTrue(cat == SmithsonianCategory.ART_DESING ||
				cat == SmithsonianCategory.HISTORY_CULTURE ||
				cat == SmithsonianCategory.SCIENCE_TECHNOLOGY);
	}

}
