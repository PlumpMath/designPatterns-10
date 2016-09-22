package com.example.BridgePattern;
/* 
 * When we have interface hierarchies in both interfaces as well 
 * as implementations, then builder design pattern is used to decouple the interfaces
 *  from implementation and hiding the implementation details from the client programs. Like Adapter pattern,
 *  its one of the Structural design pattern.*/

public abstract class Shape {
	protected Color color;

	public Shape(Color color) {
		this.color = color;
	}

	abstract public void applyColor();

}
