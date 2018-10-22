package org.me.core.java;

/**
 * Can we define static method like default method in Functional interface? -Yes
 * we can
 * 
 * Can we override static method from Interface? -> NO
 * 
 * Can we override default method?
 * 
 * @author kekannag
 *
 */
public interface TestInterface {

	String name = "TestInterface";

	static String nameOfI = "TestInterface";

	static void purposeOfI() {
		System.out.println("Q1. Can we define static method like default method in Functional interface?\n" + "A1. Yes\n\n"
				+ "Q2. Can we override static method from Interface?\n" + "A2. NO\n\n" + "Q3. Can we override default method?\n" + "A3. YES\n\n");
	}

	default void identity() {
		System.out.println(this.hashCode());
	}
	
	default String fullyName() {
		return this.getClass().getName();
	}
	
	String impl();
	
	public static void main(String[] args) {
		System.out.println("TestInterface.nameOfI -> " + TestInterface.nameOfI + "\n");
		TestInterface.purposeOfI();
		//identity method can be accessed through subclassess\implementation only
	}

}
