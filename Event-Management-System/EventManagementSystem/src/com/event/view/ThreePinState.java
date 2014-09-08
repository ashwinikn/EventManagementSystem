package com.event.view;

import processing.core.PApplet;

import com.event.controller.IPassCode;

public class ThreePinState implements IPassCode{

	KeyPad keypad;
	PApplet applet;
	public ThreePinState(KeyPad keypad,PApplet applet){
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
	//	keypad.setState(keypad.getFourPinState());
		//applet.image(applet.loadImage("/password_icon.png"), 280,170);
		System.out.println("In three pin state pass is:: "+KeyPad.getPassword());
		if(!(KeyPad.getPassword().equals("1234"))){
			System.out.println("Inside icorrect");
			applet.image(applet.loadImage("/password_icon - white.png"), 205,170);
			applet.image(applet.loadImage("/password_icon - white.png"), 135,170);
			applet.image(applet.loadImage("/password_icon - white.png"), 60,170);
			applet.fill(255,0,0);			
			applet.text("Incorrect Pin, Please enter a valid Pin",40,40);
			KeyPad.setPassword("");
			keypad.setState(keypad.getNoPinState());
			
			
		}
		
	}

	@Override
	public void backspace() {
		/**
		 * On Backspace update the password and Change State to Previous State
		 * Done @ by Ashwini
		 
		*/ 
		keypad.updatePassword("");
		keypad.setState(keypad.getTwoPinState());
		applet.image(applet.loadImage("/password_icon - white.png"), 205,170);
	}
	public String getState() {
		/**
		 * Get the Current state value
		 * Done @ by Ashwini
		 
		*/ 
		return "ThreePinState";
	}
	
}
