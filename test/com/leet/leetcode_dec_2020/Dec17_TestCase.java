package com.leet.leetcode_dec_2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Dec17_TestCase {

    Dec17_4Sum_II dec17_4Sum_ii = new Dec17_4Sum_II();

    @Test
    void leetcode_test_case_1(){

        //prepare
        int[] A = {1,2};
        int[] B = {-2,-1};
        int[] C = {-1,2};
        int[] D = {0,2};
        int expected = 2;

        //execute
        int result = dec17_4Sum_ii.fourSumCount(A,B,C,D);

        //check
        assertEquals(expected, result);

    }

    @Test
    void custom_test_case_1(){

        //prepare
        int[] A = {1,3,4,5};
        int[] B = {-1,3,11,-4};
        int[] C = {-5,6,7,9};
        int[] D = {1,2,3,4};
        int expected = 5;

        //execute
        int result = dec17_4Sum_ii.fourSumCount(A,B,C,D);

        //check
        assertEquals(expected, result);

    }
}
