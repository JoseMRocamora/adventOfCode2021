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
		if (isVertical()) {
			return getVerticalPoints();
		}
		else if (isHorizontal()) {
			return getHorizontalPoints();
		}
		else {			
			return getDiagonalPoints();
		}
	}

	private List<Point> getVerticalPoints() {
		List<Point> points = new ArrayList<Point>();

		int y1 = Math.min(a.getY(), b.getY());
		int y2 = Math.max(a.getY(), b.getY());
		
		for (int i = y1; i <= y2; i++) {
			points.add(new Point(a.getX(), i));
		}
		
		return points;		
	}

	private List<Point> getHorizontalPoints() {
		List<Point> points = new ArrayList<Point>();

		int x1 = Math.min(a.getX(), b.getX());
		int x2 = Math.max(a.getX(), b.getX());
		
		for (int i = x1; i <= x2; i++) {
			points.add(new Point(i, a.getY()));
		}

		return points;		
	}

	private List<Point> getDiagonalPoints() {
		List<Point> points = new ArrayList<Point>();

		int xIncrement = (a.getX() < b.getX()) ? 1 : -1;
		int yIncrement = (a.getY() < b.getY()) ? 1 : -1;
		
		int i = a.getX();
		int j = a.getY();
		while (i != b.getX()) {
			points.add(new Point(i, j));
			i += xIncrement;
			j += yIncrement;
		}
		points.add(new Point(i, j));
		
		return points;		
	}

	
	public boolean isVertical() {
		return (a.getX() == b.getX());
	}
	
	public boolean isHorizontal() {
		return (a.getY() == b.getY());
	}
	
}
