package intrinsic;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class MultipleSyncMethodsDemo {

	public static void main(String[] args) throws InterruptedException {
		MultipleSyncMethodsDemo demo = new MultipleSyncMethodsDemo();
		Thread thread1 = new Thread(() -> {
			System.out.println("thread1 before call and trying to aquire lock " + LocalDateTime.now());
			demo.syncMethod1("from thread1");
			System.out.println("thread1 after call and after relasing lock " + LocalDateTime.now());
		});
		Thread thread2 = new Thread(() -> {
			System.out.println("thread2 before call  and trying to aquire lock " + LocalDateTime.now());
			demo.syncMethod2("from thread2");
			System.out.println("thread2 after call and after relasing lock " + LocalDateTime.now());
		});

		thread1.start();
		thread2.start();
	}

	private synchronized void syncMethod1(String msg) {
		System.out.println("in the syncMethod1 and lock aquired by " + msg + " " + LocalDateTime.now());
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private synchronized void syncMethod2(String msg) {
		System.out.println("in the syncMethod2 and lock aquired by " + msg + " " + LocalDateTime.now());
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}