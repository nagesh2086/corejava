package intrinsic;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class ReentrantDemo {

	public static void main(String[] args) throws InterruptedException {
		ReentrantDemo demo = new ReentrantDemo();
		Thread thread1 = new Thread(() -> {
			System.out.println("thread1 before call " + LocalDateTime.now());
			demo.syncMethod1("from thread1");
			demo.nonSynchronizedMethod("from thread1 calling nonsynchronized lock ");
			System.out.println("thread1 after call " + LocalDateTime.now());
		});
		Thread thread2 = new Thread(() -> {
			System.out.println("thread2 before call " + LocalDateTime.now());
			demo.syncMethod2("from thread2");
			demo.nonSynchronizedMethod("from thread2 calling nonsynchronized lock ");
			System.out.println("thread2 after call " + LocalDateTime.now());
		});

		thread1.start();
		thread2.start();
	}

	private synchronized void syncMethod1(String msg) {
		System.out.println("in the syncMethod1 " + msg + " " + LocalDateTime.now());
		syncMethod2("from method syncMethod1, reentered call");
	}

	private synchronized void syncMethod2(String msg) {
		System.out.println("in the syncMethod2 " + msg + " " + LocalDateTime.now());
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void nonSynchronizedMethod(String msg) {

		System.out.println("in the nonSynchronizedMethod " + msg + " " + LocalDateTime.now());
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}