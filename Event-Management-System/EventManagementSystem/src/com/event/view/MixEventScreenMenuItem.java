package com.event.view;

import com.event.controller.Command;
import com.event.controller.Invoker;

public class MixEventScreenMenuItem implements Invoker{

	private Command command;
	@Override
	public void invoke() {
		/**
		 * Implement the Command Design Pattern
		 * Done @ by Neema
		*/ 
		command.execute();
	}

	@Override
	public void setCommand(Command cmd) {
		/**
		 * Implement the Command Design Pattern
		 * Done @ by Neema
		*/ 
		command  = cmd;
	}

}
