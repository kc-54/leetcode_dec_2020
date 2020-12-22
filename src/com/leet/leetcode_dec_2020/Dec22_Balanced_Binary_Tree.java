package com.leet.leetcode_dec_2020;

import sun.reflect.generics.tree.Tree;

import java.util.Stack;

public class Dec22_Balanced_Binary_Tree {

    //https://leetcode.com/problems/balanced-binary-tree/
    public boolean isBalanced(TreeNode root) {

        int tree_depth = depth(root);

        return tree_depth != -1;
    }

    public int depth(TreeNode node){

        if(node==null){
            return 0;
        }

        int left = depth(node.left);
        int right = depth(node.right);

        if(Math.abs(left-right)>1 || left == -1 || right == -1 ){
            return -1;
        }

        return Math.max(left,right)+1;
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
