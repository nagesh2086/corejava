package org.me.core.java;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * /////////////WITH-OUT serializatin method see static, trasient, volatile,
 * normal field values after serialization
 * 
 * Serialization -> 239
 * 
 * Serialization -> Pojo [name=org.me.core.java.Pojo, buffer=It is pojo class to
 * learn java serialization., msg=Hello world]
 * 
 * De-serialization -> 239
 * 
 * De-serialization -> Pojo [name=null, buffer=It is pojo class to learn java
 * serialization., msg=Hello world]
 * 
 * /////////////WITH serializatin method see static, trasient, volatile, normal
 * field values after serialization
 * 
 * Serialization -> 239
 * 
 * Serialization -> Pojo [name=org.me.core.java.Pojo, buffer=It is pojo class to
 * learn java serialization., msg=Hello world]
 * 
 * writeReplace writeObject readObject readResolve validateObject
 * 
 * De-serialization -> 239
 * 
 * De-serialization -> Pojo [name=null, buffer=It is pojo class to learn java
 * serialization., msg=Hello world]
 * 
 * @author kekannag
 *
 */
public class PojoTest {

	public static void main(String[] args) throws Exception {
		Pojo pojo = new Pojo("Hello world");

		System.out.println("\nSerialization -> " + Pojo.count);
		System.out.println("\nSerialization -> " + pojo + "\n");

		byte[] bytes = serialize(pojo); // Serialization
		Pojo p = (Pojo) deserialize(bytes); // De-serialization

		System.out.println("\nDe-serialization -> " + Pojo.count);
		System.out.println("\nDe-serialization -> " + p);
	}

	private static byte[] serialize(Object o) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		oos.writeObject(o);
		oos.flush();
		oos.close();
		return baos.toByteArray();
	}

	private static Object deserialize(byte[] bytes) throws ClassNotFoundException, IOException {
		ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
		ObjectInputStream ois = new ObjectInputStream(bais);
		Object o = ois.readObject();
		ois.close();
		return o;
	}

}