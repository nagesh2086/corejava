package org.me.core.java;

class Runnable_A implements Runnable {
	@Override
	public void run() {
		synchronized (Runnable_A.class) {
			System.out.println(getThreadName() + " acquired lock on Runnable_A");
			goToSleep(1000);

			synchronized (Runnable_B.class) {
				System.out.println(getThreadName() + " acquired lock on Runnable_B");
				goToSleep(1000);
			}
		}
	}

	private String getThreadName() {
		return Thread.currentThread().getName();
	}

	private void goToSleep(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Runnable_B implements Runnable {
	@Override
	public void run() {
		synchronized (Runnable_B.class) {
			System.out.println(getThreadName() + " acquired lock on Runnable_B");
			goToSleep(1000);

			synchronized (Runnable_A.class) {
				System.out.println(getThreadName() + " acquired lock on Runnable_A");
				goToSleep(1000);

			}
		}
	}

	private String getThreadName() {
		return Thread.currentThread().getName();
	}

	private void goToSleep(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class DeadlockJConsoleTest {
	public static void main(String[] args) {
		Runnable_A a = new Runnable_A();
		Runnable_B b = new Runnable_B();

		Thread t1 = new Thread(a, "1_Runnable_A");
		Thread t2 = new Thread(b, "1_Runnable_B");

		t1.start();
		t2.start();
	}
}