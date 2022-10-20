package com.joaquinonsoft.bot.museum.nhm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.joaquinonsoft.bot.museum.nhm.pojo.packagelist.NHMPackageList;

public class NationalHistoryMuseumAPITest {
	@Test
	public void objects() {
		NationalHistoryMuseumAPI metAPI = new NationalHistoryMuseumAPI();
		NHMPackageList packages = metAPI.packageList();
		
		assertNotNull(packages);
		assertEquals(true, packages.getSuccess());
		assertNotNull(packages.getResult());
		assertTrue(packages.getResult().size() > 0);
		assertTrue(packages.getResult().contains("african-spiny-solanum"));
	}
}
