package com.bubblesort;

public class BubbleSort {
	public static void bubleSort(int[] array) {
		int n=array.length;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n-i; j++) {
				if (array[j-1]>array[j]) {
					int swap = array[j-1];
					array[j-1] = array[j];
					array[j]=swap;
				}
			}
			
		}
		printBubbleSort(array);
	}
	private static void printBubbleSort(int[] array) {
		System.out.println("Array After BubbleSort :");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}	
	}
	public static void main(String[] args) {
		int[] array = {3,60,35,2,45,320,5};
		System.out.println("Array Before BubbleSort :");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println("\n");
		bubleSort(array);
	}
}
