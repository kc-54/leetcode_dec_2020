package com.leet.leetcode_dec_2020;

import java.util.Arrays;

public class Dec21_Smallest_Range_II {

    public int smallestRangeII(int[] A, int K) {

        Arrays.sort(A);
        int res = A[A.length - 1] - A[0];
        int mx = A[A.length - 1];
        int mn;


        System.out.println(res);

        for(int i = 0; i+1 < A.length; i++){
            mx = Math.max(mx, A[i] + 2*K);
            mn = Math.min(A[0]+2*K, A[i+1]);
            res = Math.min(res, mx-mn);
            System.out.println(res);
        }


        return res;
    }

}
