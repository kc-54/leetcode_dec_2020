package com.leet.leetcode_dec_2020;

import java.util.Stack;

public class Dec09_Binary_Search_Tree_Iterator {
	
	//https://leetcode.com/problems/binary-search-tree-iterator/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static class BSTIterator {
		
		@SuppressWarnings("unused")
		private TreeNode root;
		private Stack<TreeNode> stackIterator = new Stack<TreeNode>();
		
		public BSTIterator(TreeNode root) {
			
			this.root = root;
			this.stackIterator.add(root);
			
			addLeft_dfs(root);
		}

		public int next() {

			TreeNode current = this.stackIterator.pop();
			
			if(current.right != null) {
				this.stackIterator.add(current.right);
				addLeft_dfs(current.right);
			}
			
			return  current.val;
		}

		public boolean hasNext() {
			return !this.stackIterator.empty();
			
		}
		
		private void addLeft_dfs(TreeNode node) {
			
			TreeNode currentNode = node.left;
			
			while(currentNode != null) {
				stackIterator.add(currentNode);
				currentNode = currentNode.left;
			}
			
		}
		
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
