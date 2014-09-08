package com.event.view;

import processing.core.PApplet;

import com.event.controller.AppController;
import com.event.controller.IScreen;


public class Menu implements IScreen{

	AppController appController;
	public Menu(AppController appController){
		this.appController = appController;
	}
	
	public void selectMenuItem(int x, int y) {
		/**
		 * Implement the Command Design Pattern
		 * Based on the Action performed the invoke method is executed to run it 
		 * Done @ by Neema
		*/ 
        if (x > 40 && x < 90 && y > 545 && y < 580) {
        	HomeScreenMenuItem homeScreenMenuItem = new HomeScreenMenuItem();
			homeScreenMenuItem.setCommand(new HomeScreenConcreteCommand(appController));
			homeScreenMenuItem.invoke();
        }
       else if (x > 120 && x < 190 && y > 545 && y < 580) {
    	   MixEventScreenMenuItem mixEventScreenMenuItem  = new MixEventScreenMenuItem();
    	   mixEventScreenMenuItem.setCommand(new MixEventConcreteCommand(appController));
    	   mixEventScreenMenuItem.invoke();
            
        }
        else if (x > 200 && x < 260 && y > 545 && y < 580) {
        	System.out.println("in receipt");
        	ReceiptScreenMenuItem receiptScreenMenuItem = new ReceiptScreenMenuItem();
			receiptScreenMenuItem.setCommand(new ReceiptScreenConcreteCommand(appController));
			receiptScreenMenuItem.invoke();
        }
        else if (x > 280 && x < 340 && y > 545 && y < 580) {
        	System.out.println("in maps");
        	MapScreenMenuItem mapScreenMenuItem = new MapScreenMenuItem();
        	mapScreenMenuItem.setCommand(new MapScreenConcreteCommand(appController));
        	mapScreenMenuItem.invoke();
        }
       
         
    }
	/*public void selectMenuItem(String menuItem){
		
		if(menuItem.equalsIgnoreCase("home")){
			HomeScreenMenuItem homeScreenMenuItem = new HomeScreenMenuItem();
			homeScreenMenuItem.setCommand(new HomeScreenConcreteCommand(appController));
			homeScreenMenuItem.invoke();
		}
	}*/

	@Override
	public void setup(PApplet applet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(PApplet applet) {
		// TODO Auto-generated method stub
		selectMenuItem(applet.mouseX, applet.mouseY);
	}

	@Override
	public void draw(PApplet applet) {
		// TODO Auto-generated method stub
		
	}
	
}
