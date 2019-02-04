package org.me.core.java.collection.NULL.value;

import java.util.LinkedList;

/**
 * LinkedList allows all elements as NULL values.
 * @author kekannag
 *
 */
public class LinkedListNullTest {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		System.out.println("LinkedList Before : " + linkedList);
		linkedList.add(null);
		linkedList.add(null);
		linkedList.add(null);
		System.out.println("LinkedList After adding 3 NULL values: ");
		System.out.println(linkedList);
		System.out.println("Size: " + linkedList.size());
	}

}