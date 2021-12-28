package com.kblman.aoc.day6;

public class Main {

	private static Short[] INPUT = { 3, 1, 4, 2, 1, 1, 1, 1, 1, 1, 1, 4, 1, 4, 1, 2, 1, 1, 2, 1, 3, 4, 5, 1, 1, 4, 1, 3,
			3, 1, 1, 1, 1, 3, 3, 1, 3, 3, 1, 5, 5, 1, 1, 3, 1, 1, 2, 1, 1, 1, 3, 1, 4, 3, 2, 1, 4, 3, 3, 1, 1, 1, 1, 5,
			1, 4, 1, 1, 1, 4, 1, 4, 4, 1, 5, 1, 1, 4, 5, 1, 1, 2, 1, 1, 1, 4, 1, 2, 1, 1, 1, 1, 1, 1, 5, 1, 3, 1, 1, 4,
			4, 1, 1, 5, 1, 2, 1, 1, 1, 1, 5, 1, 3, 1, 1, 1, 2, 2, 1, 4, 1, 3, 1, 4, 1, 2, 1, 1, 1, 1, 1, 3, 2, 5, 4, 4,
			1, 3, 2, 1, 4, 1, 3, 1, 1, 1, 2, 1, 1, 5, 1, 2, 1, 1, 1, 2, 1, 4, 3, 1, 1, 1, 4, 1, 1, 1, 1, 1, 2, 2, 1, 1,
			5, 1, 1, 3, 1, 2, 5, 5, 1, 4, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 4, 5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 4, 4, 1, 1,
			4, 1, 3, 4, 1, 5, 4, 2, 5, 1, 2, 1, 1, 1, 1, 1, 1, 4, 3, 2, 1, 1, 3, 2, 5, 2, 5, 5, 1, 3, 1, 2, 1, 1, 1, 1,
			1, 1, 1, 1, 1, 3, 1, 1, 1, 3, 1, 4, 1, 4, 2, 1, 3, 4, 1, 1, 1, 2, 3, 1, 1, 1, 4, 1, 2, 5, 1, 2, 1, 5, 1, 1,
			2, 1, 2, 1, 1, 1, 1, 4, 3, 4, 1, 5, 5, 4, 1, 1, 5, 2, 1, 3 };
	private static Integer TOTAL_DAYS1 = 80;
	private static Integer TOTAL_DAYS2 = 256;

	public static void main(String[] args) {

		System.out.println("--- Day 6, part 1 ---\n");
		Calculate part1 = new Calculate1(INPUT, TOTAL_DAYS1);
		long result1 = part1.calculate();
		System.out.println(String.format("Result = %d\n", result1));

		System.out.println("--------------------------------------------------------------------------------\n");

		System.out.println("--- Day 6, part 2 ---\n");
		Calculate part2 = new Calculate2(INPUT, TOTAL_DAYS2);
		long result2 = part2.calculate();
		System.out.println(String.format("Result = %d\n", result2));
	}

}
