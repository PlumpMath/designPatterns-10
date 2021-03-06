package com.example.FlyweightPattern;

import java.awt.Color;
import java.awt.Graphics;

public class Oval implements Shape {
	private boolean fill;

	public Oval(boolean fill) {
		super();
		this.fill = fill;

		System.out.println("Creating Oval object with fill=" + fill);
		// adding time delay
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void draw(Graphics circle, int x, int y, int width, int height, Color color) {
		circle.drawOval(x, y, width, height);
		circle.setColor(color);
		if (fill) {
			circle.fillOval(x, y, width, height);
		}
	}

}
