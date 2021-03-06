package com.kita.first.mission;

import java.util.Scanner;

public class Mission5 {

	/*
	 * 점수를 입력해 주세요: (0~100) 90점 이상 A 80점 이상 B 70점 이상C 나머지는 D 입니다.
	 * 
	 * 일의 자리수가 7점 이상이면 + 일의 자리수가 3점 이하이면 -
	 * 
	 * 예를 들어 95 > A, 97> A+, 83 > B-
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력해 주세요: (0~100)");
		int score = scan.nextInt();
		scan.close();

		if (score < 0 || score > 100) {
			System.out.println("잘 못 입력하셨습니다.");
			return;
		} else if (score < 70) {
			System.out.print("D");

		} else if (score < 80) {
			System.out.print("C");

		} else if (score < 90) {
			System.out.print("B");
		} else {
			System.out.print("A");
		}

		if (score == 100) {
			System.out.print("+");
		}

		else if (score >= 70 && score < 100) {
			int mod = score % 10;

			if (mod >= 7) {
				System.out.print("+");
			} else if (mod <= 3) {
				System.out.print("-");
			}
		}

	}
}
