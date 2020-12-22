package com.leet.leetcode_dec_2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Dec21_TestCase {

    Dec21_Smallest_Range_II dec21_smallest_range_ii = new Dec21_Smallest_Range_II();

    @Test
    void leetcode_test_case_1(){

        //prepare
        int [] A = {1};
        int K = 0;
        int expected = 0;

        //execute
        int result = dec21_smallest_range_ii.smallestRangeII(A,K);

        //check
        assertEquals(expected, result);

    }

    @Test
    void leetcode_test_case_2(){

        //prepare
        int [] A = {0,10};
        int K = 2;
        int expected = 6;

        //execute
        int result = dec21_smallest_range_ii.smallestRangeII(A,K);

        //check
        assertEquals(expected, result);

    }

    @Test
    void leetcode_test_case_3(){

        //prepare
        int [] A = {1,3,6};
        int K = 3;
        int expected = 3;

        //execute
        int result = dec21_smallest_range_ii.smallestRangeII(A,K);

        //check
        assertEquals(expected, result);

    }

    @Test
    void leetcode_test_case_4(){

        //prepare
        int [] A = {2,7,2};
        int K = 1;
        int expected = 3;

        //execute
        int result = dec21_smallest_range_ii.smallestRangeII(A,K);

        //check
        assertEquals(expected, result);

    }

    @Test
    void custom_test_case_1(){

        //prepare
        int [] A = {1,3,11};
        int K = 5;
        int expected = 2;

        //execute
        int result = dec21_smallest_range_ii.smallestRangeII(A,K);

        //check
        assertEquals(expected, result);

    }
}
