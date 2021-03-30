
public class ValueOfVarInFinally {

	public static void main(String[] args) {
		int x = 10;
		System.out.println("Original: " + x);
		
		try {
			x = 100;
			System.out.println("Try: " + x);
			return;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			x = 200;
			System.out.println("Finally: " + x);
		}
		System.out.println("End: " + x);
	}

}
