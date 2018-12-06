package org.me.core.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * //Fail-fast iterator and Map is using Fail-fast iterator so
 * 
 * //we can see ConcurrentModificationException when we are creating thread and
 * starting it.
 * 
 * Interesting fact is there is no CME if you are submitting task to executor
 * service framework.
 * 
 * @author kekannag
 *
 */
public class ConModTestOfHashMap {
	public static void main(String[] args) {
		ConModTestOfHashMap test = new ConModTestOfHashMap();
		test.initCountryCapitals();

		Runnable r1 = new ConModThOne(test.countryCapitals);
		Runnable r2 = new ConModThSecond(test.countryCapitals);
		Runnable r3 = new ConModThThird(test.countryCapitals);

		/*
		 * ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
		 * cachedThreadPool.submit(r2); cachedThreadPool.submit(r1);
		 * cachedThreadPool.submit(r3);
		 */

		/*
		 * Thread T1 = new Thread(r1, "Map:IteratingThread"); Thread T2 = new Thread(r2,
		 * "Map:AddingThread"); Thread T3 = new Thread(r3, "Map:RemovingThread");
		 * 
		 * T1.start(); T2.start(); T3.start();
		 */

		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
		fixedThreadPool.submit(r1);
		fixedThreadPool.submit(r2);
		fixedThreadPool.submit(r3);
	}

	private final Map<String, String> countryCapitals = new HashMap<>();

	private void initCountryCapitals() {
		this.countryCapitals.put("Afghanistan", "Kabul");
		this.countryCapitals.put("Albania", "Tirana (Tirane)");
		this.countryCapitals.put("Algeria", "Algiers");
		this.countryCapitals.put("Andorra", "Andorra la Vella");
		this.countryCapitals.put("Angola", "Luanda");
		this.countryCapitals.put("Antigua and Barbuda", "Saint John's");
		this.countryCapitals.put("Bahamas", "Nassau");
		this.countryCapitals.put("Bahrain", "Manama");
		this.countryCapitals.put("Bangladesh", "Dhaka");
		this.countryCapitals.put("Belgium", "Brussels");
	}
}

/*
 * class SleepHelper {
 * 
 * static void goToSleepFor(int millis) { try { Thread.sleep(millis); } catch
 * (InterruptedException e) { e.printStackTrace(); } } }
 */

class ConModThOne implements Runnable {

	private final Map<String, String> countryCapitals;

	ConModThOne(Map<String, String> countryCapitals) {
		this.countryCapitals = countryCapitals;
	}

	@Override
	public void run() {
		for (Entry<String, String> element : this.countryCapitals.entrySet()) {
			// SleepHelper.goToSleepFor(400);
			System.out.println(element.getKey() + " --> " + element.getValue());
		}
	}
}

class ConModThSecond implements Runnable {

	private final Map<String, String> countryCapitals;

	ConModThSecond(Map<String, String> countryCapitals) {
		this.countryCapitals = countryCapitals;
	}

	@Override
	public void run() {
		this.countryCapitals.put("Benin", "Porto Novo");
		this.countryCapitals.put("Bhutan", "Thimphu");
		// SleepHelper.goToSleepFor(300);
		this.countryCapitals.put("Bolivia", "La Paz");
		this.countryCapitals.put("Brazil", "Brasilia");
		// SleepHelper.goToSleepFor(300);
		this.countryCapitals.put("Cambodia", "Phnom Penh");
	}
}

class ConModThThird implements Runnable {

	private final Map<String, String> countryCapitals;

	ConModThThird(Map<String, String> countryCapitals) {
		this.countryCapitals = countryCapitals;
	}

	@Override
	public void run() {
		System.out.println(this.countryCapitals.remove("Cameroon"));
		// SleepHelper.goToSleepFor(200);
		System.out.println(this.countryCapitals.remove("Bangladesh"));
		// SleepHelper.goToSleepFor(300);
		System.out.println(this.countryCapitals.remove("Angola"));
		// SleepHelper.goToSleepFor(200);
		System.out.println(this.countryCapitals.remove("Belgium"));
		// SleepHelper.goToSleepFor(100);
		System.out.println(this.countryCapitals.remove("Brazil"));
		// SleepHelper.goToSleepFor(300);
		System.out.println(this.countryCapitals.remove("Algeria"));
	}
}