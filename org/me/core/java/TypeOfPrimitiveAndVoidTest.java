package org.me.core.java;

/**
 * Type of primitives and void keyword can be represented by java.lang.Class<?>
 * 
 * @author kekannag
 *
 */
class TypeOfPrimitiveAndVoidTest {

	public static void main(String args[]) {
		// type of int, float, double, boolean
		int i = 100;
		Short s = 0;
		System.out.println((Integer.valueOf(i).getClass()));
		System.out.println((Short.valueOf(s).getClass()));

		// type of void
		System.out.println(void.class);
	}
}