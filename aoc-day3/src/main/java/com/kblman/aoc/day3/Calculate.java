package com.kblman.aoc.day3;

import org.apache.commons.lang3.StringUtils;

public class Calculate {

	private String[] input;
	private int precision;

	public Calculate(String[] input) {
		this.input = input;
		this.precision = input[0].length();
	}

	public int part1() {
	
		int gamma = gamma();
        int epsilon = (int) (~gamma & getMaxValue());
		int powerConsumption = gamma * epsilon;
		
        System.out.println(String.format("Gamma = %d, Epsilon = %d", gamma, epsilon));
        System.out.println(String.format("Gamma = %s, Epsilon = %s", toBinaryString(gamma), toBinaryString(epsilon)));
        System.out.println(String.format("Power comsumption = %d", powerConsumption));
		
		return powerConsumption;
	}

	private int gamma() {
		int gamma = 0;
		for (int i = 0; i < precision; i++) {
			int gammaBit = gammaOfBit(i);
			
			gamma = gamma | gammaBit << (precision - 1 - i);
		}
		return gamma;
	}

	private int gammaOfBit(int digit) {
		int zeros = 0;
		int ones = 0;
		for (int i = 0; i < input.length; i++) {
			int value = Integer.parseInt(StringUtils.substring(input[i], digit, digit+1));
			if (value == 0) {
				zeros++;
			} else {
				ones++;
			}
		}
		return (zeros >= ones) ? 0 : 1;
	}

	private int getMaxValue() {
		return (int) (Math.pow(2, precision) - 1);
	}
	private String toBinaryString(int value) {
        String binaryString = StringUtils.repeat("0", precision) + Integer.toBinaryString(value);
        return StringUtils.right(binaryString, precision);    }
	
	public int part2() {
		return 0;
	}

}
