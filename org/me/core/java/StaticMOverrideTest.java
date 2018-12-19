package org.me.core.java;

/**
 * 
 * STATIC METHOD.
 * 
 * Override -- NO.
 * 
 * Shadowing -- YES.
 * 
 * If no shadowing then can access static method of Parent if exist.
 * 
 * @author kekannag
 *
 */
public class StaticMOverrideTest {

	public static void main(String[] args) {
		// STATIC method override test
		DDerived.meStatic();
	}
}

interface Test {
	void test();
}

class BBase implements Test {
	@Override
	public void test() {
	}

	public static void meStatic() {
		System.out.println("BBase: meStatic()");
	}
}

class DDerived extends BBase {
	@Override
	public void test() {
		super.test();
	}

	/*
	 * public static void meStatic() { System.out.println("DDerived: meStatic()"); }
	 */

}