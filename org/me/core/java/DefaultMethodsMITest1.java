package org.me.core.java;
// A simple Java program to demonstrate multiple 
// inheritance through default methods. 
interface PI1 
{ 
    // default method 
    default void show() 
    { 
        System.out.println("Default PI1"); 
    } 
} 
  
interface PI2 
{ 
    // Default method 
    default void show() 
    { 
        System.out.println("Default PI2"); 
    } 
} 
  
// Implementation class code 
public class DefaultMethodsMITest1 implements PI1, PI2 
{ 
	// If we do not override then compile time error
    // Overriding default show method 
    /*public void show() 
    { 
        // use super keyword to call the show 
        // method of PI1 interface 
        PI1.super.show(); 
  
        // use super keyword to call the show 
        // method of PI2 interface 
        PI2.super.show(); 
    }*/ 
  
	@Override
	public void show() {
		System.out.println("provided own overridden impl in DefaultMethodsMITest1");
		PI1.super.show();
		PI2.super.show();
	}
	
    public static void main(String args[]) 
    { 
    	DefaultMethodsMITest1 d = new DefaultMethodsMITest1(); 
        d.show(); 
    } 
}