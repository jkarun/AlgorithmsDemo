package com.arun.dynamicpgm.memoization;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * Memoization is a technique for implementing dynamic programming to make recursive algorithms efficient. 
 * https://dzone.com/articles/memoization-make-recursive-algorithms-efficient
 * https://www.interviewcake.com/concept/java/memoization
 * */

public class Memoization {
	private static Map<Integer, Integer> memo = new HashMap<>();

	// without memoization
	static int fib(int n) {

		if (n < 0) {
			throw new IllegalArgumentException("Index was negative. No such thing as a negative index in a series.");
		}

		// base cases
		if (n == 0 || n == 1) {
			return n;
		}

		System.out.printf("computing fib(%d)\n", n);
		return fib(n - 1) + fib(n - 2);

	}

	// memoized version
	static int fibonacciMemo(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Index was negative. No such thing as a negative index in a series.");

			// base cases
		} else if (n == 0 || n == 1) {
			return n;
		}

		// see if we've already calculated this
		if (memo.containsKey(n)) {
			System.out.printf("grabbing memo[%d]\n", n);
			return memo.get(n);
		}

		System.out.printf("computing fib(%d)\n", n);
		int result = fibonacciMemo(n - 1) + fibonacciMemo(n - 2);

		// memoize
		memo.put(n, result);

		return result;
	}

	public static void main(String[] args) {
		int input = 10;
		long start = System.currentTimeMillis();
		System.out.println("fibo with out memoization: " + fib(input));
		long end = System.currentTimeMillis();
		System.out.println("Time taken duration: " + (end - start) + " ms");

		start = System.currentTimeMillis();
		System.out.println("fibo with memoization: " + fibonacciMemo(input));
		end = System.currentTimeMillis();
		System.out.println("Time taken duration: " + (end - start) + " ms");
	}

}
