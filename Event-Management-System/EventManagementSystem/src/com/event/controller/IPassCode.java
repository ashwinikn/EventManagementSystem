package com.event.controller;

public interface IPassCode {
	/**
	 * Interface Setup for the Pin Screen Passcode
	 * Done @ by Ashwini
	 
	*/ 
	public void pressedNumber(String input);
	public void backspace();
	public String getState();
}
