package com.joaquinonsoft.util;

import java.util.concurrent.ThreadLocalRandom;

public class RandomUtil {
	/**
	 * Generate random integers within a specific range 
	 * @see https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
	 **/
	public int nextInt(int min, int max) {
		return ThreadLocalRandom.current().nextInt(min, max + 1);
	}
}
