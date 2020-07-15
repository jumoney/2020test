package com.koreait.second.blackjack;

public class Dealer extends Gamer{
	
	public Dealer() {
		super();
		this.name = "딜러";
	}
	
	@Override
	public void moreCards(CardDeck cd) {
		
		while(this.getTotalPoint() < 17) {
			this.receiveCard(cd.getCard());
		}
		
	}
	
}
