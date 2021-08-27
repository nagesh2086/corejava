import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 500; i++) {
			list.add(i);
		}
		
		Spliterator<Integer> spliterator = list.spliterator();
		System.out.println("FOR EACH REMAINING INITIALLY");
		spliterator.tryAdvance(c -> System.out.print(c + " "));
		System.out.println("FOR EACH REMAINING INITIALLY");
		spliterator.forEachRemaining(i -> System.out.print(i + " "));
		
		System.out.println("TRY ADVANCE - FOR EACH");
		Spliterator<Integer> trySplit = spliterator.trySplit();
		trySplit.tryAdvance(c -> System.out.print(c + " "));
		System.out.println("\nTRY SPLIT - FOREACH");
		trySplit.forEachRemaining(i -> System.out.println(i));
	}

}
