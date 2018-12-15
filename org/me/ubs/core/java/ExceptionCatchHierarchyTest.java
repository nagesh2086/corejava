package org.me.ubs.core.java;

class Parent extends Exception {
}

class Child extends Parent {
}

public class ExceptionCatchHierarchyTest {

	public static void main(String[] args) {
		try {
			throw new Parent();
		} catch (Child e) {
			System.out.println("Caught Child class exception");
		} catch (Parent e) {
			System.out.println("Caught Parent class exception");
		}

		/*
		 * catch (Parent e) { System.out.println("Caught Parent class exception"); }
		 * catch (Child e) { System.out.println("Caught Child class exception"); }
		 */
	}

}
