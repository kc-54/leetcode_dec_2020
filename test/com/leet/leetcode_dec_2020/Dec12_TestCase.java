package com.leet.leetcode_dec_2020;

import org.junit.jupiter.api.Test;

import static com.leet.leetcode_dec_2020.Dec12_Smallest_Subtree_with_all_the_Deepest_Nodes.TreeNode;

import static com.leet.leetcode_dec_2020.Dec12_Smallest_Subtree_with_all_the_Deepest_Nodes.subtreeWithAllDeepest;
import static org.junit.jupiter.api.Assertions.*;

public class Dec12_TestCase {

    @Test
    void leetcode_test_case_1(){
        //prepare
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);


        //execute
        TreeNode result = subtreeWithAllDeepest(root);

        //check
        assertEquals(root.left.right, result);
    }


    @Test
    void leetcode_test_case_2(){
        //prepare
        TreeNode root = new TreeNode(1);

        //execute
        TreeNode result = subtreeWithAllDeepest(root);

        //check
        assertEquals(root, result);
    }

    @Test
    void leetcode_test_case_3(){
        //prepare
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(2);


        //execute
        TreeNode result = subtreeWithAllDeepest(root);

        //check
        assertEquals(root.left.right, result);
    }

}
