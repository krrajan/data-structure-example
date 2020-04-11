
package com.self.searching;

public class SearchMian {
	public static void main(String[] args) {
		int[] a = { 10, 21, 25, 33, 45, 55, 81, 91, 92,93,94,95,96,97,98 };
		
		System.out.println("Index: " + LinearSearch.search(a, 98));
		System.out.println("Index: " + BinarySearch.search(a, 98));
	}

}
