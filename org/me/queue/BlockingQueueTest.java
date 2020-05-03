package org.me.queue;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BlockingQueueTest {

	public static void main(String[] args) throws InterruptedException {
		final BlockingQueue q = new BlockingQueue(10);
		Runnable runnable1 = new Runnable() {

			@Override
			public void run() {
				try {
					q.enqueue(Math.random());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Runnable runnable2 = new Runnable() {

			@Override
			public void run() {
				try {
					q.dequeue();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		ExecutorService pool = Executors.newCachedThreadPool();
		pool.submit(runnable2);//1
		pool.submit(runnable2);//2
		pool.submit(runnable1);//1
		pool.submit(runnable2);//3
		pool.submit(runnable1);//2
		pool.submit(runnable2);//4
		pool.submit(runnable1);//3
		pool.submit(runnable2);//5
		pool.submit(runnable1);//4
		pool.submit(runnable2);//6
		pool.submit(runnable1);//5
		pool.submit(runnable2);//7
		pool.submit(runnable2);//8
		pool.submit(runnable2);//9
		pool.submit(runnable2);//10
		pool.submit(runnable2);//11
		pool.submit(runnable2);//12
		pool.submit(runnable2);//13
		pool.submit(runnable2);//14
		pool.submit(runnable2);//15
		pool.submit(runnable1);//6
		pool.submit(runnable1);//7
		pool.submit(runnable1);//8
		pool.submit(runnable2);//16
		pool.submit(runnable2);//17
		pool.submit(runnable2);//18
		pool.submit(runnable2);//19
		pool.submit(runnable2);//20
		pool.submit(runnable2);//21
		pool.submit(runnable2);//22
		pool.submit(runnable2);//23
		pool.submit(runnable1);//9
		pool.submit(runnable1);//10
		pool.submit(runnable1);//11
		pool.submit(runnable1);//12
		pool.submit(runnable1);//13
		pool.submit(runnable1);//14
		pool.submit(runnable1);//15
		pool.submit(runnable1);//16
		pool.submit(runnable1);//17
		pool.submit(runnable1);//18
		pool.submit(runnable1);//19
		pool.submit(runnable1);//20
		pool.submit(runnable1);//21
		pool.submit(runnable1);//22
		pool.submit(runnable1);//23
		pool.submit(runnable1);//24
		pool.submit(runnable1);//25
		pool.submit(runnable1);//26
		pool.submit(runnable1);//27
		pool.submit(runnable1);//28
		pool.submit(runnable1);//29
		pool.submit(runnable1);//30
		
		pool.submit(runnable1);//9
		pool.submit(runnable1);//10
		pool.submit(runnable1);//11
		pool.submit(runnable1);//12
		pool.submit(runnable1);//13
		pool.submit(runnable1);//14
		pool.submit(runnable1);//15
		pool.submit(runnable1);//16
		pool.submit(runnable1);//17
		pool.submit(runnable1);//18
		pool.submit(runnable1);//19
		pool.submit(runnable1);//20
		pool.submit(runnable1);//21
		pool.submit(runnable1);//22
		pool.submit(runnable1);//23
		pool.submit(runnable1);//24
		pool.submit(runnable1);//25
		pool.submit(runnable1);//26
		pool.submit(runnable1);//27
		pool.submit(runnable1);//28
		pool.submit(runnable1);//29
		pool.submit(runnable1);//30
		
		pool.shutdown();
		while (!pool.awaitTermination(60, TimeUnit.SECONDS)) {
			pool.shutdownNow();
		}
	}

}
