package com.joaquinonsoft.bot.museum.nhm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.joaquinonsoft.bot.museum.nhm.pojo.NHMPackageShow;
import com.joaquinonsoft.bot.museum.nhm.pojo.packagelist.NHMPackageList;

public class NationalHistoryMuseumAPITest {
	NationalHistoryMuseumAPI api = null;
	
	@BeforeAll
	public void setup() {
		api = new NationalHistoryMuseumAPI();
	}
	
	@Test
	public void packageList() {
		NHMPackageList packages = api.packageList();
		
		assertNotNull(packages);
		assertEquals(true, packages.getSuccess());
		assertNotNull(packages.getResult());
		assertTrue(packages.getResult().size() > 0);
		assertTrue(packages.getResult().contains("african-spiny-solanum"));
	}
	
	@Test
	public void packageShow() {
		NHMPackageShow packages = api.packageShow("beetle-drawer-scans");
		
		assertNotNull(packages);
		assertEquals(true, packages.getSuccess());
		assertNotNull(packages.getResult());
		assertNotNull(packages.getResult().getResources());
		assertTrue(packages.getResult().getResources().size() > 0);
		assertNotNull(packages.getResult().getResources().get(0).getName());
		assertNotNull(packages.getResult().getResources().get(0).getUrl());
	}	
}
