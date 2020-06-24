package com.kita.first.mission;

import java.util.Scanner;

public class GreatMission1 {
	/* 숫자 야구 게임 */
	public static void main(String[] args) {
		final int LEN = 5;

		Scanner scan = new Scanner(System.in);
		int[] rArr = new int[LEN];
		int[] myArr = new int[LEN];
		int s = 0, b = 0, cnt = 0;

		// 랜덤값 삽입 부분
		for (int i = 0; i < rArr.length; i++) {

			rArr[i] = (int) (Math.random() * 9) + 1;

			for (int z = 0; z < i; z++) {

				if (rArr[i] == rArr[z]) {
					i--;
					break;
				}

			}
		}
		
		//랜덤값 출력
		for (int val : rArr) {
			System.out.print(val + " ");
		}

		System.out.printf("\n---------------------\n");

		while (true) {
			// 게임 초기화
			s = 0;
			b = 0;
			cnt++;
			// 사용자 값 입력 부분
			System.out.printf("값: ");
			
			for (int i = 0; i < myArr.length; i++) {

				myArr[i] = scan.nextInt();
			}

			// 스트라이크, 볼 검사 부분
			for (int i = 0; i < rArr.length; i++) {
				for (int z = 0; z < rArr.length; z++) {

					if (myArr[i] == rArr[z]) {

						if (i == z) {
							s++;
						} else {
							b++;
						}
					}

				}

			}

			// 스트라이크 검사 부분
			if (s == LEN) {
				break;
			}
			System.out.printf("S:%d/B:%d/O:%d\n", s, b, LEN - (s + b));
			
		}
		
		System.out.printf("종료(%d번 시도)", cnt);

	}
}
