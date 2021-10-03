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
		//System.out.println(t.getData("DFG"));
		t.getData(15);
		t.getData(new Integer(15));
		t.getData(new Object());
	}

	/*public void getData(int i){
		System.out.println("getData(int i):" + i);
	}
	
	public void getData(Integer i){
		System.out.println("getData(Integer i):" + i);
	}*/
	
	public void getData(Object i){
		System.out.println("getData(Object i):" + i);
	}
}
