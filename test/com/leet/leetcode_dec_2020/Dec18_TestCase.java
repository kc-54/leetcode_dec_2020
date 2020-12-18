package com.leet.leetcode_dec_2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Dec18_TestCase {

    Dec18_Increasing_Triplet_Subsequence dec18_increasing_triplet_subsequence = new Dec18_Increasing_Triplet_Subsequence();

    @Test
    void leetcode_test_case_1(){

        //prepare
        int [] nums = {1,2,3,4,5};

        //execute
        boolean result = dec18_increasing_triplet_subsequence.increasingTriplet(nums);

        //check
        assertTrue(result);

    }

    @Test
    void leetcode_test_case_2(){

        //prepare
        int [] nums = {5,4,3,2,1};

        //execute
        boolean result = dec18_increasing_triplet_subsequence.increasingTriplet(nums);

        //check
        assertFalse(result);

    }

    @Test
    void leetcode_test_case_3(){

        //prepare
        int [] nums = {2,1,5,0,4,6};

        //execute
        boolean result = dec18_increasing_triplet_subsequence.increasingTriplet(nums);

        //check
        assertTrue(result);

    }

    @Test
    void leetcode_test_case_4(){

        //prepare
        int [] nums = {2,1,5,0,3};

        //execute
        boolean result = dec18_increasing_triplet_subsequence.increasingTriplet(nums);

        //check
        assertFalse(result);

    }

    @Test
    void custom_test_case_1(){

        //prepare
        int [] nums = {1};

        //execute
        boolean result = dec18_increasing_triplet_subsequence.increasingTriplet(nums);

        //check
        assertFalse(result);

    }

    @Test
    void custom_test_case_2(){

        //prepare
        int [] nums = {Integer.MAX_VALUE - 2, Integer.MAX_VALUE -1, Integer.MAX_VALUE};

        //execute
        boolean result = dec18_increasing_triplet_subsequence.increasingTriplet(nums);

        //check
        assertTrue(result);

    }

    @Test
    void custom_test_case_3(){

        //prepare
        int [] nums = {Integer.MIN_VALUE , Integer.MIN_VALUE +1, Integer.MIN_VALUE +2};

        //execute
        boolean result = dec18_increasing_triplet_subsequence.increasingTriplet(nums);

        //check
        assertTrue(result);

    }

    @Test
    void custom_test_case_4(){

        //prepare
        int [] nums = {Integer.MIN_VALUE , 0, Integer.MAX_VALUE};

        //execute
        boolean result = dec18_increasing_triplet_subsequence.increasingTriplet(nums);

        //check
        assertTrue(result);

    }
}
