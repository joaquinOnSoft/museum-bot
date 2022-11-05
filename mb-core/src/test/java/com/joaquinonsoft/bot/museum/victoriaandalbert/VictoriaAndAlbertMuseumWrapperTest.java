package com.joaquinonsoft.bot.museum.victoriaandalbert;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.joaquinonsoft.bot.museum.AbstractMuseumAPIWrapperTest;
import com.joaquinonsoft.bot.museum.pojo.MuseumAsset;

public class VictoriaAndAlbertMuseumWrapperTest extends AbstractMuseumAPIWrapperTest{	
	@BeforeAll 
	public static void setup() {
		wrapper = new VictoriaAndAlbertMuseumWrapper();
	}
	
	@Test
	void getRandomAssetWithImgLinkResized() {
		MuseumAsset asset = wrapper.getRandomAsset();
		assertNotNull(asset);
		String imgLink = asset.getImageLink();
		assertNotNull(imgLink);
		assertTrue(imgLink.contains("600,600"));
		assertEquals(MuseumAsset.VICTORIA_AND_ALBERT_MUSEUM, asset.getMuseum());
	}	
	
	@Test
	public void resizeImageLink() {
		final String url = "https://framemark.vam.ac.uk/collections/2013GT0973/full/!100,100/0/default.jpg";
		String imgURLResized = ((VictoriaAndAlbertMuseumWrapper) wrapper).resizeImageLink(url);
		assertEquals("https://framemark.vam.ac.uk/collections/2013GT0973/full/!600,600/0/default.jpg", imgURLResized);
	}
}
;