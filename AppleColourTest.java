import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AppleColourTest {

	public static void main(String[] args) {
		Apple red = new Apple("RED");
		Apple green = new Apple("GREEN");
		Apple red1 = new Apple("RED");
		
		List<Apple>list = new ArrayList<Apple>();
		list.add(green);
		list.add(red);
		list.add(red1);
		
		Stream<String> map = list.stream().map(a ->a.getColour()).distinct();
		List<String> collect = map.collect(Collectors.toList());
		
		System.out.println(collect);
	}

}
