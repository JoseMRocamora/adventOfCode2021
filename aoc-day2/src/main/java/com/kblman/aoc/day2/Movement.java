package com.kblman.aoc.day2;

public class Movement {

	public enum Directions {

		FORWARD("forward"),
		DOWN("down"),
		UP("up");

		private String text;
		
		Directions(String text) {
			this.text = text;
		}

		public String getText() {
			return text;
		}

		public static Directions get(String text) {
			for (Directions value : Directions.values()) {
				if (value.text.equals(text))
					return value;
			}
			return null;
		}
	}

	private Directions direction;
	private int units;
	
	public Movement(Directions direction, int units) {
		this.direction = direction;
		this.units = units;
	}
	
	public Movement(String movement) {
		String[] components = movement.split(" ");
		this.direction = Directions.get(components[0]);
		this.units = Integer.parseInt(components[1]);
	}

	public Directions getDirection() {
		return direction;
	}

	public void setDirection(Directions direction) {
		this.direction = direction;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}
		
}
