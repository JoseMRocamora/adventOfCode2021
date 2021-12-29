package com.kblman.aoc.day7;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Calculate1Test {

	private static final Short[] INPUT = { 16,1,2,0,4,2,7,1,2,14 };
	private static final Integer OUTPUT = 37;

	
	private Calculate calculate1;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPart1() {
		calculate1 = new Calculate1(INPUT);
		
		Integer result = calculate1.calculate();

		assertEquals(OUTPUT, result);
	}

}
