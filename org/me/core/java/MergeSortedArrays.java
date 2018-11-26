package org.me.core.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MergeSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		System.out.println(list1);

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(2);
		list2.add(5);
		list2.add(5);
		System.out.println(list2);

		int n1 = list1.size();
		int n2 = list2.size();
//		int n3 = n1 + n2;
		List<Integer> result = new ArrayList<>();

		int i = 0, j = 0;
		while (i < n1 && j < n2) {
			if (list1.get(i) < list2.get(j)) {
				result.add(list1.get(i));
				i++;
			} else {
				result.add(list2.get(j));
				j++;
			}
		}

		while (i < n1) {
			result.add(list1.get(i));
			i++;
		}

		while (j < n2) {
			result.add(list2.get(j));
			j++;
		}

		System.out.println(result);
	}

}
