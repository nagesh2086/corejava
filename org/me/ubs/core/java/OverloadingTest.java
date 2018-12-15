package org.me.ubs.core.java;

/**
 * java.lang.Error: Unresolved compilation problem: Unhandled exception type
 * Exception
 * 
 * @author kekannag
 *
 */
public class OverloadingTest {

	public static void main(String[] args) throws Exception {// Remove throws clause from method signature
		OverloadingTest t = new OverloadingTest();
		System.out.println(t.getData("DFG"));
	}

	private int getData(String string) throws Exception {
		return 1;
	}

	//uncomment this method
	/*
	 * private int getData(String string) throws IOException { return 0; }
	 */

}
