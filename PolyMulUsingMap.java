import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PolyMulUsingMap {
	
	
	public static void main(String args[]){
		List<String> terms = new ArrayList<>(Arrays.asList("x^2", "3x^5", "5x"));

	    Map<Integer,Integer> map = new HashMap<Integer,Integer>();

	    for ( String term : terms ) {

	        String coefficient = term.split("x")[0].matches("") ? "1" : term.split("x")[0];

	        String[] exponent = term.split("x");

	        String power = exponent.length > 1 ? exponent[1].split("\\^")[1] : "1";

	        map.put(Integer.parseInt(coefficient), Integer.parseInt(power));
	    }
	    Integer finalCoefficient = 1;
	    Integer finalPower = 0;

	    for ( Integer coefficient : map.keySet() ) {
	        finalCoefficient *= coefficient;
	        finalPower += map.get(coefficient);
	    }
	    System.out.println(finalCoefficient + "x" + finalPower);
	}
}