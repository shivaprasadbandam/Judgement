package org.mng.mr.domain;

/**
 * @author Shiva Prasad
 * 
 */
public enum Card {

	TWO_SPADE(Face.SPADE, Number.TWO), THREE_SPADE(Face.SPADE, Number.THREE), FOUR_SPADE(
			Face.SPADE, Number.FOUR), FIVE_SPADE(Face.SPADE, Number.FIVE), SIX_SPADE(
			Face.SPADE, Number.SIX), SEVEN_SPADE(Face.SPADE, Number.SEVEN), EIGHT_SPADE(
			Face.SPADE, Number.EIGHT), NINE_SPADE(Face.SPADE, Number.NINE), TEN_SPADE(
			Face.SPADE, Number.TEN), JACK_SPADE(Face.SPADE, Number.JACK), QUEEN_SPADE(
			Face.SPADE, Number.QUEEN), KING_SPADE(Face.SPADE, Number.KING), ACE_SPADE(
			Face.SPADE, Number.ACE), TWO_HEART(Face.HEART, Number.TWO), THREE_HEART(
			Face.HEART, Number.THREE), FOUR_HEART(Face.HEART, Number.FOUR), FIVE_HEART(
			Face.HEART, Number.FIVE), SIX_HEART(Face.HEART, Number.SIX), SEVEN_HEART(
			Face.HEART, Number.SEVEN), EIGHT_HEART(Face.HEART, Number.EIGHT), NINE_HEART(
			Face.HEART, Number.NINE), TEN_HEART(Face.HEART, Number.TEN), JACK_HEART(
			Face.HEART, Number.JACK), QUEEN_HEART(Face.HEART, Number.QUEEN), KING_HEART(
			Face.HEART, Number.KING), ACE_HEART(Face.HEART, Number.ACE), TWO_CLUB(
			Face.CLUB, Number.TWO), THREE_CLUB(Face.CLUB, Number.THREE), FOUR_CLUB(
			Face.CLUB, Number.FOUR), FIVE_CLUB(Face.CLUB, Number.FIVE), SIX_CLUB(
			Face.CLUB, Number.SIX), SEVEN_CLUB(Face.CLUB, Number.SEVEN), EIGHT_CLUB(
			Face.CLUB, Number.EIGHT), NINE_CLUB(Face.CLUB, Number.NINE), TEN_CLUB(
			Face.CLUB, Number.TEN), JACK_CLUB(Face.CLUB, Number.JACK), QUEEN_CLUB(
			Face.CLUB, Number.QUEEN), KING_CLUB(Face.CLUB, Number.KING), ACE_CLUB(
			Face.CLUB, Number.ACE), TWO_DIAMOND(Face.DIAMOND, Number.TWO), THREE_DIAMOND(
			Face.DIAMOND, Number.THREE), FOUR_DIAMOND(Face.DIAMOND, Number.FOUR), FIVE_DIAMOND(
			Face.DIAMOND, Number.FIVE), SIX_DIAMOND(Face.DIAMOND, Number.SIX), SEVEN_DIAMOND(
			Face.DIAMOND, Number.SEVEN), EIGHT_DIAMOND(Face.DIAMOND,
			Number.EIGHT), NINE_DIAMOND(Face.DIAMOND, Number.NINE), TEN_DIAMOND(
			Face.DIAMOND, Number.TEN), JACK_DIAMOND(Face.DIAMOND, Number.JACK), QUEEN_DIAMOND(
			Face.DIAMOND, Number.QUEEN), KING_DIAMOND(Face.DIAMOND, Number.KING), ACE_DIAMOND(
			Face.DIAMOND, Number.ACE);

	Face face;
	Number num;

	Card(Face face, Number num) {
		this.face = face;
		this.num = num;
	}

	public Face getFace() {
		return face;
	}

	public void setFace(Face face) {
		this.face = face;
	}

	public Number getNum() {
		return num;
	}

	public void setNum(Number num) {
		this.num = num;
	}

}
