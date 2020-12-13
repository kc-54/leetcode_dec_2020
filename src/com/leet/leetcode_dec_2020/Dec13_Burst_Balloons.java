package com.leet.leetcode_dec_2020;

public class Dec13_Burst_Balloons {
    //https://leetcode.com/problems/burst-balloons/
    public static int maxCoins(int[] nums) {


        int [] nums_wo_zero = new int[nums.length + 2]; // add 2 "1" for the first and last element

        int pointer = 1;

        for(int num : nums){
            //only add in non zero element
            if(num != 0){
                nums_wo_zero[pointer++] = num;
            }
        }

        nums_wo_zero[0] = 1;
        nums_wo_zero[pointer++] = 1;

        int[][] memo = new int[pointer][pointer];

        return burst(memo, nums_wo_zero, 0, pointer-1);
    }

    public static int burst(int[][] memo, int[] nums, int left, int right){

        if(left+1 == right){
            return 0;
        }
        if(memo[left][right]>0){
            return memo[left][right];
        }

        int answer = 0;
        for(int pointer = left + 1; pointer < right; pointer++){
            answer = Math.max(answer,
                    burst(memo,nums,left,pointer) +
                    burst(memo,nums,pointer,right) +
                    nums[pointer]*nums[left]*nums[right]);
        }
        memo[left][right] = answer;

        return answer;
    }
}
