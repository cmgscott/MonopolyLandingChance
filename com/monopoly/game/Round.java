package com.monopoly.game;

public class Round {
	
	Dice dice = new Dice();
	final Board BOARD = new Board();
	CommChest communityChest = new CommChest();
	Chance chance = new Chance();
	int currentSpace = 0;
	
	public void instantiateDecks() {
		communityChest.commChestInstantiate();
		chance.chanceInstantiate();
		
	}
	
	public void oneRound() {
		dice.rollDice();
		currentSpace += dice.getDiceTotal();
		if (currentSpace >= BOARD.spaces.length) {
			currentSpace = currentSpace - BOARD.spaces.length;
		}
		BOARD.spaces[currentSpace].updateLandingCounter();
	}
	
	public Board getBoard() {
		return BOARD;
	}

	public Dice getDice() {
		return dice;
	}

	public CommChest getCommunityChest() {
		return communityChest;
	}

	public Chance getChance() {
		return chance;
	}

	public int getCurrentSpace() {
		return currentSpace;
	}

}
