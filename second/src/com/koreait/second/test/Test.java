package com.koreait.second.test;

public class Test {

	public static void main(String[] args) {
		Card[] cards = new Card[52];
		int idx = 0;
		
		for (int i = 0; i < Card.PATTENS.length; i++) {
			for (int z = 1; z <= 13; z++) {
				cards[idx] = new Card(Card.PATTENS[i], getNumber(z), getPoint(z));
				idx++;
			}
		}
		
		for(int i = 0; i<cards.length; i++) {
			System.out.println(cards[i]);
		}
		
		Seson.getSeson(9);
	}

	public static String getNumber(int num) {

		switch (num) {
		case 1:
			return "A";

		case 11:
			return "J";

		case 12:
			return "Q";

		case 13:
			return "K";

		default:
			return String.valueOf(num);

		}

	}
	public static int getPoint(int num) {
		if(num > 10) {
			return 10;
		}
		else {
			return num;
		}
	}

}
