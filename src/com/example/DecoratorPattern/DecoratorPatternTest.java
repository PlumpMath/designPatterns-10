package com.example.DecoratorPattern;

public class DecoratorPatternTest {
	public static void main(String[] args) {
		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		System.out.println("\n*****");

		Car sportsLuxuryCar = new SportsCar(new LuxaryCar(new BasicCar()));
		sportsLuxuryCar.assemble();
	}
}
