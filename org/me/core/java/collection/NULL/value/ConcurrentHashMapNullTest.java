package org.me.core.java.collection.NULL.value;

import java.util.concurrent.ConcurrentHashMap;

/**
 * ConcurrentHashMap - NullPointerException if the key or value is null.
 * @author kekannag
 *
 */
public class ConcurrentHashMapNullTest {

	public static void main(String[] args) {
		ConcurrentHashMap<String, Integer> cMap = new ConcurrentHashMap<>();
		System.out.println("Before : " + cMap);

		// adds one K and V as null
		cMap.put(null, null); // NPE
		System.out.println("added one K as null : " + cMap);
	}

}