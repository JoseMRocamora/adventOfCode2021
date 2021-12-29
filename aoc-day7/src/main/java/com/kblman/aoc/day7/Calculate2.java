package com.kblman.aoc.day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculate2 implements Calculate {

	private List<Short> crabPositions;

	public Calculate2(Short[] INPUT) {
		crabPositions = new ArrayList<Short>();
		for (int i = 0; i < INPUT.length; i++) {
			crabPositions.add(INPUT[i]);
		}
	}

	@Override
	public Integer calculate() {
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
			fuelCost += linearConsumption(distance);
		}
		
		return fuelCost;
	}

	private int linearConsumption(Short distance) {
		int consumed = 0;
		for (int i = 1; i <= distance; i++) {
			consumed += i;
		}
		return consumed;		
	}
}
