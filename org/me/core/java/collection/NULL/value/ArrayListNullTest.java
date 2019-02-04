package org.me.core.java.collection.NULL.value;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList allows all elements as NULL values.
 * 
 * @author kekannag
 *
 */
public class ArrayListNullTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		System.out.println("Before : " + list);
		list.add(null);
		list.add(null);
		list.add(null);
		System.out.println("After adding 3 NULL values: ");
		System.out.println(list);
		System.out.println("Size: " + list.size());
	}

}
