package com.kita.first.mission;

import java.util.Scanner;

public class Mission8 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int max = 90;
		int min = 10;
		System.out.printf("랜덤값 %d~%d을 맞추는 게임\n",min, max);
		System.out.println("------------------");
		int rVal = (int)(Math.random() * (max - min +1) + min);
		int uNum = 0;
		Integer i = new Integer(1);
		
		
		while(true) {
		
			System.out.print("값입력: ");
			
			uNum = scan.nextInt();
			
			if(uNum < min || uNum > max) {
				System.out.println("잘못입력하셨습니다.");
			}
			else if(rVal > uNum) {
				System.out.println("UP");
			}
			else if(rVal < uNum) {
				System.out.println("DOWN");
			}
			else {
				break;
			}
		}
		System.out.println("Great!!!");
		scan.close();
	}

}
