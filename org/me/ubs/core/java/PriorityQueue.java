package org.me.ubs.core.java;

public class PriorityQueue {

	public static void main(String[] args) {
		java.util.PriorityQueue<Integer> q = new java.util.PriorityQueue<>();
		q.add(11);
		q.add(10);
		q.add(22);
		q.add(5);
		q.add(12);
		q.add(2);
		
		while (q.isEmpty() != true) {
			System.out.printf("%d ",q.remove());
			System.out.println();
		}
	}

}
