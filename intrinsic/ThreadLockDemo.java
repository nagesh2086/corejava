package intrinsic;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class ThreadLockDemo {

	public static void main(String[] args) {
		ThreadLockDemo tld = new ThreadLockDemo();
		Thread thread1 = new Thread(() -> {
			System.out.println("thread 1 running trying to aquire lock " + LocalDateTime.now());
			tld.syncMethod("thread 1");
			System.out.println("thread 1 running after releasing lock  " + LocalDateTime.now());
		});
		Thread thread2 = new Thread(() -> {
			System.out.println("thread 2 running trying to aquire lock " + LocalDateTime.now());
			tld.syncMethod("thread 2");
			System.out.println("thread 2 running after releasing lock  " + LocalDateTime.now());
		});

		thread1.start();
		thread2.start();
	}

	synchronized void syncMethod(String msg) {
		System.out.println("In synchronized method: lock aquired by " + msg + " " + LocalDateTime.now());
		try {
			TimeUnit.SECONDS.sleep(120);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Completed and leaving synchronized method: lock released by " + msg + " " + LocalDateTime.now());
	}

}
