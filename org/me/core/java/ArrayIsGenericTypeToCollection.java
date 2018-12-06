package org.me.core.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Question: int[] works as List<> or NOT?
 * 
 * Answer: It works
 * 
 * Type of int[] is int[] and super class is Object.
 * 
 * Type of Integer[] is Integer[] and super class is Object.
 * 
 * So super type of any array is Object.
 * 
 * @author kekannag
 *
 */
public class ArrayIsGenericTypeToCollection {

	public static void main(String[] args) {
		Number[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		List<Number[]> listInt = new ArrayList<>();
		listInt.add(arr);

		System.out.println(listInt);

		if (arr instanceof Number[]) {
			System.out.println("Number[]");
		}

		System.out.println(float[].class);
		System.out.println(Float[].class);
		System.out.println(int[].class);
		System.out.println(Integer[].class);
	}

}
