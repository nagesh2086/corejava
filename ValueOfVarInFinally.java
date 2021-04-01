
public class ValueOfVarInFinally {

	public static void main(String[] args) {
		int tryFinallyTest = tryFinallyTest();
		System.out.println("After return: " + tryFinallyTest);
	}

	public static int tryFinallyTest() {
		int x = 10;
		System.out.println("Original: " + x);

		try {
			x = 100;
			System.out.println("Try: " + x);
			//return x;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			x = 200;
			System.out.println("Finally: " + x);
		}
		
		System.out.println("Before return and END: " + x);
		return x;

	}

}
