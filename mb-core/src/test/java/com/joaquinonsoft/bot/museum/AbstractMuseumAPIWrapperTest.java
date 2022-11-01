package com.joaquinonsoft.bot.museum;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.joaquinonsoft.bot.museum.pojo.MuseumAsset;

public abstract class AbstractMuseumAPIWrapperTest {
	protected static IMuseumAPIWrapper wrapper;
	
	@Test
	void getRandomAsset() {
		MuseumAsset asset = wrapper.getRandomAsset();
		assertNotNull(asset);
		assertNotNull(asset.getTitle());
		assertNotNull(asset.getArtistName());
	}
}
