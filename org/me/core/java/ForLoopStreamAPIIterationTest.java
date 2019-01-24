/**
 * 
 */
package org.me.core.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Comparing results FOR-LOOP vs Stream API vs Parallel Stream API for
 * collection iteration.
 * 
 * TEST -----Who is better?
 * 
 * INPUT ------ Collection size - 9000.
 * 
 * Result --- Parallel Stream API > FOR-LOOP > STREAM API
 * 
 * Tool: ---- Eclipse Java EE IDE for Web Developers. Version: Photon Release
 * (4.8.0)
 * 
 * @author kekannag
 *
 */
public class ForLoopStreamAPIIterationTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final List<String> list = prepareData();

		final long forLoopStartTime = System.currentTimeMillis();
		for (int i = 0; i < 9000; i++) {
			System.out.print("*");
		}
		System.out.println();
		final long forLoopEndTime = System.currentTimeMillis();
		System.out.println("Time taken FOR-LOOP -> " + (forLoopEndTime - forLoopStartTime) + " MS");

		final long streamAPIStartTime = System.currentTimeMillis();
		list.stream().forEach(ForLoopStreamAPIIterationTest::whoIsNextOne);
		System.out.println();
		final long streamAPIEndTime = System.currentTimeMillis();
		System.out.println("Time taken StreamAPI -> " + (streamAPIEndTime - streamAPIStartTime) + " MS");

		final long parallelStreamAPIStartTime = System.currentTimeMillis();
		list.stream().forEach(ForLoopStreamAPIIterationTest::whoIsNextOne);
		System.out.println();
		final long parallelStreamAPIEndTime = System.currentTimeMillis();
		System.out.println(
				"Time taken Parallel StreamAPI -> " + (parallelStreamAPIEndTime - parallelStreamAPIStartTime) + " MS");
	}

	private static List<String> prepareData() {
		final List<String> list = new ArrayList<>();
		for (int i = 0; i < 1000; i++) {
			list.add("Mumbai");
			list.add("Mumbai");
			list.add("Bengalaru");
			list.add("Chennai");
			list.add("Kolkata");
			list.add("Pune");
			list.add("Nashik");
			list.add("Solapur");
			list.add("Aurangabad");
		}
		System.out.println("list size -> " + list.size());
		return list;
	}

	private static void whoIsNextOne(final String e) {
		System.out.print("*");
	}

}
