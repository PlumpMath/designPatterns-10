package com.example.BridgePattern;

public class Circle extends Shape {

	public Circle(Color color) {
		super(color);
	}

	@Override
	public void applyColor() {
		System.out.print("Circle color is ");
		color.applyColor();
	}

}
