package com.leet.leetcode_dec_2020;

import java.util.ArrayList;
import java.util.List;

public class Dec06_Populating_Next_Right_Pointers_in_Each_Node_II {
	
	//https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public Node connect(Node root) {
        
    	List<Node> nodes = new ArrayList<Node>();
    	
    	nodes.add(root);
    	
    	while(!nodes.isEmpty()) {
    		List<Node> new_nodes = new ArrayList<Node>();
    		Node prev = null;
    		for(Node n : nodes) {
    			if(prev != null) {
    				prev.next = n;
    			}
    			if(n.left != null) {
        			new_nodes.add(n.left);
    			}
    			if(n.right != null) {
        			new_nodes.add(n.right);
    			}
    			
    		}
    		nodes = new_nodes;
    	}
    	
    	return root;
    }
    
	static class Node {
	    public int val;
	    public Node left;
	    public Node right;
	    public Node next;

	    public Node() {}
	    
	    public Node(int _val) {
	        val = _val;
	    }

	    public Node(int _val, Node _left, Node _right, Node _next) {
	        val = _val;
	        left = _left;
	        right = _right;
	        next = _next;
	    }
	};
}
