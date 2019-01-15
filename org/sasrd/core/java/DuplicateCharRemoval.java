package org.sasrd.core.java;

//Remove duplicate characters from given string and print string again.
//w3schools --> w3chols
//www2schooolss --> w3chols
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