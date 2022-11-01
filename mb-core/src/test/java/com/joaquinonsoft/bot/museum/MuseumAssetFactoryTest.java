package com.joaquinonsoft.bot.museum;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.joaquinonsoft.bot.museum.met.MetMuseumAPIWrapper;
import com.joaquinonsoft.bot.museum.smithsonian.SmithsonianMuseumAPIWrapper;
import com.joaquinonsoft.bot.museum.victoriaandalbert.VictoriaAndAlbertMuseumWrapper;

public class MuseumAssetFactoryTest {
	
	@Test
	public void getInstance() {
		IMuseumAPIWrapper wrapper = MuseumAssetFactory.getInstance();
		
		assertNotNull(wrapper);
	}

	@Test
	public void getInstanceWithParam() {
		IMuseumAPIWrapper wrapper = MuseumAssetFactory.getInstance(Museum.SMITHSONIAN);
		
		assertNotNull(wrapper);
		assertTrue(wrapper instanceof SmithsonianMuseumAPIWrapper);
		
		for(Museum m: Museum.values()) {
			switch (m) {
			case METROPOLITAN:
				wrapper = MuseumAssetFactory.getInstance(Museum.METROPOLITAN);
				assertTrue(wrapper instanceof MetMuseumAPIWrapper);
				break;
			case SMITHSONIAN:
				wrapper = MuseumAssetFactory.getInstance(Museum.SMITHSONIAN);
				assertTrue(wrapper instanceof SmithsonianMuseumAPIWrapper);
				break;
			case VICTORIA_AND_ALBERT:
				wrapper = MuseumAssetFactory.getInstance(Museum.VICTORIA_AND_ALBERT);
				assertTrue(wrapper instanceof VictoriaAndAlbertMuseumWrapper);
				break;
			default:
				fail("Unsupported Museum: " + m);
			}
		}
	}
}
