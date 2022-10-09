package com.joaquinonsoft.bot.museum;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.joaquinonsoft.bot.museum.pojo.MuseumAsset;
import com.joaquinonsoft.bot.museum.met.pojo.MetMuseumObject;

public class MuseumAssetTransformerTest {
	@Test
	public void toMusseumAssetFromMet() {
		MetMuseumObject metObj = new MetMuseumObject();
		metObj.setTitle("Chandelier");
		metObj.setArtistDisplayName("");
		metObj.setObjectDate("1765–85");
		metObj.setPrimaryImage("https://images.metmuseum.org/CRDImages/ad/original/56568.jpg");
		
		MuseumAsset asset = MuseumAssetTransformer.toMusseumAsset(metObj);
		assertNotNull(asset);
		assertEquals("Chandelier", asset.getTitle());
		assertEquals("", asset.getArtistName());
		assertEquals("1765–85", asset.getDate());
		assertEquals("https://images.metmuseum.org/CRDImages/ad/original/56568.jpg", asset.getImageLink());
	}
}
