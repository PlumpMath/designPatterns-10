package com.example.singleton;

//: c01:SingletonPattern.java
// The Singleton design pattern: you can
// never instantiate more than one.
// Since this isn't inherited from a Cloneable
// base class and cloneability isn't added,
// making it final prevents cloneability from
// being added through inheritance:
final class Singleton {
	private static Singleton s = new Singleton(49);
	private int i;

	private Singleton(int x) {
		i = x;
	}

	public static Singleton getReference() {
		return s;
	}

	public int getValue() {
		return i;
	}

	public void setValue(int x) {
		i = x;
	}
}