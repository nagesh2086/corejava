package org.me.core.java;

public class TestInterfaceImpl implements TestInterface {

	
	public static void main(String[] args) {
		System.out.println("TestInterface.nameOfI -> " + TestInterface.nameOfI + "\n");
		TestInterface.purposeOfI();//Interface static method
		System.out.println();
		
		TestInterfaceImpl impl = new TestInterfaceImpl();
		impl.impl();//overridden method
		impl.identity();//overridden default method
		impl.hashCode();//overridden default method
		impl.fullyName();//overridden default method
	}

	@Override
	public String impl() {
		String name = TestInterface.nameOfI + "Impl\n";
		System.out.println(TestInterface.nameOfI + "Impl\n");
		return name;
	}

	@Override
	public void identity() {
		System.out.println(impl() + "--> identity() method");
	}

	@Override
	public int hashCode() {
		return 31 * impl().hashCode();
	}
	
}
