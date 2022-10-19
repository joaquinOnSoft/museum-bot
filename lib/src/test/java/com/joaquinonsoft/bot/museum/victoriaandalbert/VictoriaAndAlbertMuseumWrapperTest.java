package com.joaquinonsoft.bot.museum.victoriaandalbert;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.joaquinonsoft.bot.museum.AbstractMuseumAPIWrapperTest;

public class VictoriaAndAlbertMuseumWrapperTest extends AbstractMuseumAPIWrapperTest{	
	@BeforeAll 
	public static void setup() {
		wrapper = new VictoriaAndAlbertMuseumWrapper();
	}
	
	@Test
	public void resizeImageLink() {
		final String url = "https://framemark.vam.ac.uk/collections/2013GT0973/full/!100,100/0/default.jpg";
		String imgURLResized = ((VictoriaAndAlbertMuseumWrapper) wrapper).resizeImageLink(url);
		assertEquals("https://framemark.vam.ac.uk/collections/2013GT0973/full/!600,600/0/default.jpg", imgURLResized);
	}
}
;