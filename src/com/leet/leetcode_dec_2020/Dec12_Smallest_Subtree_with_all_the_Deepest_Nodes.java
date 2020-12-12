package com.leet.leetcode_dec_2020;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Dec12_Smallest_Subtree_with_all_the_Deepest_Nodes {
    //https://leetcode.com/problems/smallest-subtree-with-all-the-deepest-nodes/

    /**
     * approach 1 : DFS & Recursive
     * Runtime : 0 ms
     **/
    public static TreeNode subtreeWithAllDeepest(TreeNode root) {
        if (root == null) {
            return null;
        }

        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);

        if (leftDepth == rightDepth) {
            return root;
        } else if (leftDepth < rightDepth) {
            return subtreeWithAllDeepest(root.right);
        }
        return subtreeWithAllDeepest(root.left);
    }

    private static int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(depth(root.left), depth(root.right));
    }



    /**
     * approach 2 : BFS
     * Runtime : 1ms
     * Idea : find leaf nodes and find common parent

    public static TreeNode subtreeWithAllDeepest(TreeNode root) {

        Map<TreeNode,TreeNode> child_Parent_Map = new HashMap<TreeNode, TreeNode>();

        //find leaf node
        Set<TreeNode> leaf = BFS_and_Update_Map(root, child_Parent_Map);

        //find common parent
        while(leaf.size() != 1){
            Set<TreeNode> parent_Nodes = new HashSet<>();
            for(TreeNode node : leaf){
                parent_Nodes.add(child_Parent_Map.get(node));
            }
            leaf = parent_Nodes;
        }

        return leaf.iterator().next();
    }

    public static Set<TreeNode> BFS_and_Update_Map(TreeNode root, Map<TreeNode,TreeNode> child_Parent_Map){

        Set<TreeNode> current_TreeNode = new HashSet<>();
        Set<TreeNode> next_TreeNode = new HashSet<>();

        current_TreeNode.add(root);
        if(root.left != null)
        {
            next_TreeNode.add(root.left);
            child_Parent_Map.put(root.left,root);
        }
        if(root.right != null)
        {
            next_TreeNode.add(root.right);
            child_Parent_Map.put(root.right,root);
        }

        while(!next_TreeNode.isEmpty()){

            current_TreeNode = next_TreeNode;
            next_TreeNode = new HashSet<>();

            for(TreeNode node : current_TreeNode){
                if(node.left != null)
                {
                    next_TreeNode.add(node.left);
                    child_Parent_Map.put(node.left,node);
                }
                if(node.right != null)
                {
                    next_TreeNode.add(node.right);
                    child_Parent_Map.put(node.right,node);
                }
            }
        }

        return current_TreeNode;
    }
    **/

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
