package com.joaquinonsoft.bot.museum.publisher;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.joaquinonsoft.bot.museum.pojo.MuseumAsset;

public class PublisherTwitterTest {
	static MuseumAsset asset = null;
	static PublisherTwitter publisher = null;
	
	@BeforeAll
	public static void setup() {
		asset = new MuseumAsset(
				"Thomas Alva Edison",
				"Underwood & Underwood, active 1880 - c. 1950", 
				"c. 1915", 
				"https://ids.si.edu/ids/deliveryService?id=NPG-NPG_81_84Edison-000001", 
				MuseumAsset.SMITHSONIAN
				);
		
		publisher = new PublisherTwitter();
	}
	
	@Test
	public void generateTmpFile() {
		File f = publisher.generateTmpFile("png");
 		assertNotNull(f);
 		assertTrue(Files.isDirectory(Paths.get(f.getParent())));
	}
	
	@Test
	public void toStatusMessage() {
		final String expectedMsg = "Thomas Alva Edison\n"
				+ "Underwood & Underwood, active 1880 - c. 1950\n"
				+ "(c. 1915)\n"
				+ "Smithsonian Institution";
		
		String msg = publisher.toStatusMessage(asset);
		
		assertNotNull(msg);
		assertEquals(expectedMsg, msg);
	}
	
	@Test
	public void publish() {
		fail("TODO - implement");
	}

}
