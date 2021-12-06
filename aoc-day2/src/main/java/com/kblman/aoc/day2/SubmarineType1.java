package com.kblman.aoc.day2;

public class SubmarineType1 implements Submarine {

	private int horizontal;
	private int depth;

	public SubmarineType1() {
		this.horizontal = 0;
		this.depth = 0;
	}

	@Override
	public int getHorizontal() {
		return horizontal;
	}

	public void setHorizontal(int horizontal) {
		this.horizontal = horizontal;
	}

	@Override
	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	@Override
	public void move(Movement movement) {
		switch (movement.getDirection()) {
		case FORWARD:
			this.horizontal += movement.getUnits();
			break;
		case DOWN:
			this.depth += movement.getUnits();
			break;
		case UP:
			this.depth -= movement.getUnits();
			break;
		default:
			break;
		}
		if (this.depth < 0) {
			this.depth = 0;
		}
	}
}
