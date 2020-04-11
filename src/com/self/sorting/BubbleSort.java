package com.self.sorting;

/**
 * Repeatedly swapping the adjacent element if they are in wrong order.
 * 
 * Worst Case Time Complexity [ Big-O ]: O(n2)
 * Best Case Time Complexity [Big-omega]: O(n)
 * Average Time Complexity [Big-theta]: O(n2)
 * Space Complexity: O(1)
 * 
 * @author Rajan
 *
 */

public class BubbleSort {

	public static int[] sort(int data[]) {

		int n = data.length;
		int tmp;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.println("Pass:" + i);
				if (data[j] > data[j + 1]) {
					tmp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = tmp;
				}
			}
		}

		return data;
	}
}
