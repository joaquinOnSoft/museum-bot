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
package com.joaquinonsoft.bot.museum.met;

import org.junit.jupiter.api.Test;

import com.joaquinonsoft.bot.museum.met.pojo.MetMuseumObject;
import com.joaquinonsoft.bot.museum.met.pojo.MetMuseumObjects;

import static org.junit.jupiter.api.Assertions.*;

public class MetMuseumAPITest {
	@Test
	public void objects() {
		MetMuseumAPI metAPI = new MetMuseumAPI();
		MetMuseumObjects metObjects = metAPI.objects();
		
		assertNotNull(metObjects);
		assertTrue(metObjects.getTotal() > 0);
		assertEquals(metObjects.getTotal(), metObjects.getObjectIDs().size());
	}
	
	@Test
	public void object() {
		MetMuseumAPI metAPI = new MetMuseumAPI();
		MetMuseumObject metObject = metAPI.object(890905);
		
		assertNotNull(metObject);
		assertEquals("Emma Juch, from the Actresses series (N253-A) issued by P. Lorillard Company to promote Tiger Fine Cut Tobacco", metObject.getTitle());
		assertEquals("P. Lorillard Company", metObject.getArtistDisplayName());
		assertEquals("1880s", metObject.getObjectDate());
		assertEquals("", metObject.getPrimaryImage());
	}	
}
