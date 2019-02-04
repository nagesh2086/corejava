package org.me.core.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Java is Pass by Value and Not Pass by Reference.
 * 
 * @author kekannag
 *
 */
public class JavaIsPassByValueAlways {
	public static void main(String[] args) {
		// test: passing primitive as method arguments

		int x = 1;
		int y = 2;
		System.out.print("Values of x & y before primitive modification: ");
		System.out.println(" x = " + x + " ; y = " + y);
		modifyPrimitiveTypes(x, y);
		System.out.print("Values of x & y after primitive modification: ");
		System.out.println(" x = " + x + " ; y = " + y + "\n");

		// test: passing wrapper as method arguments

		Integer obj1 = new Integer(1);
		Integer obj2 = new Integer(2);
		System.out.print("Values of obj1 & obj2 before wrapper modification: ");
		System.out.println("obj1 = " + obj1.intValue() + " ; obj2 = " + obj2.intValue());
		modifyWrappers(obj1, obj2);
		System.out.print("Values of obj1 & obj2 after wrapper modification: ");
		System.out.println("obj1 = " + obj1.intValue() + " ; obj2 = " + obj2.intValue() + "\n");

		// test: passing collection as method arguments
		List<Integer> lstNums = new ArrayList<Integer>();
		lstNums.add(1);
		System.out.println("Size of list before List modification = " + lstNums.size());
		modifyList(lstNums);
		System.out.println("Size of list after List modification = " + lstNums.size() + "\n");

		// test: passing business objects as method arguments
		Student student = new Student();
		System.out.println("Value of name before Student modification = " + student.getName());
		modifyStudent(student);
		System.out.println("Value of name after Student modification = " + student.getName());
	}

	private static void modifyPrimitiveTypes(int x, int y) {
		x = 5;
		y = 10;
	}

	private static void modifyWrappers(Integer x, Integer y) {
		x = new Integer(5);
		y = new Integer(10);
	}

	private static void modifyList(List<Integer> lstParam) {
		lstParam.add(2);
		lstParam = new ArrayList<>();
		lstParam.add(1);
		lstParam.add(2);
		lstParam.add(3);// now size becomes 3 and lstParam is referring different object.
	}

	/**
	 * We are setting name by using given student reference of Student class then
	 * making student reference to refer another object.
	 * 
	 * @param student - it is only reference value which is same as when called this
	 *                method.
	 */
	private static void modifyStudent(Student student) {
		student.setName("Alex");
		student = new Student();
		student.setName("Janardhan");

	}
}