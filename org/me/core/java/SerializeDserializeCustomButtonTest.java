package org.me.core.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDserializeCustomButtonTest {

	public SerializeDserializeCustomButtonTest() {
	}

	public static void main(String[] args) {
		serialize();

		deserialize();
	}

	private static void deserialize() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("CustomButton.obj");
			ois = new ObjectInputStream(fis);
			Object readObject = ois.readObject();
			fis.close();
			ois.close();
			System.out.println((CustomButton) readObject);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
				// System.exit(-1);
				Runtime.getRuntime().exit(-1);
			}
		}
	}

	private static void serialize() {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("CustomButton.obj");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(new CustomButton(100, "Nagesh", "Coding..."));
			fos.close();
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
				// System.exit(-1);
				Runtime.getRuntime().exit(-1);
			}
		}
	}

}
