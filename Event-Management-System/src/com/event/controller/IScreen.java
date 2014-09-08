package com.event.controller;

import processing.core.PApplet;

public interface IScreen {
	/**
	 * Interface setup for the Screen Change based on State Design Pattern
	 * Done @ by Ashwini
	 
	*/ 
	public void setup(PApplet applet);
	public void mousePressed(PApplet applet);
	public void draw(PApplet applet);
}
