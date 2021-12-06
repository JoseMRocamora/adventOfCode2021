package com.kblman.aoc.day3;

public class SubmarineType2 implements Submarine {

	private int horizontal;
	private int depth;
	private int aim;

	public SubmarineType2() {
		this.horizontal = 0;
		this.depth = 0;
		this.aim = 0;
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

	public int getAim() {
		return aim;
	}

	public void setAim(int aim) {
		this.aim = aim;
	}

	@Override
	public void move(Movement movement) {
		switch (movement.getDirection()) {
		case FORWARD:
			this.horizontal += movement.getUnits();
			this.depth += (this.aim * movement.getUnits());
			break;
		case DOWN:
			this.aim += movement.getUnits();
			break;
		case UP:
			this.aim -= movement.getUnits();
			break;
		default:
			break;
		}
		if (this.depth < 0) {
			this.depth = 0;
		}
	}
}
