package org.me.ubs.core.java;

class Basee {
	public static String s = " Super class ";

	public Basee() {
		System.out.printf(" 1 ");
	}
}

/**
 * java.lang.Error: Unresolved compilation problem: Constructor call must be the
 * first statement in a constructor
 * 
 * @author kekannag
 *
 */
public class Derivedd extends Basee {

	public Derivedd() {
		// super();
		System.out.printf(" 2 ");
		// super();
	}

	public static void main(String[] args) {
		Derivedd dd = new Derivedd();
		System.out.printf(s);
	}
}
