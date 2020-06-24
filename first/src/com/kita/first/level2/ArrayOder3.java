package com.kita.first.level2;

public class ArrayOder3 {
	//버블정렬
	public static void main(String[] args) {
		int[] arr = { 29, 33, 15, 88, 5, 46, 92, 1, 19 };
		int temp = 0;

		for (int i = arr.length - 1; i > 0; i--) {

			for (int j = 0; j < i; j++) {

				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}

		for (int var : arr) {
			System.out.print(var + ", ");
		}

	}

}
