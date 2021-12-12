package com.kblman.aoc.day5;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Calculate2Test {

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
	
	
	private Calculate calculate2;

	@Before
	public void setUp() throws Exception {
		calculate2 = new Calculate2(INPUT);
	}

	@Test
	public void testPart2() {
		int result = calculate2.calculate();

		assertEquals(1924, result);
	}

}
