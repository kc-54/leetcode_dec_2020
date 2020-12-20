package com.leet.leetcode_dec_2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Dec19_TestCase {

    Dec19_Cherry_Pickup_II dec19_cherry_pickup_ii = new Dec19_Cherry_Pickup_II();

    @Test
    void leetcode_test_case_1(){

        //prepare
        int [][] grid = {{3,1,1},{2,5,1},{1,5,5},{2,1,1}};
        int expected = 24;

        //execute
        int result = dec19_cherry_pickup_ii.cherryPickup(grid);

        //check
        assertEquals(expected, result);

    }

    @Test
    void leetcode_test_case_2(){

        //prepare
        int [][] grid = {
                {1,0,0,0,0,0,1},
                {2,0,0,0,0,3,0},
                {2,0,9,0,0,0,0},
                {0,3,0,5,4,0,0},
                {1,0,2,3,0,0,6}};
        int expected = 28;

        //execute
        int result = dec19_cherry_pickup_ii.cherryPickup(grid);

        //check
        assertEquals(expected, result);

    }

    @Test
    void leetcode_test_case_3(){

        //prepare
        int [][] grid = {
                {1,0,0,3},
                {0,0,0,3},
                {0,0,3,3},
                {9,0,3,3}};
        int expected = 22;

        //execute
        int result = dec19_cherry_pickup_ii.cherryPickup(grid);

        //check
        assertEquals(expected, result);

    }

    @Test
    void leetcode_test_case_4(){

        //prepare
        int [][] grid = {
                {1,1},
                {1,1}};
        int expected = 4;

        //execute
        int result = dec19_cherry_pickup_ii.cherryPickup(grid);

        //check
        assertEquals(expected, result);

    }

}
