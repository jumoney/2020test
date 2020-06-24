package com.kita.first.level2;

import java.util.Arrays;

public class ArrCopy2 {
	
	public static void main(String[] args) {
		int[] arr= {2, 4, 6, 7, 10, 55};
		int[] arr2= copyArr(arr);
		
		System.out.println(arr == arr2);
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("arr2 : " + Arrays.toString(arr2));
	}

	public static int[] copyArr(int[] arr) {
		int[] copy = new int[arr.length];
		 
		for (int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];
		}
		
		return copy;
	}
}
