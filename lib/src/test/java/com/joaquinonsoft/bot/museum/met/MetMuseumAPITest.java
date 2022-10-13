package com.joaquinonsoft.bot.museum.met;

import org.junit.jupiter.api.Test;

import com.joaquinonsoft.bot.museum.met.MetMuseumAPI;
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
