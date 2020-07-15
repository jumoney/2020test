package com.koreait.second.cafe;

import java.util.ArrayList;
import java.util.List;

public class Cafe {

	public static void main(String[] args) {
		Customer cus = new Customer();
		Menu menu = new Menu();
		Barista bas = new Barista();
		
		MenuItem choiceMenu = cus.oder(menu);
		Coffee coffee = bas.makeCoffee(choiceMenu);
		
		cus.drinkCoffee(coffee);
		System.out.println(coffee.getName() + " 나왔습니다.");
		if(coffee.getName().equals("빈잔")) {
			coffee = null;
		}
		System.out.println(coffee);
	}

}
