package com.example.BridgePattern;

public class Triangle extends Shape {

	public Triangle(Color color) {
		super(color);
	}

	@Override
	public void applyColor() {
		System.out.print("Traingle color is ");
		color.applyColor();
	}

}
