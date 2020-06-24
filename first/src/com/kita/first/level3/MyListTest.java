package com.kita.first.level3;

public class MyListTest {
	public static void main(String[] args) {
		MyList list = new MyList();
		list.add(10);
		list.add(15);
		list.add(20);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ", ");
		}
		System.out.println();
		
		list.add(1, 100);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ", ");
		}
		System.out.println();
		
		int delVal = list.remove(1);
		
		System.out.println(delVal);
	}

}

class MyList {
	private int[] arr;

	MyList() {
		arr = new int[0];
	}

	void add(int num) {

		int[] temp = new int[arr.length + 1];

		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}

		temp[arr.length] = num;
		arr = temp;
	}

	void add(int idx, int num) {
		int[] temp = new int[arr.length + 1];

		for (int i = 0; i < arr.length; i++) {
			temp[(i<idx) ? i : i + 1] = arr[i];	
		}
		
		temp[idx] = num;
		
		arr = temp;
	}

	int remove(int idx) {
		int[] temp = new int[arr.length - 1];
		int temp2;
		
		for (int i = 0; i < temp.length; i++) {
			temp[i] = (i >= idx) ? arr[i + 1] : arr[i];
		}
		
		temp2 = arr[idx];
		arr = temp;
		
		return temp2;
	}

	int remove() {
		return remove(arr.length-1);
	}

	int get(int idx) {
		return arr[idx];
	}

	int size() {
		return arr.length;
	}

}
