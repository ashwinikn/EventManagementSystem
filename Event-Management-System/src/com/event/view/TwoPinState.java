package com.event.view;

import processing.core.PApplet;

import com.event.controller.IPassCode;

public class TwoPinState implements IPassCode{

	KeyPad keypad;
	PApplet applet;
	public TwoPinState(KeyPad keypad,PApplet applet){
		this.keypad = keypad;
		this.applet = applet;
	}
	@Override
	public void pressedNumber(String input) {
		/**
		 *Update Password
		 *Change the State to One Pinstate
		 *Done by @ Ashwini
		 
		*/ 
		keypad.updatePassword(input);
		keypad.setState(keypad.getThreePinState());
		System.out.println("In three pin state pass is:: "+KeyPad.getPassword());
		applet.image(applet.loadImage("/password_icon.png"), 205,170);

	}

	@Override
	public void backspace() {
		/**
		 * On Backspace update the password and Change State to Previous State
		 * Done @ by Ashwini
		 
		*/ 
		keypad.updatePassword("");
		keypad.setState(keypad.getOnePinState());
		applet.image(applet.loadImage("/password_icon - white.png"), 135,170);
	}

	public String getState() {
		/**
		 * Get the Current state value
		 * Done @ by Ashwini
		 
		*/ 
		return "TwoPinState";
	}
	
}
