package com.kblman.aoc.day5;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Segment {

	private Point a = null;
	private Point b = null;
	
	public List<Point> getPoints() {
		List<Point> points = new ArrayList<Point>();

		if (isVertical()) {
			int increment = (a.getY() < b.getY()) ? 1 : -1;
			for (int y = a.getY(); y != b.getY(); y += increment) {
				points.add(new Point(a.getX(), y));
			}
		}
		else if (isHorizontal()) {
			int increment = (a.getX() < b.getX()) ? 1 : -1;
			for (int x = a.getX(); x != b.getX(); x += increment) {
				points.add(new Point(x, a.getY()));
			}
		}
		points.add(b);
		
		return points;
	}

	public boolean isVertical() {
		return (a.getX() == b.getX());
	}
	
	public boolean isHorizontal() {
		return a.getY() == b.getY();
	}
	
}
