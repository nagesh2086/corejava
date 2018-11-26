package org.me.core.java;

public class FactorialFunctionTest {

	public static void main(String[] args) {
		FactorialFunction ff = new FactorialFunction();
		System.out.println(ff.getFactorialOf(5));
		System.out.println(ff.getFactorialOf(7));
		System.out.println(ff.getFactorialOf(0));
		System.out.println(ff.getFactorialOf(1));
		// System.out.println(ff.getFactorialOf(-5));
		System.out.println(ff.factorialOf(5));
		System.out.println(ff.factorialOf(1));
		System.out.println(ff.factorialOf(-55));
	}

}

class FactorialFunction {

	int result = 1;

	public int getFactorialOf(int i) {
		if (i < 0) {
			throw new IllegalArgumentException("Input must be positive number");
		}
		if (i == 0 || i == 1) {
			return 1;
		}
		int result = i;
		i--;
		while (i > 0) {
			result = result * i;
			i--;
		}
		return result;
	}

	public int factorialOf(int i) {
		if (i < 0) {
			throw new IllegalArgumentException("Input must be positive number");
		}
		if (i == 0) {
			return 1;
		}
		result = i * factorialOf(i - 1);
		return result;
	}
}
