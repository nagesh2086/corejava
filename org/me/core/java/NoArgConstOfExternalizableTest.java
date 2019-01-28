package org.me.core.java;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * When an Externalizable object is reconstructed, an instance is created using
 * the public no-arg constructor, then the readExternal method called.
 * 
 * If there is not no-arg constructor then InvalidClassException will be thrown.
 * 
 * @author kekannag
 *
 */
public class NoArgConstOfExternalizableTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ParamConstA a = new ParamConstA(6, 60);
		System.out.println("Before ser -> " + a);

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		oos.writeObject(a);
		oos.flush();
		oos.close();
		byte[] bytes = baos.toByteArray();

		ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
		ObjectInputStream ois = new ObjectInputStream(bais);
		a = (ParamConstA) ois.readObject();
		ois.close();

		System.out.println("After de-ser -> " + a);
	}

}

class ParamConstA implements Externalizable {

	private int height;
	private int age;

	// Exception in thread "main" java.io.InvalidClassException:
	// org.me.core.java.ParamConstA; no valid constructor
	/*
	 * public ParamConstA() { // TODO Auto-generated constructor stub }
	 */

	public ParamConstA(int height, int age) {
		this.height = height;
		this.age = age;
	}

	@Override
	public String toString() {
		return "ParamConstA [height=" + height + ", age=" + age + "]";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(height);
		out.writeInt(age);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		this.height = in.readInt();
		this.age = in.readInt();
	}
}
