package org.me.core.java.collection.NULL.value;

import java.util.HashMap;

public class HashMapNullTest {

	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<>();
		System.out.println("Before : " + hashMap);

		// adds one K as null and V is null
		hashMap.put(null, null);
		System.out.println("added one K as null : " + hashMap);

		// update that V of null K
		hashMap.put(null, 3212313);
		System.out.println("updated V of null K  : " + hashMap);

		hashMap.put(null, null);
		hashMap.put(null, null);
		System.out.println("Adding many K as null still only one {null(K):null(V)} --> " + hashMap);
		
		// ADD all values as null
		hashMap.put("Mumbai", null);
		hashMap.put("PUNE", null);
		hashMap.put("NASHIK", null);
		hashMap.put("LATUR", null);
		hashMap.put("BEED", null);
		
		System.out.println("After added null values per K: " + hashMap);

	}

}