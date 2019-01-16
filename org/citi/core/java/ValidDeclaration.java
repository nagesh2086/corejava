package org.citi.core.java;

//Field modifier - only public, static & final are permitted field modifier in INTERFACE
//Method modifier - only public, abstract, default, static, strictfp allowed
public interface ValidDeclaration {
	short value1 = 34;
	//protected short value5 = 34;
	public static short value2 = 34;

	// transient short value3 = 34;
	// final void madness(short stop);
	static void madness1(short stop) {
		System.out.println("static method allowed");
	}

	default void madness2(short stop) {
		System.out.println("DEFAULT method allowed");
	}
}
