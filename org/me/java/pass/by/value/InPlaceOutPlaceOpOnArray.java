package org.me.java.pass.by.value;

import java.util.Arrays;

/**
 * PASS BY COPY\VALUE? test scope of primitives in method if Op. is IN PLACE.
 * 
 * test IN Place and Out Place operation on Array
 * 
 * @author kekannag
 *
 */
public class InPlaceOutPlaceOpOnArray {
	public static void main(String args[]) {
		// PASS BY COPY?
		// test scope of primitives in method if Op. is IN PLACE.
		int x = 4;
		int y = 8;
		System.out.printf("Before --> %d\t%d", x, y);
		primitiveInPlace(x, y);
		System.out.printf("\tAfter --> %d\t%d\n\n", x, y);

		int[] intArray = new int[] { 0, 2, 4, 8, 16, 32 };
		squareArrayInPlace(intArray);

		System.out.print("intArray after IN place op. ");
		System.out.println(Arrays.toString(intArray));

		intArray = new int[] { 0, 2, 4, 8, 16, 32 };
		int[] squaredArray = squareArrayOutOfPlace(intArray);

		System.out.print("\nsquaredArray before OUT place op. ");
		System.out.println(Arrays.toString(intArray));

		System.out.print("\nsquaredArray after OUT place op. ");
		System.out.println(Arrays.toString(squaredArray));
	}

	public static void primitiveInPlace(int x, int y) {
		x = 40;
		y = 80;
	}

	public static int[] squareArrayInPlace(int[] intArray) {

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] *= intArray[i];
		}

		// NOTE: we could make this method void, since we modify
		// intArray in place.
		return intArray;
	}

	public static int[] squareArrayOutOfPlace(int[] intArray) {

		// we allocate a new array with the length of the input array
		int[] squaredArray = new int[intArray.length];

		for (int i = 0; i < intArray.length; i++) {
			squaredArray[i] = (int) Math.pow(intArray[i], 2);
		}

		return squaredArray;
	}

}