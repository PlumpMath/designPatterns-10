package com.example.singleton;

public class SingletonPattern {
	public static void main(String[] args) {
		Singleton s = Singleton.getReference();
		System.out.println(s.getValue());
		Singleton s2 = Singleton.getReference();
		s2.setValue(9);
		System.out.println(s.getValue());
	
		try {
			// Can't do this: compile-time error.
			// Singleton s3 = (Singleton)s2.clone();
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}
}