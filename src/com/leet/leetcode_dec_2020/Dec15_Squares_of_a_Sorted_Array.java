package com.leet.leetcode_dec_2020;

import java.util.Arrays;

public class Dec15_Squares_of_a_Sorted_Array {

    //finding both positive & negative index and square 1 by 1
    //Runtime 1ms
    public int[] sortedSquares(int[] nums) {

        int[] result = new int[nums.length];
        int firstNegativeIndex = -1;
        int firstPositiveIndex = nums.length;
        int pointer = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                firstNegativeIndex = i;
            } else {
                firstPositiveIndex = Math.min(i, firstPositiveIndex);
            }
        }
        while (firstNegativeIndex >= 0 || firstPositiveIndex < nums.length) {

            if (firstNegativeIndex >= 0 && firstPositiveIndex < nums.length) {
                int negativeSquare = nums[firstNegativeIndex] * nums[firstNegativeIndex];
                int positiveSquare = nums[firstPositiveIndex] * nums[firstPositiveIndex];
                if (negativeSquare < positiveSquare) {
                    result[pointer++] = negativeSquare;
                    firstNegativeIndex--;
                } else {
                    result[pointer++] = positiveSquare;
                    firstPositiveIndex++;
                }
            } else if (firstNegativeIndex >= 0) {
                int negativeSquare = nums[firstNegativeIndex] * nums[firstNegativeIndex];
                result[pointer++] = negativeSquare;
                firstNegativeIndex--;
            } else {
                int positiveSquare = nums[firstPositiveIndex] * nums[firstPositiveIndex];
                result[pointer++] = positiveSquare;
                firstPositiveIndex++;
            }
        }
        return result;
    }

    //
    //1 line solution using map
    //Runtime : 9ms

    //public int[] sortedSquares(int[] nums) {

    //   return Arrays.stream(nums).map(i -> i*i).sorted().toArray();
    //}
    //

}
