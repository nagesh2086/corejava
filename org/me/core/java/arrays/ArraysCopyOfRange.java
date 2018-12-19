package org.me.core.java.arrays;

import java.util.Arrays;

public class ArraysCopyOfRange {

	public static void main(String[] args) {
		int[] original = new int[] { 12, 5, 9, 0, 34, 6, 9, 23, 77 };
		System.out.println(original.length);// expecting - 9

		int[] result = Arrays.copyOfRange(original, 0, 9);
		System.out.println(result.length);
		
		if (original.length == result.length) {
			int oHashCode = Arrays.hashCode(original);
			System.out.println("Original hashcode --> " + oHashCode);
			int rHashCode = Arrays.hashCode(result);
			System.out.println("Result hashcode --> " + rHashCode);
		}
		
		if (result == original) {
			System.out.println("Arrays.copyOfRange(original, 0, 9);" + (result == original));
		}

		result = Arrays.copyOfRange(original, 0, 0);
		System.out.println(result.length);
		if (result == original) {
			System.out.println("Arrays.copyOfRange(original, 0, 0);" + (result == original));
		}
	}

}
