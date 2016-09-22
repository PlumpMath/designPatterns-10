package com.example.FactoryPattern;

//Reason for static is the object creation is not needed for calling this method. The purpose of this method is to create an istance of the
//object so it is similar to main statment where static corresponds to no object is created yet.
public class FactoryPatternCmp {
	public static Computer getComputer(String type, String ram, String hdd, String cpu) {
		if ("PC".equalsIgnoreCase(type)) {
			return new PC(ram, hdd, cpu);
		} else if ("Server".equalsIgnoreCase(type)) {
			return new Server(ram, hdd, cpu);
		}

		return null;

	}

}
