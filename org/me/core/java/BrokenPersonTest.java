package org.me.core.java;

import java.util.Date;

/**
 * Immutability test for custom person class
 * 
 * Template for creating immutable objects. 1. Make all fields private
 * 
 * 2. Don't provide mutators(setter)
 * 
 * 3. Ensure that methods can't be overridden by either making the class final
 * (Strong Immutability) or making your methods final (Weak Immutability)
 * 
 * 4. If a field isn't primitive or immutable, make a deep clone on the way in
 * and the way out.
 * 
 * @author kekannag
 *
 */
public class BrokenPersonTest {
	public static void main(String args[]) throws InterruptedException {
		/*
		 * BrokenPerson person = new BrokenPerson("Nagesh", "Kekan", new Date());
		 * System.out.println(person);
		 * 
		 * String firstName = person.getFirstName(); firstName = new String("Rajesh");
		 * 
		 * String lastName = person.getLastName(); lastName = new String("Raut");
		 * 
		 * Date dob = person.getDOB(); System.out.println(dob + " before changing...");
		 * 
		 * Thread.sleep(11000);
		 * 
		 * Date tmp = new Date(); System.out.println(tmp + " setting new...");
		 * 
		 * dob = tmp; System.out.println("\nAfter changing ref of firstName ->\n" +
		 * person);
		 */

		Date myDate = new Date();
		BrokenPerson myPerson = new BrokenPerson("David", "O'Meara", myDate);
		System.out.println(myPerson.getDOB());
		myDate.setMonth(myDate.getMonth() + 1);
		System.out.println(myPerson.getDOB());

		Date dob = myPerson.getDOB();
		int month = dob.getMonth();
		int nxtMonth = month + 1;
		dob.setMonth(nxtMonth);
		System.out.println(myPerson.getDOB());
	}
}

final class BrokenPerson {
	private String firstName;
	private String lastName;
	private Date dob;

	public BrokenPerson(String firstName, String lastName, Date dob) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = new Date(dob.getTime());
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public Date getDOB() {
		return new Date(this.dob.getTime());
	}

	@Override
	public String toString() {
		return "BrokenPerson [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + "]";
	}
}
