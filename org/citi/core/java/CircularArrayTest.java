package org.citi.core.java;

import java.util.Arrays;

public class CircularArrayTest {

	public static void main(String[] args) {
		int[] array = new int[6];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		System.out.println(Arrays.toString(array));
		int s = 5;
		int l = s;
		do {
			System.out.print(" " + array[s]);
			s++;
			s = s%array.length;
		} while (s != l);
	}

}
