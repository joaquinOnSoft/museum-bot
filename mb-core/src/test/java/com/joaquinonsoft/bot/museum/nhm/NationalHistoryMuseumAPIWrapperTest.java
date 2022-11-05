package com.joaquinonsoft.bot.museum.nhm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.joaquinonsoft.bot.museum.pojo.MuseumAsset;

public class NationalHistoryMuseumAPIWrapperTest {
	private static NationalHistoryMuseumAPIWrapper wrapper = null;
	
	@BeforeAll
	public static void setup() {
		wrapper = new NationalHistoryMuseumAPIWrapper();
	}
	
	@Test
	public void getRandomAsset() {
		MuseumAsset asset = wrapper.getRandomAsset();
		
		assertNotNull(asset);
		assertNotNull(asset.getTitle());
		assertNotNull(asset.getArtistName());
		assertNotNull(asset.getDate());
		assertNotNull(asset.getImageLink());
		assertEquals(MuseumAsset.NHM, asset.getMuseum());
	
	}
}
