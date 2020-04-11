package com.self.sorting;

public class SortingMain {

	public static void main(String[] args) {
		int[] data = { 109, 21, 125, 133, 45, 5};
		
		System.out.print("Unsorted Data: ");
		printData(data);
		System.out.print("Sorted Data  : ");
		printData(BubbleSort.sort(data));
	}
	
	private static void printData(int data[]) {
		for(int i: data) {
			System.out.print(i + " ");
		}
		System.out.print("\n");
	}
	
}
