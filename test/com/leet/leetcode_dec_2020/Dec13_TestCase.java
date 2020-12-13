package com.leet.leetcode_dec_2020;

import org.junit.jupiter.api.Test;

import static com.leet.leetcode_dec_2020.Dec13_Burst_Balloons.maxCoins;
import static org.junit.jupiter.api.Assertions.*;

public class Dec13_TestCase {

    @Test
    void leetcode_test_case_1(){
        //prepare
        int [] nums = {3,1,5,8};

        //execute
        int coins = maxCoins(nums);

        //check
        assertEquals(167, coins);

    }
}
