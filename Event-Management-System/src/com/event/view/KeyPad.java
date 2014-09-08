package com.event.view;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

import com.event.controller.INumPad;
import com.event.controller.IPassCode;
import com.event.controller.IScreen;

public class KeyPad implements INumPad{

	IPassCode NoPinState;
	IPassCode OnePinState;
	IPassCode TwoPinState;
	IPassCode ThreePinState;
	IPassCode FourPinState;	
	IPassCode state;
	static String password = ""; 
	PImage img;
	ArrayList<INumPad> inumpad = new ArrayList<INumPad>();
	
	public KeyPad(PApplet applet){
		NoPinState = new NoPinState(this,applet);
		OnePinState = new OnePinState(this,applet);
		TwoPinState = new TwoPinState(this,applet);
		ThreePinState = new ThreePinState(this,applet);
		FourPinState = new FourPinState(this,applet);
		state = NoPinState;
		inumpad.add(new NumPad1(applet));
		inumpad.add(new NumPad2(applet));
		inumpad.add(new NumPad3(applet));
		inumpad.add(new NumPad4(applet));
		inumpad.add(new NumPad5(applet));
		inumpad.add(new NumPad6(applet));
		inumpad.add(new NumPad7(applet));
		inumpad.add(new NumPad8(applet));
		inumpad.add(new NumPad9(applet));
		inumpad.add(new NumPad0(applet));
		
	}	
	
	public void draw(PApplet applet) {
		/**
		 * Method to Display the Key Pad Screen
		 * Call the NumDisplay Function to Invoke the Composite Pattern
		 * Done @ by Pawan
		*/ 
		// TODO Auto-generated method stub
		applet.size(364,688);
		img=applet.loadImage("/phone.png");		
		applet.image(img, 0,0);

		applet.image(applet.loadImage("/panel.png"), 22,135);
		applet.image(applet.loadImage("/event_home33.jpg"), 50,210);	
		NumDisplay();
		
		applet.image(applet.loadImage("/blank.png"), 22,546);
		applet.image(applet.loadImage("/cancel.png"), 235,545);
	}
	public static String getPassword() {
		/**
		 * return password
		 * Done @ by Ashwini
		 
		*/ 
		return password;
	}
	public static void setPassword(String password) {
		/**
		 * set the Value as password
		 * Done @ by Ashwini
		 
		*/ 
		KeyPad.password = password;
	}	
	
	public String getState(){
		/**
		 * return the State
		 * Done @ by Ashwini
		 
		*/ 

		return state.getState();
	}

	public void setState(IPassCode state){
		/**
		 * set the Value as state
		 * Done @ by Ashwini
		 
		*/ 
		System.out.println("Set state as:: "+state);

		this.state=state;
	}

	public IPassCode getNoPinState(){
		/**
		 * return value NoPinState
		 * Done @ by Ashwini
		 
		*/ 
		return NoPinState;
	}

	public IPassCode getOnePinState(){
		/**
		 * return value OneState
		 * Done @ by Ashwini
		 
		*/ 
		return OnePinState;
	}

	public IPassCode getTwoPinState(){
		/**
		 * return value TwoState
		 * Done @ by Ashwini
		 
		*/ 
		return TwoPinState;
	}

	public IPassCode getThreePinState(){
		/**
		 * return valueThreeState
		 * Done @ by Ashwini
		 
		*/ 
		return ThreePinState;
	}

	public IPassCode getFourPinState(){
		/**
		 * return value FourState
		 * Done @ by Ashwini
		 
		*/ 
		return FourPinState;
	}


	public void pressedNumber(String input){
		/**
		 * Based on the State run the Method pressedNumer
		 * Done @ by Ashwini
		 
		*/ 
		state.pressedNumber(input);
		
	}

	public String backspace(){
		/**
		 * Based on the State run the backspace Method
		 * Done @ by Ashwini
		 
		*/ 

		state.backspace();
		return "bk";
	}

	public void updatePassword(String num){

		if(num == "" && password.length()>0)
			password=password.substring(0,password.length()-1);
		else 
			password += num;			
	}

	@Override
	public void NumDisplay() {
		/**
		 * Implementation of the Composite Pattern
		 * Done @ by Pawan
		 
		*/ 
		for(INumPad obj : inumpad){
			obj.NumDisplay();
		}
		
	}

	@Override
	public void addDisplay(INumPad c) {
		/**
		 * Implementation of the Composite Pattern
		 * Done @ by Pawan
		 
		*/ 
		inumpad.add(c);
		
	}

	@Override
	public void removeDisplay(INumPad c) {
		/**
		 * Implementation of the Composite Pattern
		 * Done @ by Pawan
		 
		*/ 
		inumpad.remove(c);
		
	}

	@Override
	public INumPad getDisplayNum(int i) {
		/**
		 * Implementation of the Composite Pattern
		 * Done @ by Pawan
		 
		*/ 
		return null;
	}

}
