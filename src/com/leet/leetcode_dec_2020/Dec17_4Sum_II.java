package com.leet.leetcode_dec_2020;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Dec17_4Sum_II {

    //https://leetcode.com/problems/4sum-ii/
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {

        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);
        Arrays.sort(D);

        int totalCount = 0;
        Map<Integer,Integer> a_plus_b_map = new HashMap<>();

        for(int a : A){
            for(int b : B){
                int a_plus_b = a+b;
                int count = a_plus_b_map.getOrDefault(a_plus_b, 0) + 1;
                a_plus_b_map.put(a_plus_b,count);
            }
        }

        for(int c : C){
            for(int d : D){
                int c_plus_d = c+d;
                int complement = -c_plus_d;
                totalCount += a_plus_b_map.getOrDefault(complement, 0);
            }
        }

        return totalCount;
    }
}
