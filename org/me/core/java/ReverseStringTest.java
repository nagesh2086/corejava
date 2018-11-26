package org.me.core.java;

public class ReverseStringTest {

	public static void main(String[] args) {
		System.out.println("NAGESH" + " --> " + ReverseString.reverseUsingCharArray("NAGESH")); // HSEGAN

		System.out.println("pune" + " --> " + ReverseString.reverseUsingBuilder("pune")); // enup
		
		System.out.println("MAHARASHTRA" + " --> " + ReverseString.reverseUsingByteArray("MAHARASHTRA")); // ARTHSARAHAM
	}

}

class ReverseString {

	// Reverse string using str.toCharArray() method
	public static String reverseUsingCharArray(String input) {
		char[] charArray = input.toCharArray();
		char[] reverseArray = new char[charArray.length];
		int j = 0;
		for (int i = charArray.length - 1; i >= 0; i--) {
			reverseArray[j] = charArray[i];
			j++;
		}
		return new String(reverseArray);
	}

	// reverse string using reverse method of StringBuilder
	public static String reverseUsingBuilder(String input) {
		return new StringBuilder(input).reverse().toString();
	}

	// Reverse string using str.toCharArray() method
	public static String reverseUsingByteArray(String input) {
		byte[] origBytes = input.getBytes();
		byte[] reverseBytes = new byte[origBytes.length];
		for (int i = 0; i < origBytes.length; i++) {
			reverseBytes[i] = origBytes[origBytes.length - i - 1];
		}
		return new String(reverseBytes);
	}
}
