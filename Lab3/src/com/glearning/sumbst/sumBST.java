package com.glearning.sumbst;
import java.util.HashSet;
import java.util.Set;

public class sumBST {
	private Node root;

	private static class Node {
		int val;
		Node left;
		Node right;

		public Node(int val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

	public sumBST() {
		root = null;
	}

	public void insert(int val) {
		root = insert(root, val);
	}

	private Node insert(Node node, int val) {
		if (node == null) {
			// root node
			return new Node(val);
		}
		if (val < node.val) {
			node.left = insert(node.left, val);
		}
		if (val > node.val) {
			node.right = insert(node.right, val);
		}
		return node;
	}
	
	public boolean findSum(int sum) {
		Set<Integer> set = new HashSet<>();
		return findSum(root,sum, set);
	}
	
	

	private boolean findSum(Node node, int sum, Set<Integer> set) {
		if(node == null) {
			return false;
		}
		if(findSum(node.left, sum, set)) {
			return true;
		}
		if(set.contains(sum - node.val)) {
			System.out.println("Pair is ("+ (sum - node.val) + ","+ node.val +")");
			return true;
		}
		set.add(node.val);
		return findSum(node.right, sum, set);
	}

}
