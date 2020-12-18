package com.leet.leetcode_dec_2020;

public class Dec18_Increasing_Triplet_Subsequence {

    //https://leetcode.com/problems/increasing-triplet-subsequence/
    public boolean increasingTriplet(int[] nums) {

        if(nums.length < 2)return false;

        int min_i = Integer.MAX_VALUE;
        int min_j = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num < min_i) {
                min_i = num;
            } else if (num > min_i && num < min_j) {
                min_j = num;
            } else if (num > min_j) {
                return true;
            }
        }

        return false;
    }

}
