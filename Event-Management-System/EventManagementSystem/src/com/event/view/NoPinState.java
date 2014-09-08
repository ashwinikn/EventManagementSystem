package com.event.view;

import processing.core.PApplet;

import com.event.controller.IPassCode;


public class NoPinState implements IPassCode{

	KeyPad keypad;
	PApplet applet;
	
	public NoPinState(KeyPad keypad,PApplet applet){
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
		applet.fill(0,0,0);			
		applet.text("Incorrect Pin, Please enter a valid Pin",40,40);	
		keypad.updatePassword(input);
		System.out.println("In No pin state pass is:: "+KeyPad.getPassword());		
		applet.image(applet.loadImage("/password_icon.png"), 60,170);
		keypad.setState(keypad.getOnePinState());
		
	}

	@Override
	public void backspace() {
		/**
		 * On Backspace update the password and Change State to Previous State
		 * Done @ by Ashwini
		 
		*/ 
		keypad.updatePassword("");
		keypad.setState(keypad.getNoPinState());
	}

	public String getState() {
		/**
		 * Get the Current state value
		 * Done @ by Ashwini
		 
		*/ 
		return "NoPinState";
	}

}
