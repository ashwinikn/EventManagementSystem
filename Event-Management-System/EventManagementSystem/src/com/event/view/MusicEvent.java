package com.event.view;

import com.event.controller.Event;
import com.event.controller.EventDecorator;

public class MusicEvent extends EventDecorator{

	public MusicEvent(Event event) {
		super(event);
		/**
		 * setup  the constructor of the event
		 * Done @ by Preeti
		 
		*/ 
		System.out.println("Music Event");
		
	}
	
	
	public double getCost(){
		/**
		 * get the Value of the cost 
		 * Done @ by Preeti
		 
		*/ 
		return event.getCost() + 50;
	}

}
