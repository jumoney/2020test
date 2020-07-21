package com.koreait.second.test;

public class Card {
	public static final String[] PATTENS = {"스페이드", "클로버", "하트", "다이아"};
	private final String PATTEN;
	private final String NUM;
	private final int POINT;
	
	public Card(String patten, String num, int point) {
		this.PATTEN = patten;
		this.NUM = num;
		this.POINT = point;
	}

	public String getPATTEN() {
		return PATTEN;
	}

	public String getNUM() {
		return NUM;
	}

	public int getPOINT() {
		return POINT;
	}
	
	@Override
	public String toString() {
		return String.format("p: %s d: %s p: %d", this.PATTEN, this.NUM, this.POINT);
	}
	
	
	
}
