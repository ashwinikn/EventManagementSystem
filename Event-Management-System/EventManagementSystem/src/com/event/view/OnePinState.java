package com.event.view;

import processing.core.PApplet;

import com.event.controller.IPassCode;

public class OnePinState implements IPassCode {

	KeyPad keypad;
	PApplet applet;
	public OnePinState(KeyPad keypad,PApplet applet){
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
		System.out.println("In one pin state pass is:: "+KeyPad.getPassword());
		applet.image(applet.loadImage("/password_icon.png"), 135,170);
		keypad.setState(keypad.getTwoPinState());
		
		
	}

	@Override
	public void backspace() {
		/**
		 * On Backspace update the password and Change State to Previous State
		 * Done @ by Ashwini
		 
		*/ 
		keypad.updatePassword("");
		keypad.setState(keypad.getNoPinState());		
		applet.image(applet.loadImage("/password_icon - white.png"), 60,170);
		
	}
	public String getState() {
		/**
		 * Get the Current state value
		 * Done @ by Ashwini
		 
		*/ 

			return "OnePinState";
	}

	

}
