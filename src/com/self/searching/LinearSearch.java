package com.self.searching;

public class LinearSearch {

	public static int search(int[] a, int data) {

		for (int i = 0; i < a.length; i++) {
			System.out.println("Loop count:" + i);
			if (data == a[i]) {
				return i;
			}
		}
		return -1;

	}

}
