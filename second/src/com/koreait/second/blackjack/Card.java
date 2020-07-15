package com.koreait.second.blackjack;

public class Card {
	public static final String[] PATTERNS = {"스페이드", "하트", "클로버", "다이아"};
	private final String PATTEN;
	private final String DENOMINATION;
	private final int POINT;
	
	public Card(String patten, String denomination, int point) {
		this.PATTEN = patten;
		this.DENOMINATION = denomination;
		this.POINT = point;
	}

	public String getPatten() {
		return PATTEN;
	}
	
	public String getDenomination() {
		return DENOMINATION;
	}
	public int getPOINT() {
		return POINT;
	}
	
	@Override
	public String toString() {
		return String.format("p: %s d: %s s:%d", 
				this.PATTEN, this.DENOMINATION, this.POINT);
	}
	
}
