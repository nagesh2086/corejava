package org.sasrd.core.java;

/**
 * Remove duplicate characters from given string and print string again. Input -
 * w3schools --> w3chols Input - www2schooolss --> w3chols
 * 
 * @author kekannag
 *
 */
public class DuplicateCharRemoval {
	public static void main(String argu[]) {
		String str = "www2schooolss";

		char[] inp = str.toCharArray();
		final int length = inp.length;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (inp[i] == inp[j]) {
					String s1 = "" + inp[i];
					str = str.replaceFirst(s1, "");
					break;
				}
			}
		}

		System.out.println(str);
	}
}