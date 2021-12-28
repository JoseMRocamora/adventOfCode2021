package com.kblman.aoc.day6;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Calculate1Test {

	private static Short[] INPUT = { 3,4,3,1,2 };
	private static Integer TOTAL_DAYS1 = 18;
	private static Integer TOTAL_DAYS2 = 80;
	
	private Calculate calculate1;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test1Part1() {
		calculate1 = new Calculate1(INPUT, TOTAL_DAYS1);
		
		long result = calculate1.calculate();

		assertEquals(26, result);
	}

	@Test
	public void test2Part1() {
		calculate1 = new Calculate1(INPUT, TOTAL_DAYS2);
		
		long result = calculate1.calculate();

		assertEquals(5934, result);
	}
	
}
