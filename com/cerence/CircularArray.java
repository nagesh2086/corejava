package com.cerence;

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
		
		int i = 2;
		int j = 2;
		
		do {
			System.out.println(cirArray[i]);
			i = i + 1;
			i = i%cirArray.length;
		} while (i !=j);

	}

}
