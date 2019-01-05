package org.me.core.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class ListDuplicateCountTest {

	public static void main(String[] args) {

		System.out.println("for-loop implementation");
		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5, 0, -1, -2, -800, -3, 0, -3, 2, 3);
		ArrayList<Integer> list = new ArrayList<>(asList);
		System.out.println("Source array: " + Arrays.toString(list.toArray()));

		// find number of duplicates using for loop
		int duplicateCount = 0;
		long begining1 = System.currentTimeMillis();
		for (int i = 0; i < list.size() - 1; i++) {
			Integer key = list.get(i);
			for (int j = i + 1; j < list.size(); j++) {
				Integer dElement = list.get(j);
				if (key.compareTo(dElement) == 0) {
					duplicateCount++;
					list.remove(j);
				}
			}
		}
		long ending1 = System.currentTimeMillis();
		System.out.println("Final array: " + Arrays.toString(list.toArray()));
		System.out.println(duplicateCount + " elements found and Total time by ForLoop: " + (ending1 - begining1));

		System.out.println("\nSET implementation");
		List<Integer> asList1 = Arrays.asList(1, 2, 3, 4, 5, 0, -1, -2, -800, -3, 0, -3, 2, 3);
		ArrayList<Integer> list1 = new ArrayList<>(asList1);
		final int sourceSize = list1.size();
		System.out.println("Source array: " + Arrays.toString(list1.toArray()));

		// find number of duplicates using for SET
		TreeSet<Integer> treeSet = new TreeSet<>(list1);
		final int finalSize = treeSet.size();
		long begining2 = System.currentTimeMillis();
		final int noOfDuplicate = sourceSize - finalSize;
		long ending2 = System.currentTimeMillis();
		System.out.println("Final set: " + treeSet);
		System.out.println(noOfDuplicate + " elements found and Total time by SET: " + (ending2 - begining2));
	}

}
