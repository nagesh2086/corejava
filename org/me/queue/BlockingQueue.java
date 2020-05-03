package org.me.queue;

import java.util.LinkedList;
import java.util.List;

public class BlockingQueue {
	private final List<Double> queue = new LinkedList<>();
	private final int limit;

	public BlockingQueue(int limit) {
		super();
		this.limit = limit;
	}

	public synchronized void enqueue(Double e) throws InterruptedException {
		while (queue.size() == limit) {
			wait();
		}
		if (queue.size() == 0) {
			notifyAll();
		}
		System.out.println("adding :" + e);
		queue.add(e);
	}

	public synchronized Double dequeue() throws InterruptedException {
		while (queue.size() == 0) {
			wait();
		}
		if (queue.size() == limit) {
			notifyAll();
		}
		Double e = queue.remove(0);
		System.out.println("removed: " + e);
		return e;
	}
}
