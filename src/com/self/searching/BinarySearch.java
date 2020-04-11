
package com.self.searching;

public class BinarySearch {

	public static int search(int a[], int data) {

		int l = 0;
		int r = a.length;
		int i = 0;

		while (l < r) {
			System.out.println("Loop count:" + i++);
			int mid = (l + r) / 2;
			if (data == a[mid]) {
				return mid;
			} else if (data < a[mid]) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return -1;
	}

}
