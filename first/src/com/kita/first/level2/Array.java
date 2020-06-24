package com.kita.first.level2;

public class Array {
	public static void main(String[] args) {
		int[] arr = new int[4];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		char[] arr2 = new char[20];
		float[] arr3 = new float[10];
		String[] arr4 = new String[200];
		
		int[] arr5 = {10, 20, 30, 40};
		int[] arr6 = arr5;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		
		System.out.println("-------------------------");
		
		int[] arr7 = new int[10];
		
		for(int i=0; i<arr7.length; i++) {
			arr7[i] = 5;
		}
		
		for(int i=0; i<arr7.length; i++) {
			System.out.println(arr7[i]);
		}
	}

}
