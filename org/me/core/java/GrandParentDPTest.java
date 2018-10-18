package org.me.core.java;
// A Grand parent class in diamond 
class GrandParent 
{ 
    void fun() 
    { 
        System.out.println("Grandparent"); 
    } 
} 
  
// First Parent class 
class Parent11 extends GrandParent 
{ 
    void fun() 
    { 
        System.out.println("Parent11"); 
    } 
} 
  
// Second Parent Class 
class Parent22 extends GrandParent 
{ 
    void fun() 
    { 
        System.out.println("Parent22"); 
    } 
} 
  
  
// Error : Test is inheriting from multiple 
// classes 
public class GrandParentDPTest extends Parent11, Parent22 
{ 
   public static void main(String args[]) 
   { 
       Test t = new Test(); 
       t.fun(); 
   } 
}