package diamond;
//Diamond.java

interface Interface1 {
    default public void foo() { System.out.println("Interface1's foo"); }
}
interface Interface2 {
    default public void foo() { System.out.println("Interface2's foo"); }
}

class BaseClass {
    public void foo() { System.out.println("BaseClass's foo"); }
}
interface BaseInterface {
    default public void foo() { System.out.println("BaseInterface's foo"); }
}

public class Diamond extends BaseClass implements BaseInterface {
    public static void main(String []args) {
        new Diamond().foo();
    }

	/*@Override
	public void foo() {
		Interface1.super.foo();
		Interface2.super.foo();
	}*/
    
    @Override
    public void foo() {
    	super.foo();
    	BaseInterface.super.foo();
    }
}