package com.example.designpattern.b_leastUsed.mediator;

public interface ChatMediator {
	public void sendMessage(String msg, User user);
	public void addUser(User user);
}
