package com.example.CompositePattern;

public class CircleLeaf implements shapeBaseComponent {

	@Override
	public void draw(String fillColor) {
		System.out.println("Drawing Circle with color " + fillColor);

	}

}
