package org.me.core.java.collection.NULL.value;

import java.util.TreeMap;

/**
 * TreeMap -
 * 
 * 1. NullPointerException if the key is null.
 * 
 * 2. allows value V as null
 * 
 * @author kekannag
 *
 */
public class TreeMapNullTest {

	public static void main(String[] args) {
		TreeMap<String, Integer> hashMap = new TreeMap<>();
		System.out.println("Before : " + hashMap);

		// adds one K as null and V is null
		hashMap.put("asdfasd", null);
		System.out.println("added one K as null : " + hashMap);

	}
}