package com.arun.sorting;

import java.util.Arrays;

/*

Time Complexity: O(n*n)

Auxiliary Space: O(1)

Boundary Cases: Insertion sort takes maximum time to sort if elements are sorted in reverse order. 
And it takes minimum time (Order of n) when elements are already sorted.

Algorithmic Paradigm: Incremental Approach

Sorting In Place: Yes

Stable: Yes

Online: Yes

Uses: Insertion sort is used when number of elements is small. It can also be useful when input 
array is almost sorted, only few elements are misplaced in complete big array.

*/

public class InsertionSort {

	public static void main(String[] args) {
		InsertionSort sort = new InsertionSort();
		int arr[] = { 5, 2, 6, 1, 3, 9, 8, 6 };

		System.out.println("Acutal array : \n");
		sort.printArray(arr);

		sort.insertionSort(arr);

		System.out.println("After insertion sorting : ");
		sort.printArray(arr);
	}

	private void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	private void printArray(int arr[]) {
		System.out.println(Arrays.toString(arr));
	}

}
