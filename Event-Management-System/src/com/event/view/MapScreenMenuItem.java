package com.event.view;

import com.event.controller.Command;
import com.event.controller.Invoker;

public class MapScreenMenuItem implements Invoker{

	private Command command;
	@Override
	public void invoke() {
		/**
		 * Override  the method invoke to implement the Command Design Pattern
		 * Done @ by Neema
		*/ 
		command.execute();
	}

	@Override
	public void setCommand(Command cmd) {
		/**
		 * Override  the method implement the Command Design Pattern
		 * Done @ by Neema
		*/ 
		command  = cmd;
	}

}
