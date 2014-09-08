package com.event.view;

import processing.core.PApplet;

import com.event.controller.AppController;
import com.event.controller.IScreen;



public class PinScreen implements IScreen{
	AppController appController;
	KeyPad keypad;
	public PinScreen(AppController appController){
		this.appController = appController;
	}

	@Override
	public void setup(PApplet applet) {
		// TODO Auto-generated method stub
		keypad = new KeyPad(applet);
		keypad.draw(applet);
	}

	@Override
	public void mousePressed(PApplet applet) {
		/**
		 * Override  the MousePressed to Change the Screen based on Key
		 * Done @ by Aswini
		 
		*/ 
		if (applet.mouseX > 22 && applet.mouseX < 130 && applet.mouseY > 410
				&& applet.mouseY < 455) {

			keypad.pressedNumber("1");
			setCurrentScreen();


		}

		else if (applet.mouseX > 132 && applet.mouseX < 235 && applet.mouseY > 410
				&& applet.mouseY < 455) {
			keypad.pressedNumber("2");
			setCurrentScreen();
		}

		else if (applet.mouseX > 235 && applet.mouseX < 344 && applet.mouseY > 410
				&& applet.mouseY < 455) {
			keypad.pressedNumber("3");
			setCurrentScreen();

		}
		
		else if (applet.mouseX > 22 && applet.mouseX < 130
				&& applet.mouseY > 455 && applet.mouseY < 500) {
			keypad.pressedNumber("4");
			setCurrentScreen();
		}
		
		else if (applet.mouseX > 130 && applet.mouseX < 235
				&& applet.mouseY > 455 && applet.mouseY < 500) {
			keypad.pressedNumber("5");
			setCurrentScreen();
		}
		
		else if (applet.mouseX > 235 && applet.mouseX < 344
				&& applet.mouseY > 455 && applet.mouseY < 500) {
			keypad.pressedNumber("6");
			setCurrentScreen();
		}

		else if (applet.mouseX > 22 && applet.mouseX < 130
				&& applet.mouseY > 500 && applet.mouseY < 546) {
			keypad.pressedNumber("7");
			setCurrentScreen();

		}

		else if (applet.mouseX > 130 && applet.mouseX < 235
				&& applet.mouseY > 500 && applet.mouseY < 546) {
			keypad.pressedNumber("8");
			setCurrentScreen();
		}

		else if (applet.mouseX > 235 && applet.mouseX < 344
				&& applet.mouseY > 500 && applet.mouseY < 546) {
			keypad.pressedNumber("9");
			setCurrentScreen();
		}

		else if (applet.mouseX > 130 && applet.mouseX < 235
					&& applet.mouseY > 546 && applet.mouseY < 670) {
			keypad.pressedNumber("0");
			setCurrentScreen();
		}									

		else if (applet.mouseX > 235 && applet.mouseX < 344
				&& applet.mouseY > 546 && applet.mouseY < 670) {
			keypad.backspace();
			setCurrentScreen();
		} 
	}

	@Override
	public void draw(PApplet applet) {
		// TODO Auto-generated method stub
		
	}
	
	public void setCurrentScreen(){
		/**
		 * Set the Current Screen Based on the Size of Password
		 * Done @ by Ashwini
		 
		*/ 
		System.out.println("Current :: "+KeyPad.getPassword());
		if (KeyPad.getPassword().length() < 4) {			
			appController.setCurrentScreen(appController.getPinScreen());
		}
		else if((KeyPad.getPassword()).equals("1234")){
			System.out.println("Else");
			appController.setCurrentScreen(appController.getHomeScreen());
		}
	}

}
