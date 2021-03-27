package array.list.spliterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class ArrayListSpliteratorTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		int listLength = 1000;
		for (int i = 0; i < listLength; i++) {
			list.add(++i);
		}
		System.out.println(list);

		/*
		 * boolean tryAdvance = list.spliterator().tryAdvance(e ->
		 * System.out.println(e)); System.out.println(tryAdvance);
		 * 
		 * Spliterator<Integer> trySplit1 = list.spliterator().trySplit();
		 * System.out.println(trySplit1.getExactSizeIfKnown());
		 * trySplit1.forEachRemaining(e -> System.out.println(e));
		 * 
		 * Spliterator<Integer> trySplit2 = list.spliterator().trySplit();
		 * System.out.println(trySplit1.getExactSizeIfKnown());
		 * trySplit2.forEachRemaining(e -> System.out.println(e));
		 */

		Spliterator<Integer> trySplit3 = list.spliterator();
		System.out.println(trySplit3.estimateSize());
		trySplit3.forEachRemaining(e -> System.out.println(e));
	}

}
