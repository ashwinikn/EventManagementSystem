package com.event.view;

import com.event.controller.AppController;
import com.event.controller.Command;
import com.event.controller.IReceiver;


public class MixEventConcreteCommand implements Command{
	AppController appController;
	IReceiver iReceiver;
	public MixEventConcreteCommand(AppController appController){
		this.appController = appController;
	}
	@Override
	public void execute() {
		/**
		 * Implement the Command Design Pattern
		 * Done @ by Neema
		*/ 
		iReceiver =new IReceiver() {
			
			@Override
			public void doAction() {
				// TODO Auto-generated method stub
				appController.setCurrentScreen(appController.getMixEventScreen());
			}
		};
		
		iReceiver.doAction();
	}
	
}
