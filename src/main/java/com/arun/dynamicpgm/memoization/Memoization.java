package com.arun.dynamicpgm.memoization;

import java.util.Arrays;

/*
 * Memoization is a technique for implementing dynamic programming to make recursive algorithms efficient. 
 * https://dzone.com/articles/memoization-make-recursive-algorithms-efficient
 * */

public class Memoization {

	// without memoization
	static int fib(int n) {

		if (n == 0 || n == 1)
			return n;
		return fib(n - 1) + fib(n - 2);

	}

	// memoized version
	static int fibonacciMemo(int n) {
		// entry table to cache the computed values
		int[] fibs = new int[n + 1];
		// initialize entry table with -1 to say value has to calculated
		Arrays.fill(fibs, -1);

		return fibMemo(n, fibs);
	}

	static int fibMemo(int n, int[] fibs) {
		if (n == 0 || n == 1)
			return n;

		if (fibs[n] == -1) {
			fibs[n] = fibMemo(n - 1, fibs) + fibMemo(n - 2, fibs);
		}

		return fibs[n];
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println("fibo with out memoization: " + fib(20));
		long end = System.currentTimeMillis();
		System.out.println("Time taken duration: " + (end - start));

		start = System.currentTimeMillis();
		System.out.println("fibo with memoization: " + fibonacciMemo(20));
		end = System.currentTimeMillis();
		System.out.println("Time taken duration: " + (end - start));
	}

}
