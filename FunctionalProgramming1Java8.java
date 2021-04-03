import java.util.function.BiFunction;

public class FunctionalProgramming1Java8 {

	public static void main(String[] args) {
		Shape square = length -> System.out.println(length * length);
		Shape circle = radius -> System.out.println(Math.PI * radius * radius);

		double length = 10d;
		double radius = 5d;
		/*
		 * Consumer<Shape> cirConsme = shape -> shape.area(radius);
		 * cirConsme.accept(circle);
		 * 
		 * 
		 * Consumer<Shape> sqrConsme = shape -> shape.area(length);
		 * sqrConsme.accept(square);
		 */

		BiFunction<Shape, Double, Double> bf = new BiFunction<Shape, Double, Double>() {

			@Override
			public Double apply(Shape t, Double u) {
				t.area(u);
				return null;
			}
		};

		bf.apply(circle, radius);
		bf.apply(square, length);
	}

}

interface Shape {
	void area(double val);
}
