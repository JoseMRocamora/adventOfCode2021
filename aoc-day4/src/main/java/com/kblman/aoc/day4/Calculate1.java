package com.kblman.aoc.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Calculate1 implements Calculate {

	private List<Integer> numbersSequence;
	private List<Board> boards;
	
	public Calculate1(Integer[] numbersSequence, Integer[][][] numbersBoards) {
		
		this.numbersSequence = Arrays.asList(numbersSequence);
		
		this.boards = new ArrayList<Board>();
		for (int i = 0; i < numbersBoards.length; i++) {
			Board board = new Board(numbersBoards[i]);
			boards.add(board);
			
		}
	}

	@Override
	public int calculate() {
		Board winnerBoard = null;
		Integer lastNumber = null;
		for (Integer number : numbersSequence) {
			Integer winner = getNumberOfWinnerBoard(number);
			if (winner != null) {
				lastNumber = number;
				winnerBoard = boards.get(winner);
				break;
			}
		}
		
		Integer score = winnerBoard.score();
		System.out.println(String.format("Score: %d, Last number: %d", score, lastNumber));
		System.out.println(String.format("Final Score: %d", score * lastNumber));
		
		return score * lastNumber;
	}

	private Integer getNumberOfWinnerBoard(Integer numberToMark) {
		for (int i = 0; i < this.boards.size(); i++) {
			Board board = boards.get(i); 
			board.mark(numberToMark);
			
			if (board.isWinner()) {
				return i;
			}
		}	
		
		return null;
		
	}
	
}
