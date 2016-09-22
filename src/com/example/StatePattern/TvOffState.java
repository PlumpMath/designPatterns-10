package com.example.StatePattern;

public class TvOffState implements State {

	@Override
	public void doAction() {
		System.out.println("TV is turned OFF");
	}

}
