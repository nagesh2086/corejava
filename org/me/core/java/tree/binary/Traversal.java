package org.me.core.java.tree.binary.level.order;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Q1. Print binary tree data level-wise.
 * 
 * Solution: Breadth first or level-order traversal
 * 
 * Q2. Traverse depth-wise binary tree
 * 
 * Solution: Depth First Traversal
 * 
 * @author kekannag
 *
 */
public class Traversal {

	public static void main(String[] args) {
		Node node = new Node('A', new Node('B', new Node('C', null, null), new Node('D', null, null)),
				new Node('E', new Node('F', null, null), new Node('G', new Node('H', null, null), null)));

		System.out.print("BFS Traversal --> ");
		bfsTraversal(node);
		System.out.print("\n\nDFS Traversal --> ");
		dfsTraversal(node);
	}

	private static final void bfsTraversal(Node root) {
		Queue<Node> q = new LinkedList<>();

		q.add(root);
		while (!q.isEmpty()) {
			Node node = q.poll();
			System.out.print(node.getData() + " - ");

			if (null != node.getLeft()) {
				q.add(node.getLeft());
			}
			if (null != node.getRight()) {
				q.add(node.getRight());
			}
		}

	}

	// recursive solution of DFS and it is more appropriate and effective.
	private static final void dfsTraversal(Node node) {
		if (node == null)
			return;
		System.out.print(node.getData() + " - ");
		dfsTraversal(node.getLeft()); // traverse left wing in depth first
		dfsTraversal(node.getRight());// then traverse right wing in depth
	}
}

class Node {
	private char data;
	private Node left;
	private Node right;

	public Node(char data, Node left, Node right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public char getData() {
		return data;
	}

	public Node getLeft() {
		return left;
	}

	public Node getRight() {
		return right;
	}
}
