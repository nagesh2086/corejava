package org.me.core.java;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputValidation;
import java.io.ObjectStreamException;
import java.io.Serializable;

public class Pojo implements Serializable, ObjectInputValidation {

	private static final long serialVersionUID = 229308780457382596L;

	static Integer count = 239;
	transient String name = Pojo.class.getName();
	volatile StringBuffer buffer = new StringBuffer("It is pojo class to learn java serialization.");
	private String msg;

	public Pojo(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	private void writeObject(java.io.ObjectOutputStream out) throws IOException {
		System.out.println("writeObject");
		out.defaultWriteObject();
	}

	private Object writeReplace() throws ObjectStreamException {
		System.out.println("writeReplace");
		return this;
	}

	private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
		System.out.println("readObject");
		in.registerValidation(this, 0);
		in.defaultReadObject();
	}

	@Override
	public void validateObject() throws InvalidObjectException {
		System.out.println("validateObject");
	}

	private Object readResolve() throws ObjectStreamException {
		System.out.println("readResolve");
		return this;
	}

	@Override
	public String toString() {
		return "Pojo [name=" + name + ", buffer=" + buffer + ", msg=" + msg + "]";
	}

}