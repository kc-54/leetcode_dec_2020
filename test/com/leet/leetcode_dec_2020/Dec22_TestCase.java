package com.leet.leetcode_dec_2020;

import org.junit.jupiter.api.Test;

import com.leet.leetcode_dec_2020.Dec22_Balanced_Binary_Tree.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Dec22_TestCase {

    Dec22_Balanced_Binary_Tree dec22_balanced_binary_tree = new Dec22_Balanced_Binary_Tree();

    @Test
    void leetcode_test_case_1(){

        //prepare
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        boolean expected = true;

        //execute
        boolean result = dec22_balanced_binary_tree.isBalanced(root);

        //check
        assertEquals(expected, result);

    }

    @Test
    void leetcode_test_case_2(){

        //prepare
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(4);

        boolean expected = false;

        //execute
        boolean result = dec22_balanced_binary_tree.isBalanced(root);

        //check
        assertEquals(expected, result);

    }

    @Test
    void leetcode_test_case_3(){

        //prepare
        TreeNode root = null;

        boolean expected = true;

        //execute
        boolean result = dec22_balanced_binary_tree.isBalanced(root);

        //check
        assertEquals(expected, result);

    }

    @Test
    void leetcode_test_case_4(){

        //prepare
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.left.left.left = new TreeNode(8);

        boolean expected = true;

        //execute
        boolean result = dec22_balanced_binary_tree.isBalanced(root);

        //check
        assertEquals(expected, result);

    }

    @Test
    void leetcode_test_case_5(){

        //prepare
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);

        boolean expected = false;

        //execute
        boolean result = dec22_balanced_binary_tree.isBalanced(root);

        //check
        assertEquals(expected, result);

    }
}
