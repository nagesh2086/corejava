package org.me.oops;

public class ProcessTest {

	public static void main(String[] args) {
		Process p = new Process();
		System.out.println("Process:Final product -> " + p.getFinalProduct());

		ProcessTest pt = new ProcessTest();
		pt.testPrivateMemberAccessOfInnerClass();
	}

	/**
	 * Cannot access private member of inner class directly
	 */
	private void testPrivateMemberAccessOfInnerClass() {
		Process p = new Process();
		// p.ingredientLocal1

		// test static inner class
		PrivateMemberTest pmt = new PrivateMemberTest();
		System.out.println("PrivateMemberTest:Private member -> " + pmt.privateMemId);
		System.out.println("PrivateMemberTest:Public memeber -> " + pmt.publicMemId);
	}

	private final static class PrivateMemberTest {
		private int privateMemId;
		public int publicMemId;
	}
}

class Process {
	private int ingredientLocal1;
	private int ingredientLocal2;
	private int ingredientOutside1;
	private int ingredientOutside2;

	public int getFinalProduct() {
		return getLocalIngredient() + getOutsideIngredient();
	}

	private int getOutsideIngredient() {
		return ingredientOutside1 + ingredientOutside2;
	}

	private int getLocalIngredient() {
		return ingredientLocal1 + ingredientLocal2;
	}

}