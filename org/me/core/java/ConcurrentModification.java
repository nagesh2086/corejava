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
 * See description from JAVA DOC: Note that fail-fast behavior cannot be
 * guaranteed as it is, generallyspeaking, impossible to make any hard
 * guarantees in the presence ofunsynchronized concurrent modification.
 * Fail-fast operationsthrow ConcurrentModificationException on a best-effort
 * basis.Therefore, it would be wrong to write a program that depended on
 * thisexception for its correctness: ConcurrentModificationExceptionshould be
 * used only to detect bugs.
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

		System.out.println(listIterator.next());
		list.remove(0);
		System.out.println(listIterator.next());
		System.out.println(listIterator.next());
		System.out.println(listIterator.next());
	}

}
