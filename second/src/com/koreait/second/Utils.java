package com.koreait.second;

public class Utils {
	public static int parseStringToInt(String str, int num) {
		int temp = num;

		try {
			temp = Integer.parseInt(str);
		} catch (Exception e) {
		}

		return temp;
	}

	public static int parseStringToInt(String str) {
		return parseStringToInt(str, 0);

	}

	public static void sortASC(int[] arr) {
		sort(arr, true);
	}

	public static void sortDESC(int[] arr) {
		sort(arr, false);
	}

	public static void sort(int[] arr, boolean b) {
		int temp;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int z = i + 1; z < arr.length; z++) {
				if (b == (arr[i] > arr[z])) {
					temp = arr[i];
					arr[i] = arr[z];
					arr[z] = temp;
				}
			}
		}
	}

	public static void printArr(int[] arr) {
		if (arr != null) {
			System.out.print("[");
			for (int i = 0; i < arr.length; i++) {
				if (i == 0) {
					System.out.print(arr[i]);
				} else {
					System.out.print(", " + arr[i]);
				}
			}
			System.out.println("]");
		} else {
			System.out.println("arr is null");
		}
	}

	public static int[] createRandomArr(int sNum, int eNum, int size) {
		int[] rArr = new int[size];

		for (int i = 0; i < size; i++) {
			rArr[i] = (int) Math.random() * (eNum - sNum + 1) + sNum;

		}
		return rArr;
	}

	public static int[] createRandomArrNoDuplication(int sNum, int eNum, int size) {
		int[] rArr = new int[size];
		if ((eNum - sNum)+1 < size) {
			return null;
		}
		for (int i = 0; i < size; i++) {

			rArr[i] = (int) (Math.random() * eNum - sNum + 1  + sNum);

			for (int z = 0; z < i; z++) {
				if (rArr[i] == rArr[z]) {
					i--;
					break;
				}
			}

		}
		return rArr;
	}

}
