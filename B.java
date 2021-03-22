
/**
 * 1. This instance method cannot override the static method from A. (A has static, B is trying to override)
 * 2. - This static method cannot hide the instance method from A (A has instance method, B is trying create same static method.)
 * @author nagesh2086
 *
 */
public class B extends A{
	
	static void doSomething(){
		System.out.println("Static BBBB");
	}
	
	@Override
	void doOverride() {
		System.out.println("BBBB-doOverride()");
	}
}
