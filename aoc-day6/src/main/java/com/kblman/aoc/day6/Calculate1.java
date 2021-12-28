package com.kblman.aoc.day6;

import java.util.ArrayList;
import java.util.List;

public class Calculate1 implements Calculate {

	private List<Short> fishes;
	private Integer totalDays;
	
	public Calculate1(Short[] INPUT, Integer totalDays) {
	
		this.fishes = new ArrayList<Short>();
		for (Short fish : INPUT) {
			this.fishes.add(fish); 
		}
		this.totalDays = totalDays;
		
	}
	

	@Override
	public long calculate() {
		System.out.println("Initial state: " + fishes);
		for (int i = 0; i < totalDays; i++) {
			nextDay();
			System.out.println(String.format("After %2d days: %s", i+1, fishes));
		}		
		
		System.out.println(String.format("Amount of fishes= %d\n", fishes.size()));
		return fishes.size();
	}

	private void nextDay() {
		Integer totalFishes = fishes.size();
		for (int i = 0; i < totalFishes ; i++) {
			Short fish = fishes.get(i);
			
			if (fish == 0) {
				fish = 6;
				fishes.add((short) 8);
			} else {
				fish--;
			}		
			fishes.set(i, fish);
		}
	}
}
