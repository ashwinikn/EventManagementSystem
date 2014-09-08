package com.event.controller;

public interface Invoker {
	/**
	 * Interface Setup for the Command Design Pattern
	 * Done @ by Neema
	 
	*/ 
	public void invoke();
	public void setCommand(Command cmd);
}
