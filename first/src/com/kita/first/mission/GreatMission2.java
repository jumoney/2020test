package com.kita.first.mission;

import java.util.Scanner;

public class GreatMission2 {
	public static void main(String[] args) {
		final int LEN = 6;
		//변수선언
		Scanner scan = new Scanner(System.in); 
		String[] menuArr = {"사이다", "콜라", "환타", "마운틴듀", "초코우유", "바나나우유"};
		int[] priceArr = {500, 600, 700, 800, 400, 400};
		int select = 0;
		int index = 0;
		int sum = 0;	
		//메뉴 출력
		System.out.println("-메뉴-");
		for(int i=0; i<LEN; i++) {
			System.out.printf("%d. %s (%d원)\n",i+1, menuArr[i], priceArr[i]);
		}
		//선택부분
		while(true) {
			System.out.print("메뉴를 선택하세요: (종료0) ");
			select = scan.nextInt();
			index = select -1;
			if(select > LEN || select < 0) {
				System.out.println("잘못입력하셨습니다.\n");
				continue;
			}
			else if(select == 0) {
				break;
			}
			else {
				System.out.printf("%s %d원\n", menuArr[index], priceArr[index]);
				sum += priceArr[index];
			}
		}
		//종료화면 출력부분
		System.out.printf("종료! %d원 사용\n", sum);
	}
}
