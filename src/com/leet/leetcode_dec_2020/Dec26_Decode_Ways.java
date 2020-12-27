package com.leet.leetcode_dec_2020;

public class Dec26_Decode_Ways {

    //https://leetcode.com/problems/decode-ways/
    public int numDecodings(String s) {

        if(s==null || s.length()==0){
            return 0;
        }

        int[] memo = new int[3];

        memo[0] = 1;
        if(s.charAt(0) != '0'){
            memo[1] = 1;
        }

        for(int i = 1; i < s.length(); i++){

            int rs = 0;
            int one_digits = Integer.parseInt(s.substring(i, i + 1));
            int two_digits = Integer.parseInt(s.substring(i - 1, i + 1));

            if(one_digits != 0){
                rs += memo[1];
            }


            if(two_digits > 0 && 27 > two_digits && s.charAt(i - 1) != '0'){
                rs += memo[0];
            }

            memo[0] = memo[1];
            memo[1] = rs;
        }


        return memo[1];

    }
}
