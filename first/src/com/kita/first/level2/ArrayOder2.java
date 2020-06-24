package com.kita.first.level2;

public class ArrayOder2 {
	public static void main(String[] args) {
		int least;
		int[] arr = {12, 36, 25, 78, 5, 62};
		
		for(int i = 0; i<arr.length-1; i++) {
			
			least = i;
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[least]>arr[j]) {
					least = j;
				}
				
			}
			if(i != least)
			{
				int temp = arr[i];
				arr[i] = arr[least];
				arr[least] = temp;
			}
			
		}
		
		for(int var : arr) {
			System.out.print(var + ", ");
		}
	}

}
