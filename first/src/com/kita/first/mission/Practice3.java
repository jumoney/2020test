package com.kita.first.mission;

public class Practice3 {
	public static void main(String[] args) {

		int len = 9;
		int[] arr = new int[len];
		// 1~9사이에 랜덤한 값을 중복되지 않게 arr배열 크기만큼 초기화 한다.

		for (int i = 0; i < arr.length; i++) {

			arr[i] = (int) (Math.random() * 9) + 1;

			for (int z = 0; z < i; z++) {

				if (arr[i] == arr[z]) {
					i--;
					break;
				}

			}
		}

		for (int val : arr) {
			System.out.print(val + ", ");
		}
	}

}
