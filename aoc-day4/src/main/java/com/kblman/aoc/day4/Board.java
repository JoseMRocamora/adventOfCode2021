package com.kblman.aoc.day4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
	
	List<Map<Integer, Boolean>> rows;
	List<Map<Integer, Boolean>> columns;
	
	public Board(Integer[][] boardNumbers) {		
		this.rows = new ArrayList<Map<Integer,Boolean>>();
		this.columns = new ArrayList<Map<Integer,Boolean>>();

		for (int row = 0; row < boardNumbers.length; row++) {
			rows.add(new HashMap<Integer, Boolean>());
			
			for (int column = 0; column < boardNumbers[0].length; column++) {
				Integer number = boardNumbers[row][column];

				if (columns.size() < column+1) {
					columns.add(new HashMap<Integer, Boolean>());					
				}
				rows.get(row).put(number, false);
				columns.get(column).put(number, false);
			}
		}
	}

	@Override
	public String toString() {
		return "Board [rows=" + rows + ", columns=" + columns + "]";
	}

	public void mark(Integer number) {
		for (Map<Integer, Boolean> row : rows) {
			if (row.containsKey(number)) {
				row.put(number, true);
			}
		}
		
		for (Map<Integer, Boolean> column : columns) {
			if (column.containsKey(number)) {
				column.put(number, true);
			}
		}		
	}

	public boolean isWinner() {
		for (Map<Integer, Boolean> row : rows) {
			Integer marked = (int) row.entrySet().stream().filter(entry -> entry.getValue()).count();
			if (marked == row.size()) {
				return true;
			}
		}

		for (Map<Integer, Boolean> column : columns) {
			Integer marked = (int) column.entrySet().stream().filter(entry -> entry.getValue()).count();
			if (marked == column.size()) {
				return true;
			}
		}

		return false;
	}

	public Integer score() {
		Integer score = 0;
		
		for (Map<Integer, Boolean> row : rows) {
			score += row.entrySet().stream().filter(entry -> entry.getValue() == false).mapToInt(entry -> entry.getKey()).sum();
		}
		
		return score;
	}
	
}
