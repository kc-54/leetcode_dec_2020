package com.leet.leetcode_dec_2020;

public class Dec20_Decoded_String_at_Index {

    //https://leetcode.com/problems/decoded-string-at-index/
    public String decodeAtIndex(String S, int K) {

        long length = 0;
        int multiplier = 1;

        for(int i = 0; i < S.length(); i++){

            if(S.charAt(i) >= 'a' && S.charAt(i) <= 'z'){

                length ++;
                multiplier = 1;
                if(length == K){
                    return S.substring(i, i+1);
                }

            }else if(S.charAt(i) >= '2' && S.charAt(i) <= '9'){

                int repeatTime = S.charAt(i) - 48;

                if(length*repeatTime > K){
                    long position = (K-1)%(length);

                    return decodeAtIndex(S,(int)position+1);

                }else if(length*repeatTime == K){
                    long position = K/(repeatTime);
                    return decodeAtIndex(S,(int)position);
                }
                multiplier *= repeatTime;
                length *= repeatTime;


            }
        }

        return "";
    }

}
