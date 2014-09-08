package com.event.view;

import com.event.controller.Event;
import com.event.controller.EventDecorator;

public class CorporateEvent extends EventDecorator{

	public CorporateEvent(Event event) {
		super(event);
		/**
		 * Setup the Constructor class
		 * Done @ by Preeti
		 
		*/ 
		// TODO Auto-generated constructor stub
		System.out.println("Corporate Event");
		
	}
	
	public double getCost(){
		/**
		 * get the Value of the cost
		 * Done @ by Preeti
		 
		*/ 
		return event.getCost() + 150;
	}

}
