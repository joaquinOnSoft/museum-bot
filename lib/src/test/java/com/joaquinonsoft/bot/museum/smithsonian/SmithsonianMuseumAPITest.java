package com.joaquinonsoft.bot.museum.smithsonian;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.joaquinonsoft.bot.museum.smithsonian.pojo.SmithsonianCategorySearchContents;

public class SmithsonianMuseumAPITest {
	private static SmithsonianMuseumAPI api = null;
	
	@BeforeAll 
	public static void setup() {
		api = new SmithsonianMuseumAPI();
	}
		
	@Test
	public void categorySearch() {
		SmithsonianCategorySearchContents contents = 
				api.categorySearch(SmithsonianCategory.ART_DESING, "*", 2000);
		
		assertNotNull(contents);
		assertNotNull(contents.getResponse());
		assertNotNull(contents.getResponse().getRows());
		assertTrue(contents.getResponse().getRows().size() > 0);
		assertEquals("Fragment", contents.getResponse().getRows().get(0).getTitle());
		assertEquals("https://ids.si.edu/ids/deliveryService?id=CHSDM-77D0507FBB932-000001", 
				contents.getResponse().getRows().get(0).getContent()
					.getDescriptiveNonRepeating().getOnlineMedia()
					.getMedia().get(0).getThumbnail());
		assertEquals("1890s", 
				contents.getResponse().getRows().get(0).getContent()
					.getIndexedStructured().getDate().get(0));
	}
}
