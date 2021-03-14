package com.baeldung.reflection.check.abstractclass;

import java.lang.reflect.Modifier;

import com.sun.jmx.mbeanserver.ModifiableClassLoaderRepository;

public class AbstractExampleTest {

	public static void main(String[] args) {
		Class<AbstractClass> clazz = AbstractClass.class;
		boolean b = Modifier.isAbstract(clazz.getModifiers());
		System.out.println(b);
	}

}
