package com.leet.leetcode_dec_2020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class Dec03_Increasing_Order_Search_Tree {

	//https://leetcode.com/problems/increasing-order-search-tree/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(4);
		root.left.left.left = new TreeNode(1);

		root.right = new TreeNode(6);
		root.right.right = new TreeNode(8);
		root.right.right.left = new TreeNode(7);
		root.right.right.right = new TreeNode(9);

		TreeNode c = increasingBST_1(root);
		while (c != null) {
			System.out.println(c.val);
			c = c.right;
		}
	}
	
	//approach 2
	//run time 0ms
	public static TreeNode increasingBST_1(TreeNode root) {
		TreeNode head = null, pre = null;
		Stack<TreeNode> stack = new Stack<>();
		TreeNode cur = root;
		while (cur != null || !stack.isEmpty()) {
			while (cur != null) {
				stack.push(cur);
				cur = cur.left;
			}
			cur = stack.pop();
			if (head == null) {
				head = cur;
			}
			cur.left = null;
			if (pre != null) {
				pre.right = cur;
			}
			pre = cur;
			cur = cur.right;
		}
		return head;
	}

	// approach 1
	//run time 1ms
	public static TreeNode increasingBST(TreeNode root) {
		List<TreeNode> nodes = new ArrayList<TreeNode>();

		List<TreeNode> cur_nodes = new ArrayList<TreeNode>();
		cur_nodes.add(root);
		nodes.add(root);

		while (!cur_nodes.isEmpty()) {
			if (cur_nodes.get(0).left != null) {
				cur_nodes.add(cur_nodes.get(0).left);
				nodes.add(cur_nodes.get(0).left);
			}
			if (cur_nodes.get(0).right != null) {
				cur_nodes.add(cur_nodes.get(0).right);
				nodes.add(cur_nodes.get(0).right);
			}
			cur_nodes.remove(0);
		}

		Collections.sort(nodes, new Comparator<TreeNode>() {
			@Override
			public int compare(TreeNode o1, TreeNode o2) {
				// TODO Auto-generated method stub
				return o1.val - o2.val;
			}
		});

		for (int i = 0; i + 1 < nodes.size(); i++) {
			nodes.get(i).left = null;
			nodes.get(i).right = nodes.get(i + 1);
		}
		nodes.get(nodes.size() - 1).right = null;
		nodes.get(nodes.size() - 1).left = null;

		return nodes.get(0);
	}

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
}
