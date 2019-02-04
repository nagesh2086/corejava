package org.me.core.java.collection.NULL.value;

import java.util.Hashtable;

/**
 * HashTable - NullPointerException if the key or value is null.
 * 
 * @author kekannag
 *
 */
public class HashTableNullTest {

	public static void main(String[] args) {
		Hashtable<String, Integer> hashTable = new Hashtable<>();
		System.out.println("Before : " + hashTable);

		hashTable.put("key1", 1321321);
		System.out.println("added one KEY--VALUE pair : " + hashTable);

		// add V as null
		// hashTable.put("key1", null);//NPE

		// add K as null
		hashTable.put(null, 32132123);// NPE

	}

}