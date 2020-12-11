package com.leet.leetcode_dec_2020;

import java.util.Arrays;

public class Dec11_Remove_Duplicates_from_Sorted_Array_II {

    public static int removeDuplicates(int[] nums) {

        int result_count = 0;

        //minimal outside range value
        int current_number = -10001;
        int current_count_number = 0;

        int pointer = 0;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] != current_number){
                current_number = nums[i];
                current_count_number = 1;
                result_count++;
                nums[pointer++] = current_number;
            }
            else{
                if(current_count_number < 2){
                    nums[pointer++] = current_number;
                    result_count++;
                    current_count_number++;
                }
            }


        }


        return result_count;
    }

}
