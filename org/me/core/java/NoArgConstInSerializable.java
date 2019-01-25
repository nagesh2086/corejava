package org.me.core.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

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
 * Studied sequence of serialization and de-serialization methods.
 * 1. WriteObject
 * 2. WriteReplace
 * 3. ReadObject
 * 4. ReadReplace
 * @param className
 */
public class NoArgConstInSerializable {
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		A obj = null;
		FileOutputStream out = null;
		ObjectOutputStream oos = null;
		try {
			obj = new B("B:A:NoArgConstInSerializable");
			out = new FileOutputStream("NoArgConstInSerializable");
			oos = new ObjectOutputStream(out);
			oos.writeObject(obj);
			// oos.defaultWriteObject(); //throws NotActiveException if called outside
			// writeObject() method.
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			oos.flush();
			oos.close();
		}
		System.out.println(obj);

		FileInputStream in;
		ObjectInputStream ois = null;
		A rObj = null;
		try {
			in = new FileInputStream("NoArgConstInSerializable");
			ois = new ObjectInputStream(in);
			rObj = (A) ois.readObject();
		} finally {
			ois.close();
		}
		System.out.println("Deserialized --> " + rObj);

	}
}

class A implements Serializable {
	String classNameA;

	public A(String className) {
		this.classNameA = className;
	}

	@Override
	public String toString() {
		return "A [classNameA=" + classNameA + "]";
	}
}

class B extends A {
	String classNameB;

	public B(String className) {
		super(className);
		this.classNameB = className;
	}

	private Object writeReplace() throws ObjectStreamException {
		System.out.println("1. Write Replace");
		return this;
	}

	private void writeObject(ObjectOutputStream out) throws IOException {
		System.out.println("2. Write Object");
	}

	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		System.out.println("3. Read object");
	}

	private Object readResolve() throws ObjectStreamException {
		System.out.println("4. Read resolve");
		return this;
	}

	@Override
	public String toString() {
		return "B [classNameB=" + classNameB + "]";
	}

	private void readObjectNoData() throws ObjectStreamException {
		System.out.println("Read object No Data");
	}
}
