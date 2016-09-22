package com.example.CompositePattern;

/*Base Component

Base component defines the common methods for leaf and composites, 
we can create a class Shape with a method draw(String fillColor) to draw
 the shape with given color.*/
public interface shapeBaseComponent {
	public void draw(String fillColor);
}
