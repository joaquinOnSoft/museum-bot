package com.joaquinonsoft.bot.museum.victoriaandalbert;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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
		assertEquals("", records.getRecords().get(0).getPrimaryTitle());
	}
}
