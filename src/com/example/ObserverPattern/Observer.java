package com.example.ObserverPattern;
/*Observer should have a method to set the object to watch
 *  and another method that will be used by Subject to notify them of any updates.*/
public interface Observer {
	public void update();

	// attach with subject to observe
	public void setSubject(Subject sub);
}
