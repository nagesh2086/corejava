package org.me.core.java;

public class FibonacciNumberPrinterTest {

	private int f0 = 0;
	private int f1 = 1;
	private int count = 5;

	public static void main(String[] args) {
		FibonacciNumber fn = new FibonacciNumber(5);
		fn.calculate();
		
		
		fn = new FibonacciNumber(10);
		fn.calculate();
	}

}

class FibonacciNumber {
	private int f0 = 0;
	private int f1 = 1;
	private int count;

	public FibonacciNumber(int count) {
		this.count = count;
	}

	public void calculate() {
		if (count < 2) {
			throw new IllegalArgumentException("Given " + count + "must be greater than or equal to 2");
		}
		System.out.print(f0);
		System.out.print(", ");
		count--;
		System.out.print(f1);
		System.out.print(", ");
		count--;

		while (count > 0) {
			int sum = f0 + f1;
			f0 = f1;
			f1 = sum;
			System.out.print(sum);
			System.out.print(", ");
			count--;
		}
		System.out.println();
	}
}
