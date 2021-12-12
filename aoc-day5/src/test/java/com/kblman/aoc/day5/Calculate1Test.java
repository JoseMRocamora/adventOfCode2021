package com.kblman.aoc.day5;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Calculate1Test {

	private static Integer[][][] INPUT = {
			{ {0,9} , {5,9} },
			{ {8,0} , {0,8} },
			{ {9,4} , {3,4} },
			{ {2,2} , {2,1} },
			{ {7,0} , {7,4} },
			{ {6,4} , {2,0} },
			{ {0,9} , {2,9} },
			{ {3,4} , {1,4} },
			{ {0,0} , {8,8} },
			{ {5,5} , {8,2} }
			};
	
	private Calculate calculate1;

	@Before
	public void setUp() throws Exception {
		calculate1 = new Calculate1(INPUT);
	}

	@Test
	public void testPart1() {
		int result = calculate1.calculate();

		assertEquals(5, result);
	}

}
