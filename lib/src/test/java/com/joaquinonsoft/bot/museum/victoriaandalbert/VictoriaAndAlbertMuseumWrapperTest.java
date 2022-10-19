package com.joaquinonsoft.bot.museum.victoriaandalbert;

import org.junit.jupiter.api.BeforeAll;
import com.joaquinonsoft.bot.museum.AbstractMuseumAPIWrapperTest;

public class VictoriaAndAlbertMuseumWrapperTest extends AbstractMuseumAPIWrapperTest{	
	@BeforeAll 
	public static void setup() {
		wrapper = new VictoriaAndAlbertMuseumWrapper();
	}
}
;