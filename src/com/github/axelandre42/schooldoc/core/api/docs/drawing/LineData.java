package com.github.axelandre42.schooldoc.core.api.docs.drawing;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class LineData {
	
	private Color c = Color.BLACK;
	
	private List<Point> p = new ArrayList<Point>();

	public Color getColor() {
		return c;
	}

	public List<Point> getPoints() {
		return p;
	}

	public void setColor(Color c) {
		this.c = c;
	}

	public void addPoint(Point p) {
		this.p.add(p);
	}
	
}
