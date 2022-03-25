package com.bubblesort;

public class SelectionSort {
	public void selectionSort(int[] array){
		int min=0;
		for (int i = 0; i < array.length; i++) {
			
			for (int j = i; j < array.length; j++) {
				if (array[i]>array[j]) {
					min=array[j];
					array[j]=array[i];
					array[i]=min;
				}
			}
		}
		printSelectionSort(array);
	}

	private void printSelectionSort(int[] array) {
		System.out.println("After SelectionSort");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

	public static void main(String[] args) {
		int array[] = {1,2,6,5,4,3,};
		System.out.println("Before Selection Sorting :");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println("\n");
		SelectionSort selectionSort = new SelectionSort();
		selectionSort.selectionSort(array);
	}
}
