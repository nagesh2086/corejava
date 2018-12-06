package org.me.core.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * //Fail-fast iterator and List is using Fail-fast iterator so
 * 
 * //we can observe ConcurrentModificationException when we are creating thread
 * and starting it.
 * 
 * Interesting fact is there is no CME if you are submitting task to executor
 * service framework.
 * 
 * @author kekannag
 *
 */
public class ConModTestOfArrayList {
	public static void main(String[] args) {
		ConModTestOfArrayList test = new ConModTestOfArrayList();
		test.initCountryCapitals();

		Runnable r1 = new ConModListThOne(test.countryCapitals);
		Runnable r2 = new ConModListThSecond(test.countryCapitals);
		Runnable r3 = new ConModListThThird(test.countryCapitals);

		/*
		 * ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
		 * cachedThreadPool.submit(r1); cachedThreadPool.submit(r2);
		 * cachedThreadPool.submit(r3);
		 */

		Thread T1 = new Thread(r1, "IteratingThread");
		Thread T2 = new Thread(r2, "AddingThread");
		Thread T3 = new Thread(r3, "RemovingThread");

		T1.start();
		T2.start();
		T3.start();
	}

	private final List<String> countryCapitals = new ArrayList<>();

	private void initCountryCapitals() {
		this.countryCapitals.add("Afghanistan -> Kabul");
		this.countryCapitals.add("Albania -> Tirana (Tirane)");
		this.countryCapitals.add("Algeria -> Algiers");
		this.countryCapitals.add("Andorra -> Andorra la Vella");
		this.countryCapitals.add("Angola -> Luanda");
		this.countryCapitals.add("Antigua and Barbuda -> Saint John's");
		this.countryCapitals.add("Bahamas -> Nassau");
		this.countryCapitals.add("Bahrain -> Manama");
		this.countryCapitals.add("Bangladesh -> Dhaka");
		this.countryCapitals.add("Belgium -> Brussels");
		this.countryCapitals.add("Afghanistan -> Kabul");
		this.countryCapitals.add("Albania -> Tirana (Tirane)");
		this.countryCapitals.add("Algeria -> Algiers");
		this.countryCapitals.add("Andorra -> Andorra la Vella");
		this.countryCapitals.add("Angola -> Luanda");
		this.countryCapitals.add("Antigua and Barbuda -> Saint John's");
		this.countryCapitals.add("Bahamas -> Nassau");
		this.countryCapitals.add("Bahrain -> Manama");
		this.countryCapitals.add("Bangladesh -> Dhaka");
		this.countryCapitals.add("Belgium -> Brussels");
		this.countryCapitals.add("Afghanistan -> Kabul");
		this.countryCapitals.add("Albania -> Tirana (Tirane)");
		this.countryCapitals.add("Algeria -> Algiers");
		this.countryCapitals.add("Andorra -> Andorra la Vella");
		this.countryCapitals.add("Angola -> Luanda");
		this.countryCapitals.add("Antigua and Barbuda -> Saint John's");
		this.countryCapitals.add("Bahamas -> Nassau");
		this.countryCapitals.add("Bahrain -> Manama");
		this.countryCapitals.add("Bangladesh -> Dhaka");
		this.countryCapitals.add("Belgium -> Brussels");
		this.countryCapitals.add("Afghanistan -> Kabul");
		this.countryCapitals.add("Albania -> Tirana (Tirane)");
		this.countryCapitals.add("Algeria -> Algiers");
		this.countryCapitals.add("Andorra -> Andorra la Vella");
		this.countryCapitals.add("Angola -> Luanda");
		this.countryCapitals.add("Antigua and Barbuda -> Saint John's");
		this.countryCapitals.add("Bahamas -> Nassau");
		this.countryCapitals.add("Bahrain -> Manama");
		this.countryCapitals.add("Bangladesh -> Dhaka");
		this.countryCapitals.add("Belgium -> Brussels");
		this.countryCapitals.add("Afghanistan -> Kabul");
		this.countryCapitals.add("Albania -> Tirana (Tirane)");
		this.countryCapitals.add("Algeria -> Algiers");
		this.countryCapitals.add("Andorra -> Andorra la Vella");
		this.countryCapitals.add("Angola -> Luanda");
		this.countryCapitals.add("Antigua and Barbuda -> Saint John's");
		this.countryCapitals.add("Bahamas -> Nassau");
		this.countryCapitals.add("Bahrain -> Manama");
		this.countryCapitals.add("Bangladesh -> Dhaka");
		this.countryCapitals.add("Belgium -> Brussels");
		this.countryCapitals.add("Poland -> Warsaw");
		this.countryCapitals.add("Portugal -> Lisbon");
		this.countryCapitals.add("Qatar -> Doha");
		this.countryCapitals.add("Romania -> Bucharest");
		this.countryCapitals.add("Russia -> Moscow");
		this.countryCapitals.add("Rwanda -> Kigali");
		this.countryCapitals.add("Saint Kitts and Nevis -> Basseterre");
		this.countryCapitals.add("Saint Lucia -> Castries");
		this.countryCapitals.add("Saint Vincent and the Grenadines -> Kingstown");
		this.countryCapitals.add("Samoa -> Apia");
		this.countryCapitals.add("San Marino -> San Marino");
		this.countryCapitals.add("Scotland -> Edinburgh");
		this.countryCapitals.add("Saudi Arabia -> Riyadh");
	}
}

class ConModListThOne implements Runnable {

	private final List<String> countryCapitals;

	ConModListThOne(List<String> countryCapitals) {
		this.countryCapitals = countryCapitals;
	}

	@Override
	public void run() {
		for (Iterator<String> iterator = countryCapitals.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
			// SleepHelper.goToSleepFor(400);
		}
	}

}

class SleepHelper {

	static void goToSleepFor(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class ConModListThSecond implements Runnable {

	private final List<String> countryCapitals;

	ConModListThSecond(List<String> countryCapitals) {
		this.countryCapitals = countryCapitals;
	}

	@Override
	public void run() {
		this.countryCapitals.add("Benin -> Porto Novo");
		this.countryCapitals.add("Bhutan -> Thimphu");
		// SleepHelper.goToSleepFor(400);

		this.countryCapitals.add("Bolivia -> La Paz");
		this.countryCapitals.add("Brazil -> Brasilia");
		// SleepHelper.goToSleepFor(400);

		this.countryCapitals.add("Cambodia -> Phnom Penh");
		this.countryCapitals.add("Poland -> Warsaw");
		this.countryCapitals.add("Portugal -> Lisbon");
		this.countryCapitals.add("Qatar -> Doha");
		this.countryCapitals.add("Romania -> Bucharest");
		this.countryCapitals.add("Russia -> Moscow");
		this.countryCapitals.add("Rwanda -> Kigali");
		this.countryCapitals.add("Saint Kitts and Nevis -> Basseterre");
		this.countryCapitals.add("Saint Lucia -> Castries");
		this.countryCapitals.add("Saint Vincent and the Grenadines -> Kingstown");
		this.countryCapitals.add("Samoa -> Apia");
		this.countryCapitals.add("San Marino -> San Marino");
		this.countryCapitals.add("Scotland -> Edinburgh");
		this.countryCapitals.add("Saudi Arabia -> Riyadh");
	}
}

class ConModListThThird implements Runnable {

	private final List<String> countryCapitals;

	ConModListThThird(List<String> countryCapitals) {
		this.countryCapitals = countryCapitals;
	}

	@Override
	public void run() {
		System.out.println(this.countryCapitals.remove("Andorra -> Andorra la Vella"));
		// SleepHelper.goToSleepFor(400);

		System.out.println(this.countryCapitals.remove("Bangladesh -> Dhaka"));
		// SleepHelper.goToSleepFor(400);

		System.out.println(this.countryCapitals.remove("Angola -> Luanda"));
		// SleepHelper.goToSleepFor(400);

		System.out.println(this.countryCapitals.remove("Belgium -> Brussels"));
		// SleepHelper.goToSleepFor(400);

		System.out.println(this.countryCapitals.remove("Brazil -> Brasilia"));
		// SleepHelper.goToSleepFor(400);

		System.out.println(this.countryCapitals.remove("Poland -> Warsaw"));
		System.out.println(this.countryCapitals.remove("Portugal -> Lisbon"));
		System.out.println(this.countryCapitals.remove("Qatar -> Doha"));
		System.out.println(this.countryCapitals.remove("Romania -> Bucharest"));
		System.out.println(this.countryCapitals.remove("Russia -> Moscow"));
		System.out.println(this.countryCapitals.remove("Rwanda -> Kigali"));
		System.out.println(this.countryCapitals.remove("Saint Kitts and Nevis -> Basseterre"));
		System.out.println(this.countryCapitals.remove("Saint Lucia -> Castries"));
		System.out.println(this.countryCapitals.remove("Saint Vincent and the Grenadines -> Kingstown"));
		System.out.println(this.countryCapitals.remove("Samoa -> Apia"));
		System.out.println(this.countryCapitals.remove("San Marino -> San Marino"));
		System.out.println(this.countryCapitals.remove("Scotland -> Edinburgh"));
		System.out.println(this.countryCapitals.remove("Saudi Arabia -> Riyadh"));
	}
}