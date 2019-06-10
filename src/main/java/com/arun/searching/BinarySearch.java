package com.arun.searching;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		BinarySearch search = new BinarySearch();

		int[] array1 = new int[] { 1, 3, 5, 7, 9 };
		int find = 7;

		System.out.println(Arrays.binarySearch(array1, find));
		System.out.println(
				"\n\nBinary Search Iterative \ninput array: " + Arrays.toString(array1) + ", Search Number:  " + find);
		int result1 = search.binarySearchIterative(array1, find);
		if (result1 >= 0)
			System.out.println("element found at index: " + result1);
		else
			System.out.println("element not found in given array");

		System.out.println(
				"\n\nBinary Search Recursive \ninput array: " + Arrays.toString(array1) + ", Search Number:  " + find);
		int result2 = search.binarySearchRecursive(array1, find, 0, array1.length - 1);

		if (result2 >= 0)
			System.out.println("element found at index: " + result2);
		else
			System.out.println("element not found in given array");

		String[] array2 = { "contribute", "geeks", "ide", "practice" };
		String findStr = "ide";
		System.out.println("\n\nBinary Search Recursive \ninput array: " + Arrays.toString(array2)
				+ ", Search String:  " + findStr);
		int result3 = search.binarySearchRecursive(array1, find, 0, array1.length - 1);

		if (result3 >= 0)
			System.out.println("element found at index: " + result2);
		else
			System.out.println("element not found in given array");

	}

	private int binarySearchIterative(int[] array, int x) {
		int low = 0;
		int high = array.length - 1;
		int mid = 0;
		int guess = 0;

		while (low <= high) {
			mid = (low + high) / 2;
			guess = array[mid];
			System.out.println(
					"Steps: " + Arrays.toString(Arrays.copyOfRange(array, low, high)) + ", mid element: " + guess);
			if (guess == x) // Check if x is present at mid
				return mid;
			else if (guess > x) // If x is smaller, ignore right half
				high = mid - 1;
			else // If x greater, ignore left half
				low = mid + 1;
		}

		return -1;
	}

	private int binarySearchRecursive(int[] array, int x, int low, int high) {
		int mid = (low + high) / 2;
		int guess = array[mid];
		System.out
				.println("Steps: " + Arrays.toString(Arrays.copyOfRange(array, low, high)) + ", mid element: " + guess);
		if (guess == x) // Check if x is present at mid
			return mid;
		else if (guess > x) // If x is smaller, ignore right half
			return binarySearchRecursive(array, x, low, mid - 1);
		else // If x greater, ignore left half
			return binarySearchRecursive(array, x, mid + 1, high);
	}

	private int binarySearchString(String[] array, String x) {
		int low = 0, high = array.length - 1, mid = 0;
		while (low <= high) {
			mid = (low + high) / 2;

			int guess = x.compareTo(array[mid]);

			if (guess == 0)
				return mid;
			else if (guess > 1)
				high = mid - 1;
			else
				low = low + 1;

		}
		return -1;
	}
}
