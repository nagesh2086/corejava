package org.me.core.java;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * We want to test INSERTION-ORDER property of LinkedHashMap collection.
 * 
 * @author kekannag
 *
 */
public class LinkedHashMapSimpleTest {

	public static void main(String[] args) {
		Map<Integer, String> lMap = new LinkedHashMap<>();

		lMap.put(0, "asdf");
		lMap.put(1, "asdf");
		lMap.put(2, "asdf");
		lMap.put(3, "asdf");
		lMap.put(4, "asdf");
		lMap.put(5, "asdf");
		lMap.put(6, "asdf");
		lMap.put(7, "asdf");
		lMap.put(8, "asdf");
		lMap.put(9, "asdf");
		lMap.put(10, "asdf");
		lMap.put(11, "asdf");
		lMap.put(12, "asdf");
		lMap.put(13, "asdf");
		lMap.put(14, "asdf");
		lMap.put(15, "asdf");
		lMap.put(16, "asdf");
		lMap.put(17, "asdf");
		lMap.put(18, "asdf");
		lMap.put(19, "asdf");
		lMap.put(20, "asdf");
		lMap.put(21, "asdf");
		
		System.out.println(lMap);
	}

}
