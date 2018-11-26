package org.me.core.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class CountDuplicatesTest {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(0);
		numbers.add(1);
		numbers.add(2);
		numbers.add(2);
		numbers.add(2);
		numbers.add(3);
		numbers.add(5);
		int duplicates = countDuplicates(numbers);
		System.out.println(duplicates);

	}

	public static int countDuplicates(List<Integer> numbers) {
		// Write your code here
		Map<Integer, Integer> m = new HashMap<>();
		/*for (Iterator iterator = numbers.iterator(); iterator.hasNext();) {
			Integer key = (Integer) iterator.next();
			Integer value = m.get(key);
			if (value == null) {
				m.put(key, 1);
			}else {
				m.put(key, value+1);
			}
		}*/
		//numbers.stream().map((key) -> m.get(key)!=null?m.put(key, m.get(key)+1):m.put(key, 1));
		
		Consumer<Integer> consumer = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				Integer v = m.get(t);
				if (v == null) {
					m.put(t, 1);
				}else {
					m.put(t, v+1);
				}
			}
		};
		
		numbers.stream().forEach(consumer);
		
		return (int) m.entrySet().stream().filter(entry -> entry.getValue() >=2).count();
	}

}
