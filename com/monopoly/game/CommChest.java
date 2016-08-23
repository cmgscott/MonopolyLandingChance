package com.monopoly.game;

import java.util.Arrays;
import java.util.Collections;

public class CommChest extends Card {

	int placeCounter = 0;
	Card[] commChestDeck = new Card[17];
	Card[] commChestDiscard = new Card[17];
	String[] commCards = {"Advance to Go (Collect $200)",
			"Bank error in your favor – collect $75",
			"Doctor's fees – Pay $50",
			"Get out of jail free – this card may be kept until needed, or "
			+ "sold",
			"Go to jail – go directly to jail – Do not pass Go, do not collect"
			+ " $200",
			"It is your birthday Collect $10 from each player",
			"Grand Opera Night – collect $50 from every player for opening "
			+ "night seats",
			"Income Tax refund – collect $20",
			"Life Insurance Matures – collect $100",
			"Pay Hospital Fees of $100",
			"Pay School Fees of $50",
			"Receive $25 Consultancy Fee",
			"You are assessed for street repairs – $40 per house, $115 per "
			+ "hotel",
			"You have won second prize in a beauty contest– collect $10",
			"You inherit $100",
			"From sale of stock you get $50",
	"Holiday Fund matures - Receive $100"};

	Card card = new Card();

	public CommChest() {

	}

	public void commChestInstantiate() {
		for (int i = 0; i < commChestDeck.length; i++) {
			commChestDeck[i] = new Card(commCards[i]);
		}
	}

	public Card drawCard() {
		if (placeCounter > commChestDeck.length) {
			placeCounter = 0;
			for (int i = 0; i > commChestDeck.length; i++) {
				commChestDeck[i] = commChestDiscard[i];
				commChestDiscard[i] = null;
			}
		}
		card = commChestDeck[placeCounter];
		commChestDiscard[placeCounter] = card;
		commChestDeck[placeCounter] = null;
		placeCounter++;

		return card;
	}

	public void shuffle() {
		Collections.shuffle(Arrays.asList(commChestDeck));
	}


}
