package com.example.FlyweightPattern;

/*Flyweight Factory

The flyweight factory will be used by client programs to instantiate the Object, so we need to keep 
a map of Objects in the factory that should not be accessible by client application. Whenever client
 program makes a call to get an instance of Object, it should be returned from the HashMap, if not 
 found then create a new Object and put in the Map and then return it. We need to make sure that all 
 the intrinsic properties are considered while creating the Object.*/
import java.util.HashMap;

public class ShapeFactory {
	/*
	 * Before we apply flyweight design pattern, we need to consider following
	 * factors:
	 * 
	 * The number of Objects to be created by application should be huge. The
	 * object creation is heavy on memory and it can be time consuming too. The
	 * object properties can be divided into intrinsic and extrinsic properties,
	 * extrinsic properties of an Object should be defined by the client
	 * program.
	 */
	private static final HashMap<ShapeType, Shape> shapes = new HashMap<ShapeType, Shape>();

	public static Shape getShape(ShapeType type) {
		Shape shapeImpl = shapes.get(type);

		if (shapeImpl == null) {
			if (type.equals(ShapeType.OVAL_FILL)) {
				shapeImpl = new Oval(true);
			} else if (type.equals(ShapeType.OVAL_NOFILL)) {
				shapeImpl = new Oval(false);
			} else if (type.equals(ShapeType.LINE)) {
				shapeImpl = new Line();
			}
			shapes.put(type, shapeImpl);
		}
		return shapeImpl;
	}

	public static enum ShapeType {
		OVAL_FILL, OVAL_NOFILL, LINE;
	}
}