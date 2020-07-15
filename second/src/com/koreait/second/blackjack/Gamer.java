package com.koreait.second.blackjack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Gamer {
	
	private List<Card> arr = new LinkedList();
	String name;
	
	public Gamer() {
		super();
		name = "게이머";
	}
	
	public void receiveCard(Card cd) {
		arr.add(cd);
	}
	
	public int getTotalPoint() {
		int sum = 0;
		for(Card c : arr)
		{
			sum += c.getPOINT();
		}
		return sum;
	}
	
	public void openCards() {
		System.out.println(name);
		for(Card c: arr)
		{
			System.out.println(c);
		}
		System.out.printf("점수:%3d\n", getTotalPoint());
	}
	
	public void moreCards(CardDeck cd) {
		Scanner scan = new Scanner(System.in);
		String a;
		
		while(true) {
			this.openCards();
			System.out.print("카드를 더 받으시겠습니까?(y/n): ");
			a = scan.next();
			if(a.equals("y") || a.equals("Y")) {
				this.receiveCard(cd.getCard());
			}else if(a.equals("n") || a.equals("N")) {
				return;
			}else {
				System.out.println("정확히 입력하세요.");
			}	
		}
	}
	
}
