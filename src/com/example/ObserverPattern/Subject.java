package com.example.ObserverPattern;

import java.util.Observer;

/*
Subject contains a list of observers to notify of any change in it’s state, so it should provide methods 
using which observers can register and unregister themselves. Subject also contain a method to notify 
all the observers of any change and either it can send the update while notifying the observer or it can 
provide another method to get the update.*/
public interface Subject {
	// methods to register and unregister observers
	public void register(com.example.ObserverPattern.Observer obj1);

	public void unregister(Observer obj);

	// method to notify observers of change
	public void notifyObservers();

	// method to get updates from subject
	public Object getUpdate(Observer obj);

}
