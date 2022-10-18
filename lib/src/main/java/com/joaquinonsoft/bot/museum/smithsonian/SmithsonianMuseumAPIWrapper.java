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
package com.joaquinonsoft.bot.museum.smithsonian;

import com.joaquinonsoft.bot.museum.IMuseumAPIWrapper;
import com.joaquinonsoft.bot.museum.MuseumAssetTransformer;
import com.joaquinonsoft.bot.museum.pojo.MuseumAsset;
import com.joaquinonsoft.bot.museum.smithsonian.pojo.Row;
import com.joaquinonsoft.bot.museum.smithsonian.pojo.SmithsonianCategorySearchContents;
import com.joaquinonsoft.util.RandomUtil;

public class SmithsonianMuseumAPIWrapper implements IMuseumAPIWrapper {

	private static final int PAGE_SIZE = 10;
	
	@Override
	public MuseumAsset getRandomAsset() {
		MuseumAsset asset = null;
		SmithsonianCategory cat = getRandomCategory();
		
		SmithsonianMuseumAPI api = new SmithsonianMuseumAPI();
		SmithsonianCategorySearchContents contents = api.categorySearch(cat, QUERY_ALL);
		if(contents != null && contents.getResponse() != null) {
			int numRows = contents.getResponse().getRowCount();
			if(numRows > 0) {
				int index = RandomUtil.nextInt(0, numRows - 1);
				
				Row row = null;
				
				if(index >= PAGE_SIZE) {					
					contents = api.categorySearch(cat, QUERY_ALL, index);
					if(contents != null && contents.getResponse() != null
							&& contents.getResponse().getRows() != null 
							&& contents.getResponse().getRows().size() > 0) {
						row = contents.getResponse().getRows().get(0);
					}
				}
				else {
					row = contents.getResponse().getRows().get(index);
				}
				
				if(row != null) {
					asset = MuseumAssetTransformer.toMusseumAsset(row);
				}

			}				
		}
		
		return asset;
	}
	
	/**
	 * Generates the category you are gonna filter against.
	 * Valid values: art_design, history_culture, science_technology
	 * @return art_design, history_culture or science_technology
	 */
	protected SmithsonianCategory getRandomCategory() {
		SmithsonianCategory cat = null;
		
		int i = RandomUtil.nextInt(0, 2);
		switch(i) {
		case 0:
			cat = SmithsonianCategory.ART_DESING;
			break;
		case 1:
			cat = SmithsonianCategory.HISTORY_CULTURE;
			break;
		case 2:
			//Intentionally empty
		default:
			cat = SmithsonianCategory.SCIENCE_TECHNOLOGY;			
			break;			
		}
		return cat; 
	}

}
