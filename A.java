/**
 * - This static method cannot hide the instance method from A void
 * doSomething(){System.out.println("AAAA");};
 * 
 */

public class A {
	static void doSomething() {
		System.out.println("AAAA");
	};

	void doOverride() {
		System.out.println("AAAA-doOverride()");
	}
}
