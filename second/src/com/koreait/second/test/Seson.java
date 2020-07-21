package com.koreait.second.test;

public class Seson {
	public static void getSeson(int n) {
		
		switch(n) {
		case 1: case 2: case 11: case 12 :
			System.out.println("겨울입니다.");
			break;
		case 3: case 4: case 5: 
			System.out.println("봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println("여름입니다.");
			break;
		case 9: case 10:
			System.out.println("가을입니다.");
			break;
		}
	}
}
