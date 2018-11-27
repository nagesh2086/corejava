package org.me.core.java;

import java.util.HashMap;
import java.util.Map;

/**
 * Tested hash map with null key and value.
 * 
 * key - this can be null in Hash map
 * 
 * value - it does not matter if value is null or not in collection.
 * 
 * @author kekannag
 *
 */
public class HashMapNullKeyTest {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("Tieto_Pune", 10000);
		// Can we set null as key
		m.put(null, -1);
		m.put(null, -1);

		System.out.println(m);

		// can we get value against null key
		Integer nullKeyValue = m.get(null);
		System.out.println("nullKeyValue -> " + nullKeyValue);

		// can we put null as value into hashmap
		m.put("Tieto_Mumbai", null);
		Integer nullValue = m.get("Tieto_Mumbai");
		System.out.println("null value of valid key -> " + nullValue);
	}

}
