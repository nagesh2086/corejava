/**
 * 
 */
package org.me.core.java;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * What is concurrent modification?
 * 
 * If many threads or single threads modifies underlying collection which you
 * are traversing then the method of iterator would throw
 * ConcurrentModificationException.
 * 
 * Remove of iterator method would work. This is an exception.
 * 
 * @author kekannag
 *
 */
public class ConcurrentModification {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Mumbai");
		list.add("Bengalaru");
		list.add("Chennai");
		list.add("Kolkata");

		ListIterator<String> listIterator = list.listIterator();
		synchronized (ConcurrentModification.class) {
			System.out.println(listIterator.next());
			System.out.println(listIterator.next());
			System.out.println(listIterator.next());
		}
		list.remove(0);
		synchronized (ConcurrentModification.class) {
			System.out.println(listIterator.next());
		}
	}

}
