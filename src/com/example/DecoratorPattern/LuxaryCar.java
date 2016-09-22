package com.example.DecoratorPattern;

public class LuxaryCar extends CarDecorator {

	public LuxaryCar(Car c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	public void assemble() {
		car.assemble();
		System.out.println("Adding features of Luxary Car");
	}

}
