package com.koreait.second.cafe;

import java.util.Scanner;

public class Customer {
	
	public MenuItem oder(Menu menu) {
		Scanner scan = new Scanner(System.in);
		int n = 0;
		String sNum = "";
		MenuItem mi = null;
		
		while(mi == null) {
			menu.showMenu();
			System.out.print("주문할 음료를 선택해주세요.: ");
			sNum = scan.next();
			try {
				n = Integer.parseInt(sNum);
				mi = menu.choose(n-1);
			}
			catch(NumberFormatException e){
				System.out.println("번호를 정확히 입력해주세요.");
			}
			catch(Exception e){
				System.out.println("메뉴를 잘 못 선택하셨습니다.");
			}
		}
		scan.close();
		return mi;
	}
	public void drinkCoffee(Coffee coffee) {
		System.out.println(coffee.getName() + " 를 마신다.");
		coffee.doEmpty();
	}
}
