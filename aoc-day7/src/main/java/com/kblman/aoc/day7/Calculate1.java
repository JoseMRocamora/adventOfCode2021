package com.kblman.aoc.day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculate1 implements Calculate {

	private List<Short> crabPositions;

	public Calculate1(Short[] INPUT) {
		crabPositions = new ArrayList<Short>();
		for (int i = 0; i < INPUT.length; i++) {
			crabPositions.add(INPUT[i]);
		}
	}

	@Override
	public Integer calculate() {
		System.out.println("Initial state: " + crabPositions);
		Integer minFuelCost = Integer.MAX_VALUE;
		Short min = Collections.min(crabPositions);
		Short max = Collections.max(crabPositions);

		for (short i = min; i <= max; i++) {
			int fuelCost = calculateFuelCost(i);
			System.out.println(String.format("Fuel Cost to position %d: %d", i, fuelCost));
			if (fuelCost < minFuelCost) {
				minFuelCost = fuelCost;
			}
		}

		System.out.println(String.format("Minimum Fuel Cost: %d", minFuelCost));
		return minFuelCost;
	}

	private int calculateFuelCost(Short toPosition) {
		int fuelCost = 0;

		for (Short crabPosition : crabPositions) {
			Short distance = (short) Math.abs(toPosition - crabPosition);
			fuelCost += distance;
		}
		
		return fuelCost;
	}
}
