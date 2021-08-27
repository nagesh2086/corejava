package com.cerence;

import java.util.LinkedList;

/**
 * Suppose n people are sitting in a circular table with names A, B, C, D,….
 * Given a name, we need to print all n people (in order) starting from given
 * name. For example, consider 6 people A B C D E F and given name as ‘D’.
 * People sitting in circular manner starting from D are D E F A B C.
 * 
 * @author nagesh2086
 *
 */
public class CircularArray {

	public static void main(String[] args) {
		Character[] cirArray = new Character[]{'A', 'B', 'C', 'D', 'E', 'F'};
		
		int i = 1, j = 1;
		
		do {
			System.out.println(cirArray[i]);
			i = i + 1;
			i = i%cirArray.length;
		} while (i !=j);

		LinkedList<Integer>lList = new LinkedList<>();
		lList.add(100);
		lList.add(200);
		lList.add(300);
		lList.add(400);
		lList.add(500);
		lList.add(600);
		System.out.println(lList);
		
		int p = 4, q = 4;
		do {
			System.out.println(lList.get(p));
			p++;
			p = p % lList.size();
		} while (p != q);
	}

}
