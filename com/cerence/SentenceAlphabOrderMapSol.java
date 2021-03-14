package com.cerence;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SentenceAlphabOrderMapSol {

	public static void main(String[] args) {
		String ipStr = "A aa A bb cc c zebra wat d a x p u vst v w i h g";
		System.out.println("Input --> " + ipStr);
		
		String[] ip = ipStr.split(" ");
		System.out.println(ip.length);

		Map<String, Integer> hm = new HashMap<String, Integer>();

		for (int i = 0; i < ip.length; i++) {
			Integer cnt = hm.get(ip[i]);
			if (cnt != null) {
				cnt += 1;
			} else {
				cnt = 1;
			}
			hm.put(ip[i], cnt);
		}

		Comparator<String> c = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1 == null && o2 != null) {
					return -1;
				} else if (o1 != null && o2 == null) {
					return 1;
				} else if (o1 == null && o2 == null) {
					return 0;
				} else {
					return o1.compareToIgnoreCase(o2);
				}
			}
		};

//		TreeMap<String, String> tm = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
		TreeMap<String, String> tm = new TreeMap<>(c);
		
		for (int i = 0; i < ip.length; i++) {
			tm.put(ip[i], null);
		}

		for (Iterator<Entry<String, String>> iterator = tm.entrySet().iterator(); iterator.hasNext();) {
			Entry<String, String> entry = iterator.next();
			Integer cnt = hm.get(entry.getKey());
			for (int i = 0; i < cnt; i++) {
				System.out.println(entry.getKey());
			}
		}
		
		System.out.println(tm);
		System.out.println(tm.size());
	}

}
