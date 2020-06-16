package com.kita.first.mission;

 /*
  * 2~9단 
  * 단 단이 바뀔때 개행을 해줄것
  */

public class Mission6_3 {
	public static void main(String[] args) {
		
		for(int i=2; i<=9; i++) {
			for(int j=1; j <=9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, (i*j));
			}
			System.out.println("----------");
		}
	}
}
