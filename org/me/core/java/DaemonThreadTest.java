package org.me.core.java;

class DaemonThread implements Runnable {
	@Override
	public void run() {
		while (true) {
			processSomething(5000);
		}
	}

	private void processSomething(int millis) {
		try {
			System.out.println(getThreadName() + " processSomething() and going to sleep for " + millis);
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private String getThreadName() {
		return Thread.currentThread().getName();
	}
}

public class DaemonThreadTest {
	public static void main(String[] args) {
		DaemonThread dt = new DaemonThread();

		Thread t1 = new Thread(dt, "1_DaemonThread");

		t1.setDaemon(true);
		t1.start();

		goToSleep(3000);
	}

	private static void goToSleep(int millis) {
		try {
			System.out.println(getThreadName() + " goToSleep() and going to sleep for " + millis);
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static String getThreadName() {
		return Thread.currentThread().getName();
	}
}