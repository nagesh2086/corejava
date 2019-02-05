package org.qualys.core.java.hackerrank;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class BracesTest {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		// test 1 - for all test input from hacker rank

		String arrSize = scanner.nextLine();
		int size = Integer.parseInt(arrSize);
		String[] input = new String[size];

		int i = 0;
		for (int j = 0; j < size; j++) {
			String line = scanner.nextLine();
			input[i] = line;
			i++;
		}

		System.out.println(Arrays.toString(input));

		String[] output = braces(input);

		System.out.println(Arrays.toString(output));

		// test 2 for input of size - 0
		/*
		 * String[] input = new String[0]; System.out.println(Arrays.toString(input));
		 * 
		 * String[] output = braces(input);
		 * 
		 * System.out.println(Arrays.toString(output));
		 */

		// test 3 - input is null;
		/*
		 * String[] input = null; System.out.println(Arrays.toString(input));
		 * 
		 * String[] output = braces(input);
		 * 
		 * System.out.println(Arrays.toString(output));
		 */
	}

	private static String[] braces(String[] values) {
		if (values != null && values.length > 0) {
			String[] output = new String[values.length];
			for (int j = 0; j < values.length; j++) {
				output[j] = "YES";
				Stack<Character> stack = new Stack<>();
				String inputLine = values[j];
				char[] charArray = inputLine.toCharArray();

				for (int i = 0; i < charArray.length; i++) {
					char c = charArray[i];
					if ('{' == c || '[' == c || '(' == c) {
						stack.push(c);
					} else if ('}' == c) {
						if (stack.isEmpty() || !('{' == stack.pop())) {
							output[j] = "NO";
							break;
						}
					} else if (']' == c) {
						if (stack.isEmpty() || !('[' == stack.pop())) {
							output[j] = "NO";
							break;
						}
					} else if (')' == c) {
						if (stack.isEmpty() || !('(' == stack.pop())) {
							output[j] = "NO";
							break;
						}
					} else {
						output[j] = "NO";
						break;
					}
				}
			}
			return output;
		}
		return null;
	}

}
