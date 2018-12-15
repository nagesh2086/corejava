package org.me.ubs.core.java;

class Derived {
	public void getDetails() {
		System.out.printf("Derived class ");
	}
}

public class DerivedTest extends Derived{

	public void getDetails() {
		System.out.printf("DerivedTest class ");
		super.getDetails();
	}
	
	public static void main(String[] args) {
		Derived t = new DerivedTest();
		t.getDetails();
	}

}
