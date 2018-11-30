package org.me.geeksforgeeks.java.search.sort;

/**
 * Binary search 0(log n)
 * 
 * https://www.geeksforgeeks.org/binary-search/
 * 
 * @author kekannag
 *
 */
public class BinarySearch {
	public static void main(String... args) {
		int[] arr = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
		// int[] arr = {};

		int l, h, x;
//		x = 23;
		x = 100;
		l = 0;
		h = arr.length;
		System.out.println(search(l, h, x, arr));
	}

	// return index
	private static int search(int l, int h, int x, int[] arr) {
		if (l >= h) {
			return -1;
		}
		int midId = (l + h) / 2;
		if (arr[midId] == x) {
			return midId;
		}
		if (x > arr[midId]) {
			l = midId + 1;
		} else {
			h = midId - 1;
		}
		return search(l, h, x, arr);
	}
}