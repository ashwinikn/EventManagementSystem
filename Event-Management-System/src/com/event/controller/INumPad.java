package com.event.controller;

public interface INumPad {
	/**
	 * Interface Setup for Display of Numpad based on Composite Pattern
	 * Done @ by Pawan
	 
	*/ 

	public void NumDisplay();
	public void addDisplay(INumPad c);
	public void removeDisplay(INumPad c);
	public INumPad getDisplayNum(int i);
}
