package com.example.StatePattern;

public class TVRemote {
	public static void main(String[] args) {
		TVContext context = new TVContext();
		State tvStartState = new TvOnState();
		State tvStopState = new TvOffState();

		context.setState(tvStartState);
		context.doAction();

		context.setState(tvStopState);
		context.doAction();

	}
}
