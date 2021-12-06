package com.kblman.aoc.day3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculateTest {

	private static String[] INPUT = { "00100", "11110", "10110", "10111", "10101", "01111", "00111", "11100", "10000",
			"11001", "00010", "01010" };

	private Calculate calculate;

	@Before
	public void setUp() throws Exception {
		calculate = new Calculate(INPUT);
	}

	@Test
	public void testPart1() {
		int result = calculate.part1();

		assertEquals(198, result);
	}

}
