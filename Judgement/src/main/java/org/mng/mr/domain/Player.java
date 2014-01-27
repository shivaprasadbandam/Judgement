package org.mng.mr.domain;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private String playerName;
	private List<Card> listOfCards;
	private List<Card> validCards = new ArrayList<Card>(0);
	private boolean starter = false;

	public Player(String playerId) {
		this.playerName = playerId;
		listOfCards = new ArrayList<Card>();
	}

	public String getPlayerId() {
		return playerName;
	}

	public void appendCard(Card card) {
		listOfCards.add(card);
	}

	public void emptyCardsList() {
		listOfCards.clear();
	}

	public List<Card> getListOfValidCards(Face startingCardFace, Face trumpFace) {
		validCards.clear();
		if (starter) {
			validCards.addAll(listOfCards);
		} else {
			for (Card card : listOfCards) {
				if (startingCardFace.equals(card.getFace())) {
					validCards.add(card);
				}
			}
			if (validCards.size() == 0) {
				validCards.addAll(listOfCards);
			}
		}
		return validCards;
	}
}
