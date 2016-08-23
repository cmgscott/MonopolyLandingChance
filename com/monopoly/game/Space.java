package com.monopoly.game;

public class Space {
	
	String name;
	int landingCounter;
	
	public Space(String name) {
		this.name = name;
		landingCounter = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public int getLandingCounter() {
		return landingCounter;
	}
	
	public void updateLandingCounter() {
		landingCounter += 1;
	}

}
