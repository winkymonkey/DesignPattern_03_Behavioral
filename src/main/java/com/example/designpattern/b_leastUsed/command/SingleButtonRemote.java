package com.example.designpattern.b_leastUsed.command;

class SingleButtonRemote {
	Command command; 	//only one button

	public void setCommand(Command command) {
		this.command = command;
	}

	public void pressTheButton() {
		command.execute();
	}
}
