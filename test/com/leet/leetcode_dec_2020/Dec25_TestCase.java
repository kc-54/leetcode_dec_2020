package com.leet.leetcode_dec_2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Dec25_TestCase {

    Dec25_Diagonal_Traverse dec25_diagonal_traverse = new Dec25_Diagonal_Traverse();

    @Test
    void leetcode_test_case_1(){

        //prepare
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[] expected = {1,2,4,7,5,3,6,8,9};

        //execute
        int[] result = dec25_diagonal_traverse.findDiagonalOrder(matrix);

        //check
        assertArrayEquals(expected,result);
    }


    @Test
    void custom_test_case_1(){

        //prepare
        int[][] matrix = {{1}};
        int[] expected = {1};

        //execute
        int[] result = dec25_diagonal_traverse.findDiagonalOrder(matrix);

        //check
        assertArrayEquals(expected,result);
    }

    @Test
    void custom_test_case_2(){

        //prepare
        int[][] matrix = {{1,3,4,6,7,8,9}};
        int[] expected = {1,3,4,6,7,8,9};

        //execute
        int[] result = dec25_diagonal_traverse.findDiagonalOrder(matrix);

        //check
        assertArrayEquals(expected,result);
    }

    @Test
    void custom_test_case_3(){

        //prepare
        int[][] matrix = {{1},{3},{4},{6},{7},{8},{9}};
        int[] expected = {1,3,4,6,7,8,9};

        //execute
        int[] result = dec25_diagonal_traverse.findDiagonalOrder(matrix);

        //check
        assertArrayEquals(expected,result);
    }

    @Test
    void custom_test_case_4(){

        //prepare
        int[][] matrix = {{1,2},{3,4}};
        int[] expected = {1,2,3,4};

        //execute
        int[] result = dec25_diagonal_traverse.findDiagonalOrder(matrix);

        //check
        assertArrayEquals(expected,result);
    }

}
