package com.leet.leetcode_dec_2020;

import java.util.Stack;

public class Dec16_Validate_Binary_Search_Tree {

    //https://leetcode.com/problems/validate-binary-search-tree/

    //In order traversal check, dfs
    //Runtime : 1ms
    public boolean isValidBST(TreeNode root) {

        Stack<TreeNode> stacks = new Stack<>();
        Integer previous = null;

        TreeNode node = root.left;
        stacks.add(root);

        while(!stacks.isEmpty()) {

            while(node != null){
                stacks.add(node);
                node = node.left;
            }

            node = stacks.pop();

            while(node != null){

                if (previous != null && node.val <= previous) {
                    return false;
                }
                previous = node.val;

                if(node.right != null){
                    stacks.add(node.right);
                    node = node.right.left;
                    break;
                }else if(!stacks.isEmpty()){
                    node = stacks.pop();
                }else{
                    node = null;
                }

            }
        }

        return true;
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
