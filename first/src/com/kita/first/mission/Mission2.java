package com.kita.first.mission;

import java.util.Scanner;

public class Mission2 {

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주십시오: ");
		num = scan.nextInt();

		if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}

}
