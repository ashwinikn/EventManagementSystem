package com.event.view;

import processing.core.PApplet;
import processing.core.PImage;

import com.event.controller.AppController;
import com.event.controller.IScreen;

public class MapScreen implements IScreen{
	AppController appController;
	PImage corp_event,img,event_1,event_2,event_3,event_4;
	Menu menu;
	
	public MapScreen(AppController appController){
		this.appController = appController;
	}
	@Override
	public void setup(PApplet applet) {
		/**
		 * The Method has no value here
		*/ 
		
	}

	@Override
	public void mousePressed(PApplet applet) {
		/**
		 * Override  the MousePressed to Change the Screen based on Action
		 * Done @ by Aswini
		 
		*/ 
		if (applet.mouseX > 40 && applet.mouseX < 320 && applet.mouseY > 545	//Home
				&& applet.mouseY < 590) {
			menu = new Menu(appController);
			menu.mousePressed(applet);
		}	
	}

	@Override
	public void draw(PApplet applet) {
		/**
		 * Override  the method Draw to Display the Screen 
		 * Done @ by Aswini
		 
		*/ 
		applet.size(364,688);
		img=applet.loadImage("/phone.png");
		applet.image(img, 0,0);
		
		applet.image(applet.loadImage("/maps.png"), 22,135);
		
		applet.image(applet.loadImage("/home_icon.jpg"), 40,545);
		applet.image(applet.loadImage("/event_icon.png"), 120,545);
    	applet.image(applet.loadImage("/payment_icon.jpg"), 200,545);
    	applet.image(applet.loadImage("/search_icon.jpg"), 280,545);
	}

}
