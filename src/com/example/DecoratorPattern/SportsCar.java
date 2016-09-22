package com.example.DecoratorPattern;

public class SportsCar extends CarDecorator {

	public SportsCar(Car c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	public void assemble() {
		car.assemble();
		System.out.println("Adding features of Sport Car");
	}
}
