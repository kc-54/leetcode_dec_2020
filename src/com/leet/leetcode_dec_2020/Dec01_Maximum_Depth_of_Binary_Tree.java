package com.leet.leetcode_dec_2020;

import java.util.ArrayList;
import java.util.List;

public class Dec01_Maximum_Depth_of_Binary_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		
		System.out.println(maxDepth(root));
		
	}
	//approach recursive	
	//run time 0ms
    public static int maxDepth_1(TreeNode root) {

    	if(root==null) {
    		return 0;
    	}else{
            return 1+ Math.max(maxDepth(root.left), maxDepth(root.right));
        }
    }
	
	
	//approach looping
	//run time 1ms
    public static int maxDepth(TreeNode root) {
        
    	if(root==null) {
    		return 0;
    	}
    	List<TreeNode> nodes = new ArrayList<TreeNode>();
    	nodes.add(root);
    	int depth = 0;
    	while(!nodes.isEmpty()) {
    		depth++;
    		int count = nodes.size();
    		for(int i = 0; i < count; i++) {
    			TreeNode node = nodes.get(0);
    			if(node.left != null) {
    				nodes.add(node.left);
    			}
    			if(node.right != null) {
    				nodes.add(node.right);
    			}
    			nodes.remove(node);
    		}
    	}
    	
    	
    	return depth;
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
