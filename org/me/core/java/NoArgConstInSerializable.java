package org.me.core.java;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * To allow subtypes of non-serializable classes to be serialized, thesubtype
 * may assume responsibility for saving and restoring thestate of the
 * supertype's public, protected, and (if accessible)package fields. The subtype
 * may assume this responsibility only ifthe class it extends has an accessible
 * no-arg constructor toinitialize the class's state. It is an error to declare
 * a classSerializable if this is not the case. The error will be detected
 * atruntime.
 * 
 * Output: runtime exception is java.io.NotSerializableException
 * 
 * @param className
 */
public class NoArgConstInSerializable {
	public static void main(String args[]) throws IOException {
		A obj = new B("B:A:NoArgConstInSerializable");
		FileOutputStream fos = new FileOutputStream("NoArgConstInSerializable");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		oos.flush();
		oos.close();
	}
}

class A {
	String className;

	public A(String className) {
		this.className = className;
	}
}

class B extends A {
	String className;

	public B(String className) {
		super(className);
		this.className = className;
	}
}
