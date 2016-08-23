package com.monopoly;


import com.monopoly.game.Board;
import com.monopoly.game.Round;

public class Launcher {
	
	public static void main(String[] args) {
		Round round = new Round();
		Board board = round.getBoard();
		
		for (int i = 0; i < 1000000; i++) {
			round.oneRound();
		}
		
		for (int i = 0; i < board.getBoardLength(); i++) {
			System.out.println(String.format("%s was landed on %d times.", 
					board.getBoardSpace(i), board.getLandingCounter(i)));
		}
		System.out.println(board.totalSpacesLandedOn());
	}

}
