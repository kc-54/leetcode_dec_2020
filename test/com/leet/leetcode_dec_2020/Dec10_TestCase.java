package com.leet.leetcode_dec_2020;

import org.junit.jupiter.api.Test;

import static com.leet.leetcode_dec_2020.Dec10_Valid_Mountain_Array.validMountainArray;
import static org.junit.jupiter.api.Assertions.*;

public class Dec10_TestCase {

    @Test
    void test_invalid_length_arr(){

        //prepare
        int[] arr = {};
        
        //execute

        boolean result = validMountainArray(arr);
        
        //check
        assertFalse(result);

    }

    @Test
    void test_not_enough_length_arr(){

        //prepare
        int[] arr = {0,2};

        //execute

        boolean result = validMountainArray(arr);

        //check
        assertFalse(result);

    }

    @Test
    void test_min_length_arr_true(){

        //prepare
        int[] arr = {0,2,0};

        //execute

        boolean result = validMountainArray(arr);

        //check
        assertTrue(result);

    }

    @Test
    void test_min_length_arr_false(){

        //prepare
        int[] arr = {0,2,3};

        //execute

        boolean result = validMountainArray(arr);

        //check
        assertFalse(result);

    }

    @Test
    void test_normal_length_arr_true(){

        //prepare
        int[] arr = {0,2,3,8,3,1};

        //execute

        boolean result = validMountainArray(arr);

        //check
        assertTrue(result);

    }

    @Test
    void test_normal_length_arr_false(){

        //prepare
        int[] arr = {0,2,3,8,3,4};

        //execute

        boolean result = validMountainArray(arr);

        //check
        assertFalse(result);

    }
}
