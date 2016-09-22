package com.example.CompositePattern;

/*Composite pattern should be applied only when the group of objects should behave as the single object.
Composite pattern can be used to create a tree like structure.
java.awt.Container#add(Component) is a great example of Composite pattern in java and used a lot in Swing.

Earlier structural design pattern articles:

*/
public class TestCompositePattern {
	public static void main(String[] args) {
		shapeBaseComponent tri = new TriangleLeaf();
		shapeBaseComponent tri1 = new TriangleLeaf();
		shapeBaseComponent cir = new CircleLeaf();
		DrawingComposite drawing = new DrawingComposite();

		drawing.add(tri);
		drawing.add(tri1);
		drawing.add(cir);

		drawing.draw("red");
		drawing.clear();
		drawing.add(tri);
		drawing.add(tri1);

		drawing.draw("blue");
	}
}
