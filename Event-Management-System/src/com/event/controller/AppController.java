package com.event.controller;

import com.event.view.CharityScreen;
import com.event.view.CorporateScreen;
import com.event.view.HomeScreen;
import com.event.view.KeyPad;
import com.event.view.MapScreen;
import com.event.view.MixEventScreen;
import com.event.view.MusicScreen;
import com.event.view.PinScreen;
import com.event.view.ReceiptScreen;
import com.event.view.SportsScreen;
import com.event.controller.IScreen;

import processing.core.PApplet;
/**
 * AppController App is The Main Control of the complete Application.
 * It initiates the Screen and respective change of screen as we browse through the Application
 * 
 
*/ 
public class AppController extends PApplet{

	private static final long serialVersionUID = 1L;
	
	IScreen pinScreen;
	IScreen homeScreen;
	IScreen sportsScreen;
	IScreen musicScreen;
	IScreen corporateScreen;
	IScreen charityScreen;
	IScreen currentScreen;
	IScreen receiptScreen;
	IScreen mapScreen;
	IScreen mixEventScreen;
	double cost;
	
	
	public AppController(){
		
		/**
		 * Initial Setup for the Screen Change.
		 * Set the startup to be Lock pin screen
		 * Done @ by Ashwini
		 
		*/ 
		pinScreen = new PinScreen(this);
		homeScreen = new HomeScreen(this);
		sportsScreen = new SportsScreen(this);
		musicScreen = new MusicScreen(this);
		corporateScreen = new CorporateScreen(this);
		charityScreen = new CharityScreen(this);
		receiptScreen = new ReceiptScreen(this);
		mapScreen = new MapScreen(this);
		mixEventScreen = new MixEventScreen(this);
		currentScreen = pinScreen;
		setCurrentScreen(pinScreen);
	}
	
	
	public void setup() {

		currentScreen.setup(this);
	}


	@Override
	public void mousePressed() {
		/**
		 * Override the Main Class Function to Run the mousePressed method based on which state it is on currently
		 *Runs the Draw method based on which state it is on currently
		 
		*/ 

		currentScreen.mousePressed(this);
		currentScreen.draw(this);
	}

	public IScreen getCurrentScreen() {

		/**
		 * get the value of the "currentScreen"
		 * * Done @ by Ashwini
		 
		*/ 
		return currentScreen;
	}
	
	public void setCurrentScreen(IScreen currentScreen) {
		/**
		 * Change the value of "currentScreen" the the new value
		 * Done @ by Ashwini
		 
		*/ 
		this.currentScreen = currentScreen;
	}
	
	public void draw(){
		/**
		 * Call Method based of Current Screen State
		 * Done @ by Ashwini
		 
		*/ 
		currentScreen.draw(this);
	}
	
	public IScreen getPinScreen() {
		/**
		 * Get the Value pinScreen
		 * Done @ by Ashwini
		 
		*/ 
		return pinScreen;
	}

	public void setPinScreen(IScreen pinScreen) {
		/**
		 * Change the value of pinScreen
		 * Done @ by Ashwini
		 
		*/ 
		this.pinScreen = pinScreen;
	}
	
	public IScreen getCharityScreen() {
		/**
		 * return the Value as charityScreen
		 * Done @ by Ashwini
		 
		*/ 
		return charityScreen;
	}

	public void setCharityScreen(IScreen charityScreen) {
		/**
		 * set the Value as charityScreen
		 * Done @ by Ashwini
		 
		*/ 
		this.charityScreen = charityScreen;
	}
	public IScreen getCorporateScreen() {
		/**
		 * return the Value as corporateScreen
		 * Done @ by Ashwini
		 
		*/ 
		return corporateScreen;
	}

	public void setCorporateScreen(IScreen corporateScreen) {
		/**
		 * set the Value as corporateScreen
		 * Done @ by Ashwini
		 
		*/ 
		this.corporateScreen = corporateScreen;
	}
	
	public IScreen getHomeScreen() {
		/**
		 * return the Value as homeScreen
		 * Done @ by Ashwini
		 
		*/ 
		return homeScreen;
	}

	public void setHomeScreen(IScreen homeScreen) {
		/**
		 * set the Value as homeScreen
		 * Done @ by Ashwini
		 
		*/ 
		this.homeScreen = homeScreen;
	}
	
	public IScreen getMusicScreen() {
		/**
		 * return the Value as getMusicScreen
		 * Done @ by Ashwini
		 
		*/ 
		return musicScreen;
	}

	public void setMusicScreen(IScreen musicScreen) {
		/**
		 * set the Value as musicScreen
		 * Done @ by Ashwini
		 
		*/ 
		this.musicScreen = musicScreen;
	}
	

	public IScreen getSportsScreen() {
		/**
		 * return the Value as sportsScreen
		 * Done @ by Ashwini
		 
		*/ 
		return sportsScreen;
	}

	public void setSportsScreen(IScreen sportsScreen) {
		/**
		 * set the Value as sportsScreen
		 * Done @ by Ashwini
		 
		*/ 
		this.sportsScreen = sportsScreen;
	}


	public IScreen getReceiptScreen() {
		/**
		 * return the Value as receiptScreen
		 * Done @ by Ashwini
		 
		*/ 
		return receiptScreen;
	}


	public void setReceiptScreen(IScreen receiptScreen) {
		/**
		 * set the Value as receiptScreen
		 * Done @ by Ashwini
		 
		*/ 
		this.receiptScreen = receiptScreen;
	}


	public IScreen getMapScreen() {
		/**
		 * return the Value as mapScreen
		 * Done @ by Ashwini
		 
		*/ 
		return mapScreen;
	}


	public void setMapScreen(IScreen mapScreen) {
		/**
		 * set the Value as mapScreen
		 * Done @ by Ashwini
		 
		*/ 
		this.mapScreen = mapScreen;
	}


	public double getCost() {
		/**
		 * return the Value as cost
		 * Done @ by Ashwini
		 
		*/ 
		return cost;
	}


	public void setCost(double cost) {
		/**
		 * set the Value as cost
		 * Done @ by Ashwini
		 
		*/ 
		this.cost = cost;
	}


	public IScreen getMixEventScreen() {
		/**
		 * return the Value as mixEventScreen
		 * Done @ by Ashwini
		 
		*/ 
		return mixEventScreen;
	}


	public void setMixEventScreen(IScreen mixEventScreen) {
		/**
		 * set the Value as mixEventScreen
		 * Done @ by Ashwini
		 
		*/ 
		this.mixEventScreen = mixEventScreen;
	}
}
