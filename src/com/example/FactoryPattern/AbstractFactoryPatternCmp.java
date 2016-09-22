package com.example.FactoryPattern;
/*ComputerAbstractFactoryPattern is like main factory interface and people has to implement and develop or pass their child instance 
 * example PCFactory will implemnet ComputerAbstarct and then pass P instance to us and similary Server too from the other end*/

public class AbstractFactoryPatternCmp {
	public static Computer getComputer(ComputerAbstractFactoryPattern factory) {
		return factory.createComputer();

	}

}
