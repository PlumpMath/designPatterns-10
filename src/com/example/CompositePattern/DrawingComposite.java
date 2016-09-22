package com.example.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class DrawingComposite implements shapeBaseComponent {
	private List<shapeBaseComponent> shapes = new ArrayList<shapeBaseComponent>();

	@Override
	public void draw(String fillColor) {
		for (shapeBaseComponent shape : shapes) {
			shape.draw(fillColor);

		}
	}

	// adding shape to drawing
	public void add(shapeBaseComponent s) {
		this.shapes.add(s);
	}

	public void remove(shapeBaseComponent s) {
		shapes.remove(s);
	}

	public void clear() {
		System.out.println("Clearing all the shapes from drawing");
		this.shapes.clear();
	}
}
