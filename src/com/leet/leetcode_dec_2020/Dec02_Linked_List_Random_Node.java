package com.leet.leetcode_dec_2020;

import java.util.ArrayList;
import java.util.List;

public class Dec02_Linked_List_Random_Node {
	//https://leetcode.com/problems/linked-list-random-node/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static class Solution {
		
		private List<Integer> range = new ArrayList<Integer>();

		public Solution(ListNode head) {
			while(head!=null) {
				this.range.add(head.val);
				head = head.next;
			}
	    }

		/** Returns a random node's value. */
		public int getRandom() {

	        int pick = (int)(Math.random() * this.range.size());
	        return this.range.get(pick);
		}
	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
}
