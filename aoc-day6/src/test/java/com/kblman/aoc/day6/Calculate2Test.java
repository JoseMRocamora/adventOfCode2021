package com.kblman.aoc.day6;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Calculate2Test {

	private static Short[] INPUT = { 3,4,3,1,2 };
	private static Integer TOTAL_DAYS1 = 18;
	private static Integer TOTAL_DAYS2 = 80;
	private static Integer TOTAL_DAYS3 = 256;
	
	private Calculate calculate2;

	@Test
	public void test1Part2() {
		calculate2 = new Calculate2(INPUT, TOTAL_DAYS1);
		
		long result = calculate2.calculate();

		assertEquals(26, result);
	}

	@Test
	public void test2Part2() {
		calculate2 = new Calculate2(INPUT, TOTAL_DAYS2);

		long result = calculate2.calculate();

		assertEquals(5934, result);
	}

	@Test
	public void test3Part2() {
		calculate2 = new Calculate2(INPUT, TOTAL_DAYS3);
		
		long result = calculate2.calculate();

		assertEquals(26984457539L, result);
	}
	
}
