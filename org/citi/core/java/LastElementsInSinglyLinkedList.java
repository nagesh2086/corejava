package org.citi.core.java;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Find N-4th element from Singly Linked List when size of list is N.
 * 
 * @author kekannag
 *
 */
public class LastElementsInSinglyLinkedList {
	private static SinglyLinkedList previous = null;
	private static SinglyLinkedList HEAD = null;

	public static void main(String[] args) {
		HEAD = createNode(10, null);
		setPrevious(HEAD);

		setPrevious(createNode(20, previous));
		setPrevious(createNode(30, previous));
		setPrevious(createNode(40, previous));
		setPrevious(createNode(50, previous));
		setPrevious(createNode(60, previous));
		setPrevious(createNode(70, previous));
		setPrevious(createNode(80, previous));
		setPrevious(createNode(90, previous));
		setPrevious(createNode(100, previous));

		print();

		System.out.println("now finding element from last \n");
		findElementFromLast(4);
		findElementFromLast(1);
		findElementFromLast(10);
	}

	private static void findElementFromLast(int n) {
		SinglyLinkedList fast = HEAD;
		SinglyLinkedList slow = HEAD;

		if (n > 0 && n <= 10) {
			AtomicInteger slowIndex = new AtomicInteger(1);

			while (fast.next != null) {
				int j = slowIndex.get();
				slowIndex.compareAndSet(j, ++j);

				fast = fast.next;

				if (slowIndex.get() > n) {
					slow = slow.next;
				}
			}
		} else {
			slow = null;
		}

		System.out.println(n + "th element from last is " + slow + "\n");
	}

	private static void setPrevious(SinglyLinkedList createdNode) {
		previous = createdNode;
	}

	private static SinglyLinkedList createNode(Integer data, SinglyLinkedList previous) {
		SinglyLinkedList node = new SinglyLinkedList(data, null);
		if (previous != null) {
			previous.next = node;
		}
		return node;
	}

	private static void print() {
		SinglyLinkedList temp = HEAD;
		System.out.println(temp);
		while (temp.next != null) {
			temp = temp.next;
			System.out.println(temp);
		}
	}
}

class SinglyLinkedList {
	Integer data;
	SinglyLinkedList next;

	public SinglyLinkedList(Integer data, SinglyLinkedList next) {
		this.data = data;
		this.next = next;
	}

	@Override
	public String toString() {
		return "SinglyLinkedList [data=" + data + ", next=" + next + "]";
	}

}
