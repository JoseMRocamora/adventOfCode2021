package com.kblman.aoc.day2;

public class Main {
	//public static String[] INPUT = { "forward 5", "down 5", "forward 8", "up 3", "down 8", "forward 2" };

	public static String[] INPUT = { "forward 7", "down 8", "forward 5", "down 3", "forward 6", "down 9", "down 2",
			"forward 1", "down 2", "down 9", "forward 8", "down 8", "up 6", "forward 8", "down 3", "forward 9", "up 3",
			"up 7", "forward 6", "up 3", "down 5", "up 9", "down 6", "up 1", "forward 7", "up 2", "forward 3",
			"forward 3", "up 9", "down 9", "up 4", "forward 9", "down 8", "up 1", "forward 8", "forward 6", "up 8",
			"down 5", "up 7", "up 5", "up 5", "up 4", "up 3", "forward 8", "forward 9", "down 9", "forward 7",
			"forward 1", "forward 2", "forward 4", "up 2", "forward 4", "up 3", "down 7", "forward 6", "down 9",
			"down 3", "down 4", "forward 4", "forward 8", "forward 9", "down 8", "forward 3", "forward 3", "forward 7",
			"forward 3", "down 7", "forward 6", "down 8", "forward 6", "up 3", "forward 9", "down 7", "down 6",
			"down 6", "down 5", "forward 7", "down 9", "down 9", "forward 6", "forward 5", "forward 6", "up 3",
			"forward 1", "forward 8", "down 5", "up 2", "up 7", "up 9", "forward 5", "forward 3", "down 6", "forward 8",
			"forward 6", "down 8", "down 2", "forward 5", "down 8", "forward 7", "down 6", "down 2", "forward 3",
			"down 6", "up 3", "down 4", "down 5", "down 6", "forward 9", "down 8", "down 9", "forward 3", "up 5",
			"up 2", "up 6", "forward 3", "down 4", "down 6", "forward 7", "forward 9", "up 3", "up 8", "up 4", "down 4",
			"up 9", "up 9", "down 1", "forward 6", "down 8", "forward 4", "down 1", "forward 8", "up 1", "up 4",
			"forward 8", "forward 8", "down 9", "forward 6", "forward 4", "forward 6", "forward 7", "down 2", "down 6",
			"forward 1", "forward 8", "up 4", "forward 3", "forward 5", "down 2", "forward 5", "forward 6", "forward 9",
			"forward 3", "down 6", "down 5", "down 1", "forward 2", "forward 7", "forward 2", "forward 2", "down 3",
			"down 5", "forward 2", "forward 7", "forward 6", "forward 8", "up 8", "forward 9", "down 4", "down 7",
			"forward 4", "down 9", "up 1", "forward 5", "forward 5", "up 3", "forward 3", "up 2", "forward 4", "down 6",
			"down 6", "down 5", "forward 5", "forward 9", "down 8", "forward 9", "forward 5", "forward 4", "up 4",
			"forward 9", "forward 2", "forward 2", "up 8", "up 4", "forward 8", "forward 3", "forward 6", "forward 1",
			"up 8", "forward 2", "forward 6", "up 6", "down 5", "up 9", "forward 1", "down 5", "forward 5", "down 1",
			"down 6", "up 3", "up 4", "down 3", "forward 3", "down 2", "forward 3", "down 1", "down 6", "forward 6",
			"down 7", "up 2", "forward 2", "forward 9", "forward 7", "up 5", "up 8", "up 8", "down 4", "up 5",
			"forward 6", "up 1", "forward 4", "forward 5", "up 4", "up 8", "up 2", "down 4", "up 3", "down 2",
			"forward 1", "down 8", "forward 5", "up 2", "forward 7", "down 4", "down 5", "forward 4", "forward 7",
			"down 9", "up 9", "forward 2", "up 3", "up 8", "up 3", "up 3", "down 3", "forward 1", "forward 2",
			"forward 6", "forward 3", "up 4", "forward 1", "down 2", "forward 4", "down 9", "forward 5", "down 6",
			"down 5", "forward 9", "forward 3", "forward 9", "forward 3", "forward 8", "down 3", "forward 5", "down 1",
			"forward 7", "forward 6", "down 7", "down 8", "up 9", "down 2", "forward 7", "down 9", "forward 5",
			"forward 3", "down 1", "forward 6", "down 6", "up 8", "down 6", "up 9", "forward 2", "down 1", "forward 2",
			"down 8", "down 2", "down 6", "up 9", "down 3", "down 5", "up 4", "down 4", "down 3", "up 2", "forward 2",
			"down 1", "down 2", "forward 8", "forward 3", "down 6", "forward 9", "up 5", "down 5", "down 1",
			"forward 1", "down 3", "down 7", "down 5", "forward 6", "up 4", "down 2", "forward 8", "down 9", "up 8",
			"forward 9", "forward 5", "down 6", "up 4", "forward 1", "forward 2", "forward 5", "up 3", "up 2", "up 8",
			"up 6", "forward 9", "down 3", "down 7", "down 7", "up 5", "forward 1", "down 3", "forward 9", "down 5",
			"up 6", "down 4", "up 5", "up 4", "up 9", "forward 2", "up 7", "down 7", "up 3", "up 1", "forward 6",
			"down 1", "down 9", "down 9", "down 4", "forward 1", "forward 6", "up 9", "down 3", "up 8", "forward 7",
			"forward 3", "down 6", "up 9", "forward 3", "up 9", "down 3", "up 6", "down 4", "up 3", "down 2",
			"forward 9", "forward 2", "down 1", "forward 4", "down 5", "up 4", "forward 6", "down 4", "down 8",
			"forward 4", "down 8", "down 9", "up 4", "up 7", "down 7", "forward 6", "up 9", "down 9", "down 7",
			"forward 3", "up 4", "up 8", "down 2", "down 5", "down 9", "forward 3", "forward 2", "up 6", "down 8",
			"forward 2", "forward 7", "up 4", "forward 4", "forward 7", "forward 7", "forward 3", "down 2", "down 6",
			"up 6", "down 8", "down 4", "forward 2", "down 2", "forward 2", "forward 7", "forward 2", "down 1",
			"down 1", "down 3", "down 3", "forward 4", "down 9", "forward 2", "forward 4", "forward 1", "forward 7",
			"forward 3", "down 1", "down 7", "forward 9", "forward 7", "up 2", "down 5", "forward 4", "down 8",
			"down 8", "forward 5", "down 3", "up 6", "down 3", "forward 3", "forward 8", "up 9", "up 8", "up 7",
			"forward 4", "forward 6", "forward 6", "down 6", "forward 1", "up 8", "down 6", "forward 1", "down 3",
			"down 2", "up 7", "forward 5", "down 2", "down 6", "down 8", "up 2", "forward 6", "forward 3", "forward 9",
			"up 8", "up 2", "down 4", "forward 3", "down 9", "forward 9", "forward 2", "down 7", "forward 6", "up 4",
			"forward 1", "down 5", "forward 7", "up 6", "down 2", "up 2", "forward 6", "down 6", "forward 1",
			"forward 5", "down 8", "down 2", "up 8", "forward 2", "forward 2", "down 4", "down 9", "forward 9",
			"down 9", "forward 5", "down 6", "down 8", "forward 4", "down 8", "up 8", "forward 5", "forward 8", "up 1",
			"up 3", "forward 3", "down 7", "down 8", "up 3", "forward 1", "up 2", "up 9", "down 8", "up 5", "forward 7",
			"forward 7", "down 7", "down 3", "forward 1", "forward 3", "forward 7", "down 8", "forward 7", "forward 6",
			"down 5", "down 8", "down 1", "forward 4", "down 5", "down 9", "forward 1", "forward 3", "forward 3",
			"up 2", "forward 5", "down 3", "forward 2", "down 7", "up 7", "up 7", "forward 5", "up 1", "down 8", "up 4",
			"up 6", "forward 4", "forward 4", "forward 4", "down 7", "down 9", "down 7", "forward 8", "down 6",
			"down 3", "forward 5", "down 6", "forward 5", "forward 3", "forward 9", "forward 9", "up 6", "down 9",
			"up 4", "up 1", "down 5", "down 2", "up 9", "forward 9", "forward 8", "up 5", "down 6", "up 6", "down 4",
			"down 6", "up 3", "forward 2", "up 7", "up 1", "up 4", "down 7", "up 2", "forward 7", "up 9", "up 3",
			"forward 9", "forward 6", "forward 1", "up 5", "down 4", "down 3", "up 3", "forward 5", "down 3", "down 4",
			"up 4", "up 9", "up 6", "forward 5", "down 9", "down 7", "forward 4", "forward 9", "down 9", "down 9",
			"down 8", "forward 1", "up 6", "down 7", "down 1", "down 3", "down 3", "forward 1", "forward 8", "up 1",
			"forward 2", "down 2", "down 5", "down 9", "forward 1", "forward 4", "down 7", "forward 1", "down 1",
			"down 8", "down 3", "forward 3", "down 9", "up 9", "down 7", "down 1", "down 2", "down 2", "forward 1",
			"up 3", "up 1", "down 5", "forward 5", "down 4", "down 4", "down 3", "up 9", "forward 9", "down 3",
			"forward 6", "forward 1", "forward 2", "forward 8", "forward 9", "down 3", "down 5", "up 7", "down 4",
			"forward 8", "up 9", "forward 9", "forward 2", "down 2", "forward 3", "down 4", "forward 2", "forward 6",
			"forward 9", "up 8", "down 1", "down 4", "up 9", "forward 2", "down 9", "forward 4", "down 7", "up 5",
			"down 2", "forward 5", "forward 7", "forward 9", "forward 1", "down 1", "forward 1", "down 3", "forward 5",
			"up 8", "down 8", "forward 1", "down 5", "up 3", "down 5", "forward 3", "forward 7", "forward 2", "down 2",
			"forward 7", "forward 4", "forward 4", "down 3", "forward 5", "down 5", "down 9", "up 4", "down 6",
			"down 5", "forward 5", "forward 9", "down 9", "forward 9", "down 6", "forward 4", "down 5", "down 8",
			"up 9", "down 7", "up 7", "forward 4", "down 6", "forward 5", "forward 4", "up 7", "forward 9", "forward 7",
			"up 7", "down 8", "down 1", "forward 3", "down 3", "down 6", "up 6", "up 5", "up 8", "down 7", "forward 6",
			"down 9", "forward 9", "forward 6", "up 7", "down 4", "down 5", "down 8", "forward 9", "forward 8",
			"forward 2", "forward 4", "up 6", "down 7", "forward 8", "down 9", "forward 3", "forward 1", "forward 4",
			"forward 8", "down 4", "down 1", "forward 5", "down 7", "down 3", "up 2", "up 5", "down 6", "forward 5",
			"down 9", "down 3", "forward 8", "up 5", "down 6", "forward 3", "down 5", "forward 1", "down 3", "up 3",
			"forward 9", "forward 9", "forward 8", "down 4", "down 1", "forward 7", "forward 7", "down 9", "up 2",
			"forward 2", "forward 2", "forward 1", "forward 2", "down 2", "down 7", "forward 5", "forward 3",
			"forward 2", "down 1", "down 6", "up 4", "down 3", "forward 2", "down 2", "down 2", "forward 9", "up 8",
			"forward 9", "down 8", "up 8", "down 8", "down 1", "forward 9", "up 7", "up 6", "down 3", "forward 5",
			"up 9", "forward 5", "forward 8", "up 3", "forward 8", "forward 9", "forward 2", "forward 4", "down 7",
			"forward 1", "forward 1", "down 7", "forward 8", "forward 4", "forward 2", "forward 7", "forward 6",
			"forward 5", "down 8", "down 9", "up 9", "forward 1", "forward 4", "down 1", "forward 6", "up 4",
			"forward 8", "forward 6", "up 5", "forward 9", "down 8", "down 4", "down 9", "forward 2", "up 4", "down 2",
			"forward 4", "down 9", "forward 3", "down 8", "forward 7", "forward 3", "down 7", "down 7", "down 8",
			"forward 8", "down 2", "forward 7", "up 7", "down 5", "down 7", "down 5", "up 9", "up 8", "down 1",
			"down 9", "forward 7", "up 2", "forward 1", "forward 3", "forward 8", "down 5", "forward 7", "up 6",
			"forward 5", "up 5", "forward 4", "down 6", "down 4", "forward 1", "up 1", "forward 2", "forward 2",
			"forward 8", "forward 7", "down 4", "down 1", "forward 5", "forward 9", "up 4", "down 4", "up 9", "up 4",
			"down 8", "down 7", "forward 1", "down 8", "forward 9", "down 4", "forward 5", "forward 2", "down 1",
			"forward 7", "forward 4", "down 9", "forward 8", "down 1", "forward 7", "forward 6", "up 9", "forward 6",
			"forward 6", "forward 8", "forward 3", "up 1", "forward 9", "down 3", "down 9", "down 8", "forward 5",
			"down 7", "forward 6", "forward 1", "up 1", "up 3", "up 7", "forward 1", "forward 8", "forward 6",
			"forward 9", "down 6", "forward 9", "down 2", "up 2", "down 7", "down 7", "forward 8", "down 2", "down 3",
			"forward 7", "forward 5", "down 3", "down 1", "up 8", "up 6", "down 3", "forward 1", "forward 6",
			"forward 4", "forward 7", "down 3", "down 9", "up 6", "down 7", "forward 9", "forward 2", "forward 7",
			"down 2", "down 8", "down 1", "down 9", "up 8", "forward 3", "down 9", "forward 6", "down 4", "forward 1",
			"up 8", "up 4", "down 5", "forward 2", "forward 9", "forward 5", "forward 6", "down 4", "up 4", "down 6",
			"down 8", "down 2", "down 7", "down 2", "up 8", "forward 4", "down 7", "forward 2", "down 5", "forward 3",
			"forward 1", "down 2", "up 3", "down 2", "forward 1", "forward 2", "down 6", "down 2", "down 9",
			"forward 9", "down 1", "up 2", "down 4", "forward 1", "forward 6", "forward 8", "forward 3" };

	public static void main(String[] args) {

		System.out.println("--- Day 2, part 1 ---\n");

		part1();

		System.out.println("\n--------------------------------------------------------------------------------\n");

		System.out.println("--- Day 2, part 2 ---\n");

		part2();
		
	}

	private static void part1() {
		Submarine submarine = new SubmarineType1();
		for (int i = 0; i < INPUT.length; i++) {
			Movement movement = new Movement(INPUT[i]);
			submarine.move(movement);
		}

		System.out.println(String.format("Submarine: Horizontal Position= %d, Depth= %d", submarine.getHorizontal(),
				submarine.getDepth()));
		System.out.println(String.format("Calculated Position= %d", submarine.getHorizontal() * submarine.getDepth()));
	}

	private static void part2() {
		Submarine submarine2 = new SubmarineType2();
		for (int i = 0; i < INPUT.length; i++) {
			Movement movement = new Movement(INPUT[i]);
			submarine2.move(movement);
		}

		System.out.println(String.format("Submarine: Horizontal Position= %d, Depth= %d", submarine2.getHorizontal(),
				submarine2.getDepth()));
		System.out.println(String.format("Calculated Position= %d", submarine2.getHorizontal() * submarine2.getDepth()));
	}

}
