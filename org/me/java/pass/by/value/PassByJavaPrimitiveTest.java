package org.me.java.pass.by.value;

public class PassByJavaPrimitiveTest {

	public static void main(String[] args) {
		int x, y;
		x = 1;
		y = 2;

		System.out.printf("Before -> %d", x + y);
		addIntAndPrint(x, y);
		System.out.printf("\nAfter -> %d", x + y);
	}

	private static void addIntAndPrint(int x, int y) {
		System.out.printf("\nReceived -> %d", x + y);
		x = 10;
		y = 20;
		System.out.printf("\nProcessed -> %d", x + y);
	}

}
