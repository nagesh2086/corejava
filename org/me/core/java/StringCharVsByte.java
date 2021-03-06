package org.me.core.java;

/**
 * How to run this program:
 * 
 * Change character encoding to UTF-16 in your IDE to see the expected output
 * for understanding. You have to do it initially then it works with default
 * character encoding like cp1252. Why it works then? I do not know...
 * 
 * To see waste of memory in String Java 8 implementation --> The current
 * implementation of the String class stores characters in a char array, using
 * two bytes (sixteen bits) for each character. Data gathered from many
 * different applications indicates that strings are a major component of heap
 * usage and, moreover, that most String objects contain only Latin-1
 * characters. Such characters require only one byte of storage, hence half of
 * the space in the internal char arrays of such String objects is going unused.
 * 
 * 
 * What Java 9 offers? //COMPACT STRING//
 * 
 * Read this: We propose to change the internal representation of the String
 * class from a UTF-16 char array to a byte array plus an encoding-flag field.
 * The new String class will store characters encoded either as
 * ISO-8859-1/Latin-1 (one byte per character), or as UTF-16 (two bytes per
 * character), based upon the contents of the string. The encoding flag will
 * indicate which encoding is used.
 * 
 * String-related classes such as AbstractStringBuilder, StringBuilder, and
 * StringBuffer will be updated to use the same representation, as will the
 * HotSpot VM's intrinsic string operations.
 * 
 * This is purely an implementation change, with no changes to existing public
 * interfaces. There are no plans to add any new public APIs or other
 * interfaces.
 * 
 * The prototyping work done to date confirms the expected reduction in memory
 * footprint, substantial reductions of GC activity, and minor performance
 * regressions in some corner cases.
 * 
 * @author kekannag
 *
 */
class StringCharVsByte {
	public static void main(String[] args) {
		String first = "first";
		String russianFirst = "первыи";// it means "first" word in Russian language.

		char[] c1 = first.toCharArray();

		char[] c2 = russianFirst.toCharArray();

		System.out.print("Byte representation: ");
		for (byte b : first.getBytes()) {
			System.out.print(b);
			System.out.print(" ");
		}

		System.out.println();
		System.out.print("Char representation: ");
		for (char c : c1) {
			System.out.print(c >>> 8);
			System.out.print(" ");
		}

		System.out.println("\n");
		System.out.print("Byte representation: ");
		for (byte b : russianFirst.getBytes()) {
			System.out.print(b);
			System.out.print(" ");
		}

		System.out.println();
		System.out.print("Char representation: ");
		for (char c : c2) {
			System.out.print(c >>> 8);
			System.out.print(" ");
		}
	}
}