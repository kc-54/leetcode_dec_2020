package com.leet.leetcode_dec_2020;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.leet.leetcode_dec_2020.Dec09_Binary_Search_Tree_Iterator.BSTIterator;
import com.leet.leetcode_dec_2020.Dec09_Binary_Search_Tree_Iterator.TreeNode;

class Dec09_TestCase {

	static TreeNode root = new TreeNode(7);
	
	static {{
		root.left = new TreeNode(3);
		root.right = new TreeNode(15);
		root.right.left = new TreeNode(9);
		root.right.right = new TreeNode(20);
	}}

	@Test
	void test_next_value_check() {
		//prepare
		BSTIterator bst = new BSTIterator(root);
		
		//execute
		
		//check
		assertEquals(3, bst.next());
	}

	@Test
	void test_hasNext_value_check() {
		//prepare
		BSTIterator bst = new BSTIterator(root);
		
		//execute
		
		
		//check
		assertTrue(bst.hasNext());
	}
	
	@Test
	void test_series_command_check() {
		//prepare
		BSTIterator bst = new BSTIterator(root);
		
		//execute
		
		
		//check
		assertEquals(3, bst.next());
		assertEquals(7, bst.next());
		assertTrue(bst.hasNext());
		assertEquals(9, bst.next());
		assertTrue(bst.hasNext());
		assertEquals(15, bst.next());
		assertEquals(20, bst.next());
		assertFalse(bst.hasNext());
	}

	@Test
	void test_single_node_check() {
		//prepare
		TreeNode root = new TreeNode(7);
		BSTIterator bst = new BSTIterator(root);
		
		//execute
		
		
		//check
		assertTrue(bst.hasNext());
		assertEquals(7, bst.next());
		assertFalse(bst.hasNext());
	}
	
	
}
