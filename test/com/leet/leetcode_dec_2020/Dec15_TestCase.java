package com.leet.leetcode_dec_2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Dec15_TestCase {

    Dec15_Squares_of_a_Sorted_Array dec15_squares_of_a_sorted_array = new Dec15_Squares_of_a_Sorted_Array();

    @Test
    void leetcode_test_case_1(){

        //prepare
        int [] nums = {-4,-1,0,3,10};
        int [] expected = {0,1,9,16,100};

        //execute
        int [] result = dec15_squares_of_a_sorted_array.sortedSquares(nums);

        //check
        assertArrayEquals(expected, result);

    }

    @Test
    void leetcode_test_case_2(){

        //prepare
        int [] nums = {-7,-3,2,3,11};
        int [] expected = {4,9,9,49,121};

        //execute
        int [] result = dec15_squares_of_a_sorted_array.sortedSquares(nums);

        //check
        assertArrayEquals(expected, result);

    }

    @Test
    void leetcode_test_case_3(){

        //prepare
        int [] nums = {-10000,-9999,-7,-5,0,0,10000};
        int [] expected = {0,0,25,49,99980001,100000000,100000000};

        //execute
        int [] result = dec15_squares_of_a_sorted_array.sortedSquares(nums);

        //check
        assertArrayEquals(expected, result);

    }
}
