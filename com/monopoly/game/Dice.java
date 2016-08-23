package com.monopoly.game;

public class Dice {
	
	int dice1, dice2, diceTotal;
	
	public Dice() {
		dice1 = 1;
		dice2 = 1;
	}
	
	public void rollDice() {
		dice1 = (int) (Math.random() * 6) + 1;
		dice2 = (int) (Math.random() * 6) + 1;
		diceTotal = dice1 + dice2;
	}
	
	public int getDice1() {
		return dice1;
	}
	
	public int getDice2() {
		return dice2;
	}
	
	public int getDiceTotal() {
		return diceTotal;
	}

}
