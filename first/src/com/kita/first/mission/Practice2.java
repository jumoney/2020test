package com.kita.first.mission;

import java.util.Random;

public class Practice2 {
	public static void main(String[] args) {
		//랜덤값 뽑기
		
		//0~15
		double r = Math.random();
		int rVal = (int)(r * 16);
		System.out.println(rVal);
		
		int rVal2 = (int)(Math.random() * 16);
		System.out.println(rVal2);
		
		int rVal3 = (int)((Math.random() * 15)+1);
		System.out.println(rVal3);
		
		//30~50
		int rVal4 = (int)((Math.random() * 21)+30);
		System.out.println(rVal4);
		
		//46~77
		int rVal5 = (int)((Math.random() * 32)+46);
		System.out.println(rVal5);
		
		
	}
}
