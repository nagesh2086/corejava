package org.sasrd.core.java;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * String pool like custom implementation
 * 
 * @author kekannag
 *
 */
public class ObjectPoolTest {
	public static void main(String[] args) {
		CustomString customString1 = new CustomString("Unmesh", "Jadhav");
		CustomString customString2 = new CustomString("Unmesh", "Jadhav");

		System.out.println("customString1 == customString2 --> " + (customString1 == customString2));

		customString1 = customString1.intern();
		customString2 = customString2.intern();

		System.out.println("customString1 == customString2 --> " + (customString1 == customString2));
	}
}

class ObjectPool<T> {

	private Map<T, T> map = new ConcurrentHashMap<>();

	public T get(T object) {
		T old = map.putIfAbsent(object, object);
		return old != null ? object : old;
	}
}

class CustomString {
	private String firstName;
	private String lastName;
	private ObjectPool<CustomString> pool = new ObjectPool<CustomString>();

	CustomString(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public CustomString intern() {
		return pool.get(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		CustomString other = (CustomString) obj;
		if (firstName == null) {
			if (other.firstName != null) {
				return false;
			}
		} else if (!firstName.equals(other.firstName)) {
			return false;
		}
		if (lastName == null) {
			if (other.lastName != null) {
				return false;
			}
		} else if (!lastName.equals(other.lastName)) {
			return false;
		}
		return true;
	}

}