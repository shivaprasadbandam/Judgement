package org.mng.mr.domain;

/**
 * @author Shiva Prasad
 * 
 */
public class Card {

	private Face face;
	private Number num;

	public Card(Face face, Number num) {
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
