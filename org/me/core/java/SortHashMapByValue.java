package org.me.core.java;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortHashMapByValue {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("Tieto-Pune", 10000);
		m.put(null, -1);
		m.put(null, -1);
		m.put("Tieto-Hyderabad", 2000);
		m.put("Tieto-Banglore", 3000);
		m.put("Tieto-Delhi", 5000);
		m.put("Tieto-Copenhagen", 7000);

		System.out.println("Map before sort -> " + m);

		List<Entry<String, Integer>> listEntry = m.entrySet().stream().collect(Collectors.toList());

		Collections.sort(listEntry, new EmpCountMapKeyComparatorASC());
		System.out.println("\nsorting by Key ASC --> " + listEntry);

		Collections.sort(listEntry, new EmpCountMapKeyComparatorDSC());
		System.out.println("\nsorting by Key DSC --> " + listEntry);

		Collections.sort(listEntry, new EmpCountMapValueComparatorASC());
		System.out.println("\nsorting by Value ASC--> " + listEntry);

		Collections.sort(listEntry, new EmpCountMapValueComparatorDSC());
		System.out.println("\nsorting by Value DSC--> " + listEntry);
	}

}

class EmpCountMapValueComparatorASC implements Comparator<Entry<String, Integer>> {

	@Override
	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
		if (o1.getValue() == null && o2.getValue() == null) {
			return 0;
		}
		if (o1.getValue() == null && o2.getValue() != null) {
			return 1;
		}
		if (o1.getValue() != null && o2.getValue() == null) {
			return -1;
		}
		return o1.getValue().compareTo(o2.getValue());
	}

}

class EmpCountMapValueComparatorDSC implements Comparator<Entry<String, Integer>> {

	@Override
	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
		if (o1.getValue() == null && o2.getValue() == null) {
			return 0;
		}
		if (o1.getValue() == null && o2.getValue() != null) {
			return -1;
		}
		if (o1.getValue() != null && o2.getValue() == null) {
			return 1;
		}
		return o2.getValue().compareTo(o1.getValue());
	}

}

class EmpCountMapKeyComparatorASC implements Comparator<Entry<String, Integer>> {

	@Override
	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
		if (o1.getKey() == null && o2.getKey() == null) {
			return 0;
		}
		if (o1.getKey() == null && o2.getKey() != null) {
			return 1;
		}
		if (o1.getKey() != null && o2.getKey() == null) {
			return -1;
		}
		return o1.getKey().compareTo(o2.getKey());
	}

}

class EmpCountMapKeyComparatorDSC implements Comparator<Entry<String, Integer>> {

	@Override
	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
		if (o1.getKey() == null && o2.getKey() == null) {
			return 0;
		}
		if (o1.getKey() == null && o2.getKey() != null) {
			return -1;
		}
		if (o1.getKey() != null && o2.getKey() == null) {
			return 1;
		}
		return o2.getKey().compareTo(o1.getKey());
	}

}
