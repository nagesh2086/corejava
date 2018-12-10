package org.me.core.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Get level of TreeNode
 * 
 * Print all nodes from Tree Level wise
 * 
 * @author kekannag
 *
 */
public class BinaryTreeLevelWiseNodeDataPrinting {

	public static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		TreeNode(int data) {
			this.data = data;
		}
	}

	// Recursive Solution
	// To get level of node in a binary tree
	public static int getLevelOfNode(TreeNode root, int key, int level) {
		if (root == null)
			return 0;
		if (root.data == key)
			return level;

		int result = getLevelOfNode(root.left, key, level + 1);
		if (result != 0) {
			// If found in left subtree , return
			return result;
		}
		result = getLevelOfNode(root.right, key, level + 1);

		return result;
	}

	public static void printLevelWise(TreeNode source) {
		TreeNode root = source;
		if (root == null)
			System.out.println("INPUT is NULL");

		Map<TreeNode, Boolean> vis = new HashMap<>();
		Queue<TreeNode> queue = new ArrayBlockingQueue<>(10);
		Map<Integer, Integer> levelMap = new HashMap<>();
		TreeMap<Integer, Integer> treeMap = null;
		treeMap = new TreeMap<>();
		int level = 0;
		queue.offer(root);

		while (queue.peek() != null) {
			TreeNode parent = queue.poll();
			vis.put(parent, true);
//			levelMap.put(parent.data, level);
			if (treeMap.get(parent.data) == null) {
				treeMap.put(parent.data, level);
				System.out.println("Level ->" + level + ", data -> " + parent.data);
			} /*
				 * else { levelMap.put(parent.data, level); }
				 */
			// System.out.println(parent.data);

			if (parent.left != null && (vis.get(parent.left) == null || vis.get(parent.left) == false)) {
				queue.offer(parent.left);
				vis.put(parent.left, true);
				treeMap.put(parent.left.data, treeMap.get(parent.data) + 1);
				System.out.print("Level ->" + treeMap.get(parent.left.data) + ", data -> " + parent.left.data + "\t");
			}

			if (parent.right != null && (vis.get(parent.right) == null || vis.get(parent.right) == false)) {
				queue.offer(parent.right);
				vis.put(parent.right, true);
				treeMap.put(parent.right.data, treeMap.get(parent.data) + 1);
				System.out.print("Level ->" + treeMap.get(parent.right.data) + ", data -> " + parent.right.data + "\t");
			}

			/*
			 * if (parent.left != null) { root = parent.left; } else { root = parent.right;
			 * }
			 */
			System.out.println();
		}

		// System.out.println(treeMap);
	}

	public static void main(String[] args) {
		// Creating a binary tree
		TreeNode rootNode = createBinaryTree();
		System.out.println("Node data: 70,Level :" + getLevelOfNode(rootNode, 70, 0));
		System.out.println("Node data: 100,Level :" + getLevelOfNode(rootNode, 100, 0));
		System.out.println("Node data: 60,Level :" + getLevelOfNode(rootNode, 60, 0));
		System.out.println("Node data: 40,Level :" + getLevelOfNode(rootNode, 40, 0));

		printLevelWise(rootNode);
	}

	public static TreeNode createBinaryTree() {

		TreeNode rootNode = new TreeNode(40);
		TreeNode node20 = new TreeNode(20);
		TreeNode node10 = new TreeNode(10);
		TreeNode node30 = new TreeNode(30);
		TreeNode node60 = new TreeNode(60);
		TreeNode node50 = new TreeNode(50);
		TreeNode node70 = new TreeNode(70);

		rootNode.left = node20;
		rootNode.right = node60;

		node20.left = node10;
		node20.right = node30;

		node60.left = node50;
		node60.right = node70;

		return rootNode;
	}
}