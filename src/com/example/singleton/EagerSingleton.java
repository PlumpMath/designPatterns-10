package com.example.singleton;
/*This is a design pattern where an instance of a class is created much before it is actually required.
 *  Mostly it is done on system start up. In singleton pattern, it refers to create the singleton instance 
 *  irrespective of whether any other class actually asked for its instance or not.*/

public class EagerSingleton {
	private static volatile EagerSingleton instance = new EagerSingleton();
	// private constructor
    private EagerSingleton() {
    }
 
    public static EagerSingleton getInstance() {
        return instance;
    }
}