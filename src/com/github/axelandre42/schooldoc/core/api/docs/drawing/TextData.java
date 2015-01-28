package com.github.axelandre42.schooldoc.core.api.docs.drawing;

import java.awt.Color;

public class TextData {
	private Color color = Color.BLACK;
	
	private String text;

	public Color getColor() {
		return color;
	}

	public String getText() {
		return text;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void setText(String text) {
		this.text = text;
	}
}
