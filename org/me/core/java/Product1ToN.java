package org.me.core.java;

/**
 * Factorial of number: Recusive as well as Bottom-up solution.
 * 
 * Bottom-up algo. solution approach is option for Recursive approach and it is
 * called as Dynamic programming.
 * 
 * @author kekannag
 *
 */
public class Product1ToN {

	public static void main(String[] args) {
		// Recursive approach
		System.out.println("Recursive approach");
		System.out.println("5! --> " + calcProduct1ToN(5));
		System.out.println("6! --> " + calcProduct1ToN(6));
		System.out.println("1! --> " + calcProduct1ToN(1));
		System.out.println("0! --> " + calcProduct1ToN(0));
		System.out.println("-1! --> " + calcProduct1ToN(-1) + "\n");

		// Bottom-up approach
		System.out.println("Bottom-up approach");
		System.out.println("5! --> " + bottomUpApproach(5));
		System.out.println("6! --> " + bottomUpApproach(6));
		System.out.println("1! --> " + bottomUpApproach(1));
		System.out.println("0! --> " + bottomUpApproach(0));
		System.out.println("-1! --> " + bottomUpApproach(-1));
	}

	private static final int calcProduct1ToN(int n) {
		return (n > 1) ? (n * calcProduct1ToN(n - 1)) : 1;
	}

	private static final int bottomUpApproach(int n) {
		int result = 1;

		/*
		 * if (n <= 1) { return result; }
		 */

		// to test for loop
		if (n < 0) {
			return result;
		}

		for (int i = n; i > 0; i--) {
			result *= i;
		}
		return result;
	}

}