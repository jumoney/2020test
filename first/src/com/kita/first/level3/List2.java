package com.kita.first.level3;

import java.util.ArrayList;

public class List2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		
		for(int i=0; i<list.size(); i++) {
			int val = list.get(i);
			System.out.print(val + ", ");
		}
		for(Object val : list) {
			System.out.print((int)val+", ");
		}

	}

}
