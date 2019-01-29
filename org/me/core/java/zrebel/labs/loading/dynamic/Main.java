package org.me.core.java.zrebel.labs.loading.dynamic;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Dynamic class loading means the loaded classes are identified by 
 * <Class loader> + <Package name> + <Class name>. 
 * So same class can be loaded two or
 * many times if classloader are different.
 * 
 * @author kekannag
 *
 */
public class Main {
	private static ICounter counter1;
	private static ICounter counter2;

	public static void main(String[] args) throws MalformedURLException, InstantiationException, IllegalAccessException,
			ClassNotFoundException, InterruptedException {

		/*
		 * URL url = new URL(
		 * "file:\\C:\\Users\\kekannag\\eclipse-workspace\\Concurrency\\bin\\org\\me\\core\\java\\zrebel\\labs\\loading\\dynamic"
		 * ); System.out.println(url);
		 */

		/*
		 * System.out.println(Main.class.getClassLoader()); Class<?> loadedClass =
		 * Main.class.getClassLoader().loadClass(
		 * "org.me.core.java.zrebel.labs.loading.dynamic.Counter");
		 * System.out.println(loadedClass);
		 */

		/*
		 * String concat =
		 * "org.me.core.java.zrebel.labs.loading.dynamic.Counter".replace('.',
		 * '/').concat(".class"); System.out.println(concat);
		 */

		counter1 = CounterFactory.newInstance();

		while (true) {
			counter2 = CounterFactory.newInstance();

			System.out.println("1) " + counter1.message() + " = " + counter1.plusPlus());
			System.out.println("2) " + counter2.message() + " = " + counter2.plusPlus());
			System.out.println();

			Thread.currentThread().sleep(3000);
		}
	}
}