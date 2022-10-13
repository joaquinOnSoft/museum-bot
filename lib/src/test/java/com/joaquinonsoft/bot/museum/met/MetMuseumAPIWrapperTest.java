package com.joaquinonsoft.bot.museum.met;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.joaquinonsoft.bot.museum.met.MetMuseumAPIWrapper;
import com.joaquinonsoft.bot.museum.pojo.MuseumAsset;

public class MetMuseumAPIWrapperTest {
	
	@Test
	public void getRandomAsset() {
		MetMuseumAPIWrapper wrapper = new MetMuseumAPIWrapper();
		MuseumAsset asset = wrapper.getRandomAsset();
		assertNotNull(asset);
		assertNotNull(asset.getTitle());
		assertNotNull(asset.getArtistName());
	}
}
