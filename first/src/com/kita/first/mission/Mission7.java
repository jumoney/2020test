package com.kita.first.mission;

import java.util.Scanner;

public class Mission7 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int result = 0;
		
		while(true) {
			System.out.print("숫자를 입력(종료0): ");
			num = scan.nextInt();
			
			if(num == 0) {
				break;
			}
			
			result += num;
			
		}
		
		System.out.println("합계: " + result);
		scan.close();
		
	}

}
