package org.mng.mr.domain;

import java.util.ArrayList;
import java.util.List;

public class Judgement {
	private int playersCount;
	private Face trump;
	private int rounds;
	private int currentRound = 0;
	private boolean incrementValue = true;
	private List<Player> listOfPlayers = null;

	public Judgement(int playersCount, Face trump) {
		this.playersCount = playersCount;
		this.trump = trump;
		rounds = (int) Math.round(52.0 / playersCount);
		listOfPlayers = new ArrayList<Player>(playersCount);
	}

	public int getPlayersCount() {
		return playersCount;
	}

	public void setPlayersCount(int playersCount) {
		this.playersCount = playersCount;
	}

	public Face getTrump() {
		return trump;
	}

	public void setTrump(Face trump) {
		this.trump = trump;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public int getCurrentRound() {
		return currentRound;
	}

	public void setCurrentRound(int currentRound) {
		this.currentRound = currentRound;
	}

	/*
	 * indicates end of the Game
	 */
	public boolean isEnd() {
		return currentRound == 1 && !incrementValue;
	}

	/*
	 * ret no of cards to be distributed in each round
	 */
	public int getNumbersToBeDistributed() {

		if (incrementValue) {
			currentRound++;
		} else {
			currentRound--;
		}

		if (currentRound == rounds) {
			incrementValue = false;
		}
		return currentRound;
	}
	
	public List<Player> getPlayerList(){
		return listOfPlayers;
	}

}
