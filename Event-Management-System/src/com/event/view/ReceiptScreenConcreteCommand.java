package com.event.view;

import com.event.controller.AppController;
import com.event.controller.Command;
import com.event.controller.IReceiver;


public class ReceiptScreenConcreteCommand implements Command{
	AppController appController;
	IReceiver iReceiver;
	public ReceiptScreenConcreteCommand(AppController appController){
		this.appController = appController;
	}
	@Override
	public void execute() {
		/**
		 * Override  the method execute to implement the Command Design Pattern
		 * Done @ by Neema
		*/ 
		
		iReceiver =new IReceiver() {
			
			@Override
			public void doAction() {
				// TODO Auto-generated method stub
				appController.setCurrentScreen(appController.getReceiptScreen());
			}
		};
		
		iReceiver.doAction();
	}
	
}
