package com.monopoly.game;

public class Board {

	Space[] spaces = new Space[40];
	String[] stringSpaces = {"Go", "(Brown) Mediterranean Ave", 
			"Community Chest 1", "(Brown) Baltic Ave", "Income Tax", 
			"(RailRoad) Reading Rainbow", "(LightBlue) Oreinetal Ave", 
			"Chance 1", "(LightBlue) Vermont Ave", 
			"(LightBlue) Connecticut Ave", "Jail", 
			"(Magenta) St. Charles Place", "(Utility) Electric Company", 
			"(Magenta) States Ave", "(Magenta) Virgina Ave", 
			"(RailRoad) Pennslvania Railroad", "(Orange) St. James Place", 
			"Community Chest 2", "(Orange) Tennessee Ave", 
			"(Orange) New York Ave", "Free Parking", "(Red) Kentucky Ave", 
			"Chance 2", "(Red) Indiana Ave", "(Red) Illinois Ave",
			"(RailRoad) B & O Railroad", "(Yellow) Atlantic Ave", 
			"(Yellow) Ventnor Ave", "(Utility) Water Works", 
			"(Yellow) Marvin Gardens", "Go to Jail", "(Green) Pacific Ave", 
			"(Green) North Carolina Ave", "Community Chest 3", 
			"(Green) Pennsylvania Ave", "(RailRoad) Short Line", "Chance 3", 
			"(DarkBlue) Park Place", "Luxury Tax", "(DarkBlue) Boardwalk"};
	int currentSpace = 0;
	int totalSpacesLandedOn;

	public Board() {
		for (int i = 0; i < spaces.length; i++) {
			spaces[i] = new Space(stringSpaces[i]);
		}
	}
	
	public int getBoardLength() {
		return spaces.length;
	}
	
	public String getBoardSpace(int counter) {
		return spaces[counter].getName();
	}
	
	public int getLandingCounter(int counter) {
		return spaces[counter].getLandingCounter();
	}
	
	public int totalSpacesLandedOn() {
		for (int i = 0; i < spaces.length; i++) {
			totalSpacesLandedOn += spaces[i].getLandingCounter();
		}
		return totalSpacesLandedOn;
	}




}

