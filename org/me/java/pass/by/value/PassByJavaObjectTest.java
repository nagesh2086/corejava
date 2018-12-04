package org.me.java.pass.by.value;

public class PassByJavaObjectTest {

	public static void main(String[] args) {
		Integer x, y;
		x = 1;
		y = 2;

		System.out.printf("Before -> %d", x + y);
		addIntAndPrint(x, y);
		System.out.printf("\nAfter -> %d", x + y);
	}

	private static void addIntAndPrint(Integer x, Integer y) {
		System.out.printf("\nReceived -> %d", x + y);
		x = new Integer(10);
		y = new Integer(20);
		System.out.printf("\nProcessed -> %d", x + y);
	}

}