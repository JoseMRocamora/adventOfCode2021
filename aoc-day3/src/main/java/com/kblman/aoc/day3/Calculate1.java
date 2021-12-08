package com.kblman.aoc.day3;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class Calculate1 implements Calculate {

	private List<String> diagnosticReport;
	private int precision;

	public Calculate1(List<String> diagnosticReport) {
		this.diagnosticReport = diagnosticReport;

		String firstElement = diagnosticReport.get(0);
		this.precision = firstElement.length();
	}

	@Override
	public int calculate() {

		int gamma = calculateGamma();
		int epsilon = calculateEpsilon(gamma);
		int powerConsumption = gamma * epsilon;

		System.out.println(String.format("Gamma = %d, Epsilon = %d", gamma, epsilon));
		System.out.println(String.format("Gamma = %s, Epsilon = %s", toBinaryString(gamma), toBinaryString(epsilon)));
		System.out.println(String.format("Power comsumption = %d", powerConsumption));

		return powerConsumption;
	}

	private int calculateGamma() {
		int gamma = 0;
		for (int i = 0; i < precision; i++) {
			int gammaBit = mostCommonBit(diagnosticReport, i);

			gamma = gamma | gammaBit << (precision - 1 - i);
		}
		return gamma;
	}

	private int mostCommonBit(List<String> report, int digit) {
		int zeros = 0;
		int ones = 0;

		for (String word : report) {
			int bit = Integer.parseInt(StringUtils.substring(word, digit, digit + 1));
			if (bit == 0) {
				zeros++;
			} else {
				ones++;
			}
		}
		return (zeros >= ones) ? 0 : 1;
	}

	private int calculateEpsilon(int gamma) {
		return (int) (~gamma & getMaxValue());
	}

	private int getMaxValue() {
		return (int) (Math.pow(2, precision) - 1);
	}

	private String toBinaryString(int value) {
		String binaryString = StringUtils.repeat("0", precision) + Integer.toBinaryString(value);
		return StringUtils.right(binaryString, precision);
	}

}
