package org.citi.core.java;

public class FindMaximumFromArray {

	public static void main(String[] args) {
		int M = 4;
		int[] A = { 1, 2, 2, 4, 3, 3, 3, 2, 2 };
		int[] COUNT = new int[M + 1];

		// I for loop to find maximum
		for (int i = 0; i < A.length; i++) {
			COUNT[A[i]] = ++COUNT[A[i]];
		}

		// temp variables
		int MAX = -1;
		int INDEX = -1;

		// II for loop to max occurence no from COUNT and its INDEX
		for (int i = 0; i < COUNT.length; i++) {
			if (COUNT[i] >= MAX) {
				MAX = COUNT[i];
				INDEX = i;
			}
		}
		
		System.out.println("Answer is " + INDEX);
	}

}
