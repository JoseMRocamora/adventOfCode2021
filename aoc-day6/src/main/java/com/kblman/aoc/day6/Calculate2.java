package com.kblman.aoc.day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Calculate2 implements Calculate {

	private Map<Short, Long> fishes;
	private Integer totalDays;
	
	public Calculate2(Short[] fishes, Integer totalDays) {

		this.fishes = new HashMap<Short, Long>();
		for (Short ageOfFish : fishes) {
			Long amount = this.fishes.getOrDefault(ageOfFish, 0L);
			this.fishes.put(ageOfFish, amount+1);			
		}
		
		this.totalDays = totalDays;
	}

	@Override
	public long calculate() {
		System.out.println("Initial state: " + fishes);
		for (int i = 0; i < totalDays; i++) {
			nextDay();
			System.out.println(String.format("After %2d days: %s", i + 1, fishes));
		}

		Long totalFishes = getTotalFishes();
		System.out.println(String.format("Amount of fishes= %s\n", totalFishes.toString()));
		return totalFishes;
	}

	private long getTotalFishes() {
		long total = 0L;	
		for (Long value: fishes.values()) {
			total = total + value;
		}
		return total;
	}

	private void nextDay() {
		Map<Short, Long> nextGeneration = new HashMap<Short, Long>();

		for (Entry<Short, Long> fish : fishes.entrySet()) {
			Short age = fish.getKey();
			Long amount = fish.getValue();
			
			if (age == 0) {
				age = 6;
				nextGeneration.put((short) 8, amount);
			}
			else {
				age--;
			}
			Long previousAmount = nextGeneration.getOrDefault(age, 0L);
			nextGeneration.put(age, previousAmount + amount);
		}

		fishes.clear();
		fishes.putAll(nextGeneration);
	}

}
