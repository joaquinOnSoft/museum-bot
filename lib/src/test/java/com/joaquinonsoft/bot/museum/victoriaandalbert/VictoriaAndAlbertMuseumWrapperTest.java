package com.joaquinonsoft.bot.museum.victoriaandalbert;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.joaquinonsoft.bot.museum.pojo.MuseumAsset;
import com.joaquinonsoft.bot.museum.smithsonian.VictoriaAndAlbertMuseumWrapper;

public class VictoriaAndAlbertMuseumWrapperTest {
	private static VictoriaAndAlbertMuseumWrapper wrapper;
	
	@BeforeAll 
	public static void setup() {
		wrapper = new VictoriaAndAlbertMuseumWrapper();
	}
	
	@Test
	public void search() {
		MuseumAsset asset = wrapper.getRandomAsset();
		assertNotNull(asset);
		assertNotNull(asset.getTitle());
		assertNotNull(asset.getArtistName());
		assertNotNull(asset.getDate());
		assertNotNull(asset.getImageLink());
	}
}
;