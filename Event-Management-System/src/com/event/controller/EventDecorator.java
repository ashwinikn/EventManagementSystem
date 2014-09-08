package com.event.controller;

public abstract class EventDecorator implements Event{
	protected Event event;
	
	public EventDecorator(Event event){
		/**
		 * set the Value as event
		 * Done @ by Preeti
		 
		*/ 
		this.event = event;
	}
	
	
	public double getCost(){
		/**
		 * return the Value of cost 
		 * Done @ by Preeti
		 
		*/ 
		return event.getCost();
	}
}
