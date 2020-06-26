package com.kita.first.baseball;

import java.util.Scanner;

public class MyBall {
	private int[] myArr;
	private Scanner scan;

	public MyBall(int num) {
		init(num);
	}

	void init(int num) {
		myArr = new int[num];
		scan = new Scanner(System.in);

	}

	void setNumbers() {

		for (int i = 0; i < myArr.length; i++) {
			System.out.printf("숫자%d: ", i + 1);
			String val = scan.nextLine();
			
			try {
				myArr[i] = Integer.parseInt(val);
			}catch(Exception e) {
				i--;
				System.out.println("숫자만 입력하세요.");
				continue;
			}
			if (myArr[i] < 1 || myArr[i] > 9) {
				System.out.println("1~9값만 입력하세요.");
				i--;
				continue;
			}
			for (int z = 0; z < i; z++) {
				if (myArr[i] == myArr[z]) {
					System.out.println("중복된 값이 존재합니다.");
					i--;
					break;
				}

			}

		}
	}
	public int get(int idx) {
		return myArr[idx];
	}
}
