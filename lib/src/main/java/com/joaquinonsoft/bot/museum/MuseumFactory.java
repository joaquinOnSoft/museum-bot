package com.joaquinonsoft.bot.museum;

import com.joaquinonsoft.bot.net.AbstractAPIWrapper;

/**
 * @see Java 8 Factory Pattern y su implementación
 * https://www.arquitecturajava.com/java-8-factory-pattern-y-su-implementacion/
 **/
public class MuseumFactory {
	
    private static volatile MuseumFactory instance;

    private MuseumFactory() {
    }

    public static MuseumFactory getInstance(String value) {
        MuseumFactory result = instance;
        if (result != null) {
            return result;
        }
        synchronized(MuseumFactory.class) {
            if (instance == null) {
                instance = new MuseumFactory();
            }
            return instance;
        }
    }
    
    //public AbstractAPIWrapper getAPIWrapper
}
