package com.kblman.aoc.day7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Calculate2Test {

	private static final Short[] INPUT = { 16,1,2,0,4,2,7,1,2,14 };
	private static final Integer OUTPUT = 168;
	
	private Calculate calculate2;

	@Test
	public void test1Part2() {
		calculate2 = new Calculate2(INPUT);
		
		Integer result = calculate2.calculate();

		assertEquals(OUTPUT, result);
	}

}
