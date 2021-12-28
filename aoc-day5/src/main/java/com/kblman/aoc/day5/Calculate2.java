package com.kblman.aoc.day5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Calculate2 implements Calculate {

	private List<Segment> segments;
	private Map<Point, Integer> intersections;

	public Calculate2(Integer[][][] segments) {

		this.segments = new ArrayList<Segment>();
		for (int i = 0; i < segments.length; i++) {
			Integer[][] points = segments[i];

			Point a = new Point(points[0][0], points[0][1]);
			Point b = new Point(points[1][0], points[1][1]);

			Segment segment = new Segment(a, b);
			this.segments.add(segment);
		}
		System.out.println(String.format("Segments: %d", this.segments.size()));				

		this.intersections = new HashMap<Point, Integer>();
	}

	@Override
	public int calculate() {
		for (Segment segment : segments) {
			List<Point> points = segment.getPoints();
			//System.out.println(String.format("(%s, %s) -- %s", segment.getA(), segment.getB(), points));				
			addIntersections(points);
		}
		
		//System.out.println(String.format("Intersections: %s", this.intersections.toString()));
		int numIntersections = 0;
		for (Entry<Point, Integer> entry : this.intersections.entrySet()) {
			if (entry.getValue() > 1) {
				numIntersections++;
			}			
		}
		
		System.out.println(String.format("Num Intersections: %d", numIntersections));
		return numIntersections;
	}

	private void addIntersections(List<Point> points) {
		for (Point point : points) {
			Integer previousValue = this.intersections.getOrDefault(point, 0);
			this.intersections.put(point, previousValue + 1);
		}
	}

}
