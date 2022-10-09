package com.joaquinonsoft.util;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class RandomUtilTest {
	@Test
	public void nextInt() {
		int num;
		for(int i=0; i< 100; i++) {
			num = RandomUtil.nextInt(1, 10000);
			assertTrue(num >= 1);
			assertTrue(num <= 10000);
		}
	}
}
