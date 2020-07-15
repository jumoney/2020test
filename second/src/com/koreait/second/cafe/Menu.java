package com.koreait.second.cafe;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	List<MenuItem> arr = new ArrayList();
	
	public Menu() {
		super();
		init();
	}
	public Menu(List<MenuItem> arr) {
		this.arr = arr;
	}
	public void init() {
		arr.add(new MenuItem("아메리카노", 1500));
		arr.add(new MenuItem("카푸치노", 2000));
		arr.add(new MenuItem("카라멜 마키야또", 2500));
		arr.add(new MenuItem("에스프레소", 2500));
	}
	public void showMenu() {
		System.out.println("Menu");
		for(int i = 0; i<arr.size(); i++) {
			System.out.printf("%d. %s\n", i+1, arr.get(i));
		}	
	}
	
	public void plusMenu(String name, int price) {
		MenuItem mi = new MenuItem(name, price);
		arr.add(mi);
	}
	public void plusMenu(MenuItem mi) {
		arr.add(mi);
	}
	public MenuItem choose(int n) {
			return arr.get(n);
	}
}
