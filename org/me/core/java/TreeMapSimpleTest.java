package org.me.core.java;

import java.util.Map;
import java.util.TreeMap;

/**
 * We want to test NATURAL-ORDERING SORT of TreeMap collection.
 * 
 * @author kekannag
 *
 */
public class TreeMapSimpleTest {

	public static void main(String[] args) {
		Map<Integer, String> tMap = new TreeMap<>();

		tMap.put(12, "asdf");
		tMap.put(13, "asdf");
		tMap.put(9, "asdf");
		tMap.put(10, "asdf");
		tMap.put(0, "asdf");
		tMap.put(3, "asdf");
		tMap.put(14, "asdf");
		tMap.put(21, "asdf");
		tMap.put(15, "asdf");
		tMap.put(16, "asdf");
		tMap.put(7, "asdf");
		tMap.put(8, "asdf");
		tMap.put(11, "asdf");
		tMap.put(17, "asdf");
		tMap.put(18, "asdf");
		tMap.put(19, "asdf");
		tMap.put(1, "asdf");
		tMap.put(2, "asdf");
		tMap.put(20, "asdf");
		tMap.put(4, "asdf");
		tMap.put(5, "asdf");
		tMap.put(6, "asdf");

		System.out.println(tMap);
	}

}
