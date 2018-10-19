package org.me.core.java;

public class ImmutableStudentTest {
	public static void main(String[] args) {
		// test 1 --> Passing Mutable Objects to Immutable Class
		Age age = new Age();
		age.setDay(1);
		age.setMonth(1);
		age.setYear(1992);
		ImmutableStudent student = new ImmutableStudent(1, "Alex", age);
		System.out.println("Alex age year before modification = " + student.getAge().getYear());
		age.setYear(1993);
		System.out.println("Alex age year after modification = " + student.getAge().getYear() + "\n\n");

		// test 2 --> Returning Mutable Objects From Immutable Class
		System.out.println("Alex age year before modification = " + student.getAge().getYear());
		student.getAge().setYear(1993);
		System.out.println("Alex age year after modification = " + student.getAge().getYear());
	}
}