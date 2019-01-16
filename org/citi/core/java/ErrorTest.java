package org.citi.core.java;

public class ErrorTest {

	public static void main(String[] args) {
		try {
			badMetho();
			System.out.println("A");
		} catch (Exception e) {
			System.out.println("C");
		} finally {
			System.out.println("D");
		}
		System.out.println("E");
	}

	private static void badMetho() {
		throw new Error();
	}

}
