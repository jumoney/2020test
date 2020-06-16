package com.kita.first.mission;

public class Mission6_6 {
	public static void main(String[] args) {
		int star = 6;
		/*
		for(int i=1; i<=star; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		int line = 1;
		
		for(int i=1; i <= star*star; i++) {
			if(i < line) {
				System.out.print("*" + line + " " + i);
			}else {
				line++;
				i = 0;
				System.out.println();
			}
		}
	}
}
