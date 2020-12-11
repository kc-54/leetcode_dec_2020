package com.leet.leetcode_dec_2020;

import org.junit.jupiter.api.Test;


import java.util.Arrays;

import static com.leet.leetcode_dec_2020.Dec11_Remove_Duplicates_from_Sorted_Array_II.removeDuplicates;
import static org.junit.jupiter.api.Assertions.*;

public class Dec11_TestCase {

    @Test
    void remove_Duplicate_Success(){

        //prepare
        int [] nums = {1,1,1,2,2,3};
        int [] expected = {1, 1, 2, 2, 3};

        //execute
        int result = removeDuplicates(nums);

        //check
        assertEquals(expected.length,result);
        assertArrayEquals(expected , Arrays.copyOf(nums,result) );

    }

    @Test
    void remove_Duplicate_No_Change(){

        //prepare
        int [] nums = {1,1,2,2,3};
        int [] expected = {1, 1, 2, 2, 3};

        //execute
        int result = removeDuplicates(nums);

        //check
        assertEquals(expected.length,result);
        assertArrayEquals(expected , Arrays.copyOf(nums,result) );

    }

    @Test
    void remove_Duplicate_Empty_Arr(){

        //prepare
        int [] nums = {};
        int [] expected = {};

        //execute
        int result = removeDuplicates(nums);

        //check
        assertEquals(expected.length,result);
        assertArrayEquals(expected , Arrays.copyOf(nums,result) );

    }


    @Test
    void sample_Test_Leetcode(){

        //prepare
        int [] nums = {0,0,1,1,1,1,2,3,3};
        int [] expected = {0,0,1,1,2,3,3};

        //execute
        int result = removeDuplicates(nums);

        //check
        assertEquals(expected.length,result);
        assertArrayEquals(expected , Arrays.copyOf(nums,result) );

    }
}
