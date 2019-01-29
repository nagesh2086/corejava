package org.me.core.java.zrebel.labs.loading.dynamic;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class CounterFactory {
	public static ICounter newInstance()
			throws MalformedURLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		URLClassLoader tmp = new URLClassLoader(new URL[] { getClassPath1(), getClassPath2() }) {
			public Class loadClass(String name) throws ClassNotFoundException {
				if ("Counter".equals(name))
					return findClass(name);
				return super.loadClass(name);
			}
		};

		return (ICounter) tmp.loadClass("org.me.core.java.zrebel.labs.loading.dynamic.Counter").newInstance();
	}

	private static URL getClassPath1() throws MalformedURLException {
		System.out.println(CounterFactory.class.getResource("dynamic"));
		/*return new URL(
				"file:\\C:\\Users\\kekannag\\eclipse-workspace\\Concurrency\\bin\\org\\me\\core\\java\\zrebel\\labs\\loading\\dynamic");
*/		
		return new URL(
				"file:\\C:\\Users\\kekannag\\eclipse-workspace\\Concurrency\\bin");
	}
	
	private static URL getClassPath2() throws MalformedURLException {
		System.out.println(CounterFactory.class.getResource("dynamic"));
		return new URL(
				"file:\\C:\\Users\\kekannag\\eclipse-workspace\\Concurrency\\bin\\org\\me\\core\\java\\zrebel\\labs\\loading\\dynamic");
		
	}
}