package com.event.view;

import processing.core.PApplet;
import processing.core.PImage;

import com.event.controller.AppController;
import com.event.controller.IScreen;

public class MusicScreen implements IScreen{
	AppController appController;
	PImage corp_event,img,event_1,event_2,event_3,event_4;
	Menu menu;
	
	public MusicScreen(AppController appController){
		this.appController = appController;
	}

	@Override
	public void setup(PApplet applet) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void mousePressed(PApplet applet) {
		/**
		 * Override  the method to run the MousedPressed Methods based on the current Event
		 * Based on the Action Performed the cost is set and screen changed 
		 * Done @ by Preeti 
		 
		*/ 
		if (applet.mouseX > 40 && applet.mouseX < 320 && applet.mouseY > 545	//Home
				&& applet.mouseY < 590) {
			menu = new Menu(appController);
			menu.mousePressed(applet);
		}
		if (applet.mouseX > 295 && applet.mouseX < 330 						//Music Event
				&& applet.mouseY > 270 && applet.mouseY < 290) {
			System.out.println("hi 1");
			
			getCostAndSetScreen();
			
		}
		if (applet.mouseX > 295 && applet.mouseX < 330 						//Music Event
				&& applet.mouseY > 335 && applet.mouseY < 355) {
			System.out.println("hi 2");
			getCostAndSetScreen();
			
		}
		if (applet.mouseX > 295 && applet.mouseX < 330 						//Music Event
				&& applet.mouseY > 400 && applet.mouseY < 420) {
			System.out.println("hi 3");
			getCostAndSetScreen();
			
			
		}
		if (applet.mouseX > 295 && applet.mouseX < 330 						//Music Event
				&& applet.mouseY > 465 && applet.mouseY < 485) {
			System.out.println("hi 4");
			getCostAndSetScreen();
			
		}
		
	}

	@Override
	public void draw(PApplet applet) {
		/**
		 * Override  the method to run the Draw Methods to Display the Screen
		 * Done @ by Aswini
		 
		*/ 
		applet.size(364,688);
		img=applet.loadImage("/phone.png");
		applet.image(img, 0,0);
		corp_event = applet.loadImage("music_logo.png");
		applet.image(corp_event, 22,135);
		
		event_1 = applet.loadImage("music_event1.png");
		applet.image(event_1, 22,240);

		event_2 = applet.loadImage("music_event2.png");
		applet.image(event_2, 22,305);
		event_3 = applet.loadImage("music_event3.png");
		applet.image(event_3, 22,370);
		event_4 = applet.loadImage("music_event4.png");
		applet.image(event_4, 22,435);
		
		applet.image(applet.loadImage("/home_icon.jpg"), 40,545);
		applet.image(applet.loadImage("/event_icon.png"), 120,545);
    	applet.image(applet.loadImage("/payment_icon.jpg"), 200,545);
    	applet.image(applet.loadImage("/search_icon.jpg"), 280,545);
	}
	public void getCostAndSetScreen(){
		/**
		 * Set the Cost of This Event Ticket
		 * Change the Screen to Receipt Screen
		 * Done @ by Preeti
		 
		*/ 
		double cost = (new MusicEvent(new ConcreteEvent())).getCost();
		appController.setCost(cost);
		appController.setCurrentScreen(appController.getReceiptScreen());
	}


}