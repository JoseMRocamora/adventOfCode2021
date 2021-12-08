package com.kblman.aoc.day3;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class Calculate2 implements Calculate {

	private List<String> diagnosticReport;
	private int precision;

	public Calculate2(List<String> diagnosticReport) {
		this.diagnosticReport = diagnosticReport;

		String firstElement = diagnosticReport.get(0);
		this.precision = firstElement.length();
	}
	
	@Override
	public int calculate() {
		int oxigenGenerator = calculateOxigenGenerator();
		int co2Scrubber = calculateCO2Scrubber();
		int lifeSupport = oxigenGenerator * co2Scrubber;

		System.out.println(String.format("Oxigen Generator = %d, CO2 Scrubber = %d", oxigenGenerator, co2Scrubber));
		System.out.println(String.format("Oxigen Generator = %s, CO2 Scrubber = %s", toBinaryString(oxigenGenerator),
				toBinaryString(co2Scrubber)));
		System.out.println(String.format("Life Support = %d", lifeSupport));

		return lifeSupport;
	}

	private int calculateOxigenGenerator() {
		List<String> report = new ArrayList<String>(this.diagnosticReport);

		int oxygenGenerator = 0;
		String oxigenGeneratorFilter = "";
		for (int i = 0; i < precision; i++) {
			int oxygenGeneratorBit = mostCommonBit(report, i);
			oxygenGenerator = oxygenGenerator | oxygenGeneratorBit << (precision - 1 - i);
			oxigenGeneratorFilter = oxigenGeneratorFilter + oxygenGeneratorBit;
			report = filterReportDiagnosis(report, oxigenGeneratorFilter);			
		}
		return oxygenGenerator;
	}

	private int mostCommonBit(List<String> report, int digit) {
		if (report.size() > 1) {
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
			return (zeros > ones) ? 0 : 1;
		} else {
			String firstWord = report.get(0);
			return Integer.parseInt(StringUtils.substring(firstWord, digit, digit + 1));
		}
	}

	private int calculateCO2Scrubber() {
		List<String> report = new ArrayList<String>(this.diagnosticReport);

		int co2Screubber = 0;
		String co2ScrubberFilter = "";
		for (int i = 0; i < precision; i++) {
			int co2ScrubberBit = leastCommonBit(report, i);
			co2Screubber = co2Screubber | co2ScrubberBit << (precision - 1 - i);
			co2ScrubberFilter = co2ScrubberFilter + co2ScrubberBit;
			report = filterReportDiagnosis(report, co2ScrubberFilter);			
		}
		return co2Screubber;
	}
	
	private int leastCommonBit(List<String> report, int digit) {
		if (report.size() > 1) {
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
			return (zeros <= ones) ? 0 : 1;
		} else {
			String firstWord = report.get(0);
			return Integer.parseInt(StringUtils.substring(firstWord, digit, digit + 1));
		}
	}
	
	
	private String toBinaryString(int value) {
		String binaryString = StringUtils.repeat("0", precision) + Integer.toBinaryString(value);
		return StringUtils.right(binaryString, precision);
	}
	
	private List<String> filterReportDiagnosis(List<String> report, String preffix) {
		List<String> filteredReport = new ArrayList<String>();
		for (String word : report) {
			if (word.startsWith(preffix)) {
				filteredReport.add(word);
			}
		}
		return filteredReport;
	}
}
