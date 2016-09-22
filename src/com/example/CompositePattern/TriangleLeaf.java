package com.example.CompositePattern;

public class TriangleLeaf implements shapeBaseComponent {

	@Override
	public void draw(String fillColor) {
		System.out.println("Drawing Triangle with color " + fillColor);
	}

}
