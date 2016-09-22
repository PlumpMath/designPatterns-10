package com.example.singleton;

/*
 * In computer programming, lazy initialization is the tactic of delaying the creation of an object,
 *  the calculation of a value, or some other expensive process until the first time it is needed. 
 *  	In singleton pattern, it restricts the creation of instance until requested first time.*/
public class LazySingleton {
	private static volatile LazySingleton instance = null;

	// private constructor
	private LazySingleton() {
	}
	// This method fails when we have two thread t1 and t2 try to create
	// instance same time then
	// in the syn block it will create two instances vs one instance according
	// to Singlton to avoid add the
	// check for instance inside sync block also

	public static LazySingleton getInstance() {
		if (instance == null) {
			synchronized (LazySingleton.class) {
				// Double check
				if (instance == null) {
					instance = new LazySingleton();
				}
			}
		}
		return instance;
	}
}