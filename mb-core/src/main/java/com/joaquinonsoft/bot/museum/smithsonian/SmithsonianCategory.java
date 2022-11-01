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

/**
 * The category you are filtering against..
 * Valid values: 
 * 	 art_design, history_culture, science_technology
 * @author Joaquín Garzón
 */
public enum SmithsonianCategory {
	ART_DESING("art_design"), 
	HISTORY_CULTURE("history_culture"), 
	SCIENCE_TECHNOLOGY("science_technology");
	
	public final String category;
	
	private SmithsonianCategory(String category) {
        this.category = category;
    }	
	
	@Override 
	public String toString() { 
	    return this.category; 
	}	
}
