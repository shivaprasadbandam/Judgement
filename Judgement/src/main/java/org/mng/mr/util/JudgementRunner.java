package org.mng.mr.util;

import java.util.List;
import java.util.Random;

import org.mng.mr.domain.Card;
import org.mng.mr.domain.Face;
import org.mng.mr.domain.Judgement;
import org.mng.mr.domain.Player;

public class JudgementRunner {

	private Card[] cardsDeck = Card.values();

	private void shuffleCards() {
		Random rand = new Random();
		int shuffle = rand.nextInt(15);
		
	}

	private void distributeCards(int cards, List<Player> listOfPlayers) {

		int iterator = 0;
		for (int i = 0; i < cards; i++) {
			for (Player player : listOfPlayers) {
				iterator++;
				player.appendCard(cardsDeck[iterator]);
			}
		}

	}

	private void startRound(int cardsCount, List<Player> listOfPlayers) {
		shuffleCards();
		distributeCards(cardsCount, listOfPlayers);
		startPlay();

	}

	private void startPlay() {

	}

	private void startGame(int playersCount) {

		Judgement jud = new Judgement(playersCount, Face.HEART);

		int round = jud.getRounds();

		for (int i = 0; i < 2 * round - 1; i++) {
			startRound(i + 1, jud.getPlayerList());
		}

	}

	public static void main(String args[]) {

	}

}

