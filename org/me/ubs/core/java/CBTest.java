package org.me.ubs.core.java;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CBTest implements Runnable {

	public static CyclicBarrier barrier = new CyclicBarrier(3);

	@Override
	public void run() {
		System.out.printf(" XYZ ");
		try {
			barrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Thread th1 = new Thread(new CBTest());
		Thread th2 = new Thread(new CBTest());

		th1.start();
		th2.start();

		System.out.printf(" ABC ");
		try {
			barrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
		System.out.printf(" END ");
	}

}
