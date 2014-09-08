package com.event.view;

import processing.core.PApplet;
import processing.core.PImage;
import com.event.controller.AppController;
import com.event.controller.IScreen;



public class HomeScreen implements IScreen {
	
	PImage upc,img,Sports, Corporate, Music, Charity;
	AppController appController;
	Menu menu;
	
	public HomeScreen(AppController appController){
		this.appController = appController;
	}

	@Override
	public void setup(PApplet applet) {
		/**
		 * Override  the method to setup the Display the Home Screen
		 * Done @ by Aswini
		 
		*/ 
		applet.size(364,688);
		img=applet.loadImage("/phone.png");
		applet.image(img, 0,0);

		upc = applet.loadImage("event_logo.png");
		applet.image(upc, 22,135);
		
		Sports = applet.loadImage("sports.png");
		applet.image(Sports, 22, 248);
		
		
		Corporate = applet.loadImage("corporate.png");
		applet.image(Corporate, 22,311);
		
		Music = applet.loadImage("music.png");
		applet.image(Music, 22,374);
		
		Charity = applet.loadImage("charity.png");
		applet.image(Charity, 22,437);
		
		applet.image(applet.loadImage("/home_icon.jpg"), 40,545);
		applet.image(applet.loadImage("/event_icon.png"), 120,545);
    	applet.image(applet.loadImage("/payment_icon.jpg"), 200,545);
    	applet.image(applet.loadImage("/search_icon.jpg"), 280,545);
	}

	@Override
	public void mousePressed(PApplet applet) {
		/**
		 * Override  the MousePressed to Change the Screen based on Action
		 * Done @ by Aswini
		 
		*/ 
		// TODO Auto-generated method stub
		/* if (applet.mouseX > 120 && applet.mouseX < 200					//Events
				&& applet.mouseY > 545 && applet.mouseY < 590) {
			appController.setCurrentScreen(appController.getMyCardOptions());
		} else if (applet.mouseX > 200 && applet.mouseX < 280					//Payment
				&& applet.mouseY > 545 && applet.mouseY < 590) {
			appController.setCurrentScreen(appController.getMyCardsPay());
		}else if (applet.mouseX > 280 && applet.mouseX < 360					//Search	
				&& applet.mouseY > 545 && applet.mouseY < 590) {
			appController.setCurrentScreen(appController.getMyCardsPay());
		}else*/ if (applet.mouseX > 22 && applet.mouseX < 350						//Sports Event
				&& applet.mouseY > 248 && applet.mouseY < 311) {
			appController.setCurrentScreen(appController.getSportsScreen());
		}else if (applet.mouseX > 22 && applet.mouseX < 350						//Corporate Event
				&& applet.mouseY > 311 && applet.mouseY < 374) {
			appController.setCurrentScreen(appController.getCorporateScreen());
		}else if (applet.mouseX > 22 && applet.mouseX < 350						//Music Event
				&& applet.mouseY > 374 && applet.mouseY < 437) {
			appController.setCurrentScreen(appController.getMusicScreen());
		}else if (applet.mouseX > 22 && applet.mouseX < 350						//Charity Event
				&& applet.mouseY > 437 && applet.mouseY < 500) {
			appController.setCurrentScreen(appController.getCharityScreen());
		}else if (applet.mouseX > 40 && applet.mouseX < 320 && applet.mouseY > 545	//Home
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

		upc = applet.loadImage("event_logo.png");
		applet.image(upc, 22,135);
		
		Sports = applet.loadImage("sports.png");
		applet.image(Sports, 22, 248);
		
		
		Corporate = applet.loadImage("corporate.png");
		applet.image(Corporate, 22,311);
		
		Music = applet.loadImage("music.png");
		applet.image(Music, 22,374);
		
		Charity = applet.loadImage("charity.png");
		applet.image(Charity, 22,437);
		
		applet.image(applet.loadImage("/home_icon.jpg"), 40,545);
		applet.image(applet.loadImage("/event_icon.png"), 120,545);
    	applet.image(applet.loadImage("/payment_icon.jpg"), 200,545);
    	applet.image(applet.loadImage("/search_icon.jpg"), 280,545);
	}

}
