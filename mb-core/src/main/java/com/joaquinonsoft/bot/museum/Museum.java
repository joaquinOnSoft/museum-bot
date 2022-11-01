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

/**
 * Enumeration of all the supported museum
 * <ul>
 * 		<li>Metropolitan Museum of Art </li>
 * 		<li>Smithsonian Institution  </li>
 * 		<li>Victoria & Albert Museum </li>
 * </ul>
 * @author Joaquín Garzón
 */
public enum Museum {
	METROPOLITAN("Metropolitan"), 
	SMITHSONIAN("Smithsonian"), 
	VICTORIA_AND_ALBERT("V&A");
	
	public final String name;
	
	private Museum(String name) {
        this.name = name;
    }	
	
	@Override 
	public String toString() { 
	    return this.name; 
	}	
}
