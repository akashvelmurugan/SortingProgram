package com.bubblesort;

public class InsertionSort {
	public void insertionSort(int[] array) {
		int n = array.length;
		int temp = 0;

		for (int i = 1; i < n; i++) {
			temp=array[i];
			int j= i-1;

			while ((j>-1)&&(array[j]>temp)) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1]=temp;
		}

		printInsertionSort(array);
	}
	private void printInsertionSort(int[] array) {
		System.out.println("After Sorting : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	public static void main(String[] args) {
		int array[] = {12,11,13,5,6};
		System.out.println("Before Sorting :");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println("\n");
		InsertionSort insertionSort = new InsertionSort();
		insertionSort.insertionSort(array);
	}
}
