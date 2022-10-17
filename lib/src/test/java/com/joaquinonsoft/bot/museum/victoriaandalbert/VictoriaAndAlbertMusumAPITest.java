package com.joaquinonsoft.bot.museum.victoriaandalbert;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.joaquinonsoft.bot.museum.victoriaandalbert.pojo.VictoriaAndAlbertRecords;


public class VictoriaAndAlbertMusumAPITest {
	private static VictoriaAndAlbertMusumAPI wrapper;
	
	@BeforeAll 
	public static void setup() {
		wrapper = new VictoriaAndAlbertMusumAPI();
	}
		
	
	@Test
	public void search() {
		wrapper = new VictoriaAndAlbertMusumAPI();
		VictoriaAndAlbertRecords records = wrapper.search("*");
		
		assertNotNull(records);
		assertNotNull(records.getRecords());
		assertTrue(records.getRecords().size() > 0);
		assertEquals("", records.getRecords().get(0).getPrimaryTitle());
		assertNotNull(records.getRecords().get(0).getPrimaryMaker());
		assertEquals("Louis Gunnis", records.getRecords().get(0).getPrimaryMaker().getName());
		assertNotNull(records.getRecords().get(0).getImages());
		assertEquals("https://framemark.vam.ac.uk/collections/2013GT0973/full/!100,100/0/default.jpg", records.getRecords().get(0).getImages().getPrimaryThumbnail());
	}
}
