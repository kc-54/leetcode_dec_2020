package com.leet.leetcode_dec_2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import com.leet.leetcode_dec_2020.Dec16_Validate_Binary_Search_Tree.TreeNode;

public class Dec16_TestCase {

    Dec16_Validate_Binary_Search_Tree dec16_validate_binary_search_tree = new Dec16_Validate_Binary_Search_Tree();

    @Test
    void leetcode_test_case_1(){
        //prepare
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        //execute
        boolean result = dec16_validate_binary_search_tree.isValidBST(root);

        //check
        assertTrue(result);
    }

    @Test
    void leetcode_test_case_2(){
        //prepare
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(6);

        //execute
        boolean result = dec16_validate_binary_search_tree.isValidBST(root);

        //check
        assertFalse(result);
    }

    @Test
    void custom_test_case_1(){
        //prepare
        TreeNode root = new TreeNode(100);
        root.left = new TreeNode(50);
        root.left.left = new TreeNode(25);
        root.left.right = new TreeNode(75);
        root.left.left.left = new TreeNode(1);
        root.left.left.right = new TreeNode(35);
        root.left.right.left = new TreeNode(60);
        root.left.right.right = new TreeNode(90);

        //execute
        boolean result = dec16_validate_binary_search_tree.isValidBST(root);

        //check
        assertTrue(result);
    }

    @Test
    void custom_test_case_2(){
        //prepare
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(75);

        //execute
        boolean result = dec16_validate_binary_search_tree.isValidBST(root);

        //check
        assertTrue(result);
    }
}
