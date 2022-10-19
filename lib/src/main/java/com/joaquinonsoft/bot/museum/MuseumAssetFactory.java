package com.joaquinonsoft.bot.museum;

import com.joaquinonsoft.bot.museum.met.MetMuseumAPIWrapper;
import com.joaquinonsoft.bot.museum.smithsonian.SmithsonianMuseumAPIWrapper;
import com.joaquinonsoft.bot.museum.victoriaandalbert.VictoriaAndAlbertMuseumWrapper;
import com.joaquinonsoft.util.RandomUtil;

public class MuseumAssetFactory {
	
    /**
     * Provides a Museum API wrapper of the selected Museum
     * @param museum - Museum alias (enumeration value)
     * @return Museum API wrapper of the selected Museum
     */
    public static  IMuseumAPIWrapper getInstance(Museum museum) {
    	IMuseumAPIWrapper wrapper = null;
    	
    	switch(museum) {
    	case METROPOLITAN:
    		wrapper = new MetMuseumAPIWrapper();
    		break;
    	case SMITHSONIAN:
    		wrapper = new SmithsonianMuseumAPIWrapper();
    		break;
    	case VICTORIA_AND_ALBERT:
    		//Intentionally empty
    	default:
    		wrapper = new VictoriaAndAlbertMuseumWrapper();
    		break;
    	}
    	
    	return wrapper;
    }

    /**
     * Provides a random Museum API wrapper
     * @return random Museum API wrapper
     */
    public static  IMuseumAPIWrapper getInstance() {
    	return getInstance(getRandomMuseum());
    }
    
    protected static Museum getRandomMuseum() {
    	Museum museum = null;
    	int val = RandomUtil.nextInt(1, 3);
    	
    	switch (val) {
		case 1: 
			museum = Museum.METROPOLITAN;
			break;
		case 2: 
			museum = Museum.SMITHSONIAN;
			break;
		case 3: 
			//Intentionally empty
		default:
			museum = Museum.VICTORIA_AND_ALBERT;
			break;			
		}
    	
    	return museum;
    }
}
