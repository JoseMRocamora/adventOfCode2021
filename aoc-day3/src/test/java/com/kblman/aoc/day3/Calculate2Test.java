package com.kblman.aoc.day3;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class Calculate2Test {

	private static List<String> INPUT = new ArrayList<String>(Arrays.asList("00100", "11110", "10110", "10111", "10101",
			"01111", "00111", "11100", "10000", "11001", "00010", "01010"));

	private Calculate2 calculate2;

	@Before
	public void setUp() throws Exception {
		calculate2 = new Calculate2(INPUT);
	}

	@Test
	public void testCalculate() {
		int result = calculate2.calculate();

		assertEquals(230, result);
	}	
}
