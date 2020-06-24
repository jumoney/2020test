package com.kita.first.level2;

public class ArrayOder {

	public static void main(String[] args) {
		int[] arr = { 29, 33, 15, 88};
		int temp;

		temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		System.out.println(arr[0] + "," + arr[1]);

		for (int i = 0; i < arr.length-1; i++) {
			
			for (int z = i+1; z < arr.length; z++) {
				if (arr[i] > arr[z]) {
					temp = arr[i];
					arr[i] = arr[z];
					arr[z] = temp;
				}
			}
			
		}
		
		for(int val : arr) {
			System.out.print(val + ", ");
		}

	}

}
