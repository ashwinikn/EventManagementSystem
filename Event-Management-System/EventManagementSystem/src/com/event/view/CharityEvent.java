package com.event.view;

import com.event.controller.Event;
import com.event.controller.EventDecorator;

public class CharityEvent extends EventDecorator{

	public CharityEvent(Event event) {
		super(event);
		/**
		 * setup  the constructor of the event
		 * Done @ by Preeti
		 
		*/ 
		// TODO Auto-generated constructor stub
		System.out.println("Charity Event");
		
	}
	
	public String getEvent(){
		/**
		 * get the Value of the event
		 * Done @ by Preeti
		 
		*/ 
		return "Charity";
	}
	
	public double getCost(){
		/**
		 * get the Value of the cost 
		 * Done @ by Preeti
		 
		*/ 
		return event.getCost() + 180;
	}

}
