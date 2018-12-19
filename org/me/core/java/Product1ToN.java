package org.me.core.java;

/**
 * Is it factorial e.g. 5! = 120 ?
 * 
 * Answer: It is factorial means Product 1 to N.
 * 
 * @author kekannag
 *
 */
public class Product1ToN {

	public static void main(String[] args) {
		System.out.println("5! --> " + calcProduct1ToN(5));
		System.out.println("6! --> " + calcProduct1ToN(6));
	}

	private static final int calcProduct1ToN(int n) {
		return (n > 1) ? (n * calcProduct1ToN(n - 1)) : 1;
	}

}