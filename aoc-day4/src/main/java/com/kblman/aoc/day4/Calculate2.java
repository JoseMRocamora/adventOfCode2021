package com.kblman.aoc.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculate2 implements Calculate {

	private List<Integer> numbersSequence;
	private List<Board> boards;
	
	public Calculate2(Integer[] numbersSequence, Integer[][][] numbersBoards) {
		
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
			markBoards(number);
			discardWinnerBoards();
			
			if ((boards.size() == 1) && boards.get(0).isWinner()) {			
				lastNumber = number;
				winnerBoard = boards.get(0);
				break;
			}
		}
		
		Integer score = winnerBoard.score();
		System.out.println(String.format("Score: %d, Last number: %d", score, lastNumber));
		System.out.println(String.format("Final Score: %d", score * lastNumber));
		
		return score * lastNumber;
	}

	private void markBoards(Integer number) {
		for (Board board : boards) {
			board.mark(number);			
		}		
	}

	private void discardWinnerBoards() {

		int oldSize = 0;
		int newSize = boards.size();
		while (oldSize != newSize) {
			oldSize = newSize;
			for (int i = 0; i < boards.size(); i++) {
				Board board = boards.get(i); 
				
				if (board.isWinner()) {
					if (boards.size() > 1) {
						boards.remove(i);
						break;
					}
					else {
						break;
					}
				}
			}				
			newSize = boards.size();
		}
		
	}
	
}
