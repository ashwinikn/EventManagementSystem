package com.event.view;

import com.event.controller.Event;

public class EventCost {
	
	public static void main(String[] args){
		/**
		 * Method for  Cost of Event Ticket
		 * Done @ by Preeti
		 
		*/ 
		Event event = new SportsEvent(new ConcreteEvent());
		System.out.println("Cost is :: "+event.getCost());
	}

}
