package com.example.MediatorPattern;

public interface ChatMediator {
	public void sendMessage(String msg, User user);
	 
    void addUser(User user);
}
