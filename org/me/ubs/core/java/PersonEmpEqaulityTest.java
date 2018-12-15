package org.me.ubs.core.java;

public class PersonEmpEqaulityTest {

	public static void main(String[] args) {
		Person p = new Person();
		p.setAadharNumber("XYI388749");
		p.setBusinessOwner(false);
		p.setEmployed(true);
		p.setFirstName("Nagesh");
		p.setLastName("Kekan");
		p.setHeight(5.5d);
		p.setWeight(87);
		
		Employee e = new Employee();
		e.setAadharNumber("XYI388749");
		e.setBusinessOwner(false);
		e.setEmployed(true);
		e.setFirstName("Nagesh");
		e.setLastName("Kekan");
		e.setHeight(5.5d);
		e.setWeight(87);
		e.setEmployeeId(new Integer(65432));
		e.setOrgName("UBS India");
		
		System.out.println(p.equals(e));
		System.out.println(e.equals(p));
	}

}
