package org.me.core.java;

/**
 * I want to see that can class exist/work as abstract 
 * without any abstract method and many concrete methods
 * @author nagesh2086
 *
 */
public abstract class AbstractClass {

	public void className(){
		System.out.println(this.getClass().getCanonicalName());
	}
	public static void main(String[] args) {
		AbstractClass ac = new AbstractClass() {
		};
		ac.className();
	}

}
