package com.leet.leetcode_dec_2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Dec26_TestCase {

    Dec26_Decode_Ways dec26_decode_ways = new Dec26_Decode_Ways();

    @Test
    void leetcode_test_case_1(){

        //prepare
        String s = "12";
        int expected = 2;

        //execute
        int result = dec26_decode_ways.numDecodings(s);

        //check
        assertEquals(expected,result);
    }

    @Test
    void leetcode_test_case_2(){

        //prepare
        String s = "226";
        int expected = 3;

        //execute
        int result = dec26_decode_ways.numDecodings(s);

        //check
        assertEquals(expected,result);
    }

    @Test
    void leetcode_test_case_3(){

        //prepare
        String s = "0";
        int expected = 0;

        //execute
        int result = dec26_decode_ways.numDecodings(s);

        //check
        assertEquals(expected,result);
    }

    @Test
    void leetcode_test_case_4(){

        //prepare
        String s = "1";
        int expected = 1;

        //execute
        int result = dec26_decode_ways.numDecodings(s);

        //check
        assertEquals(expected,result);
    }

    @Test
    void leetcode_test_case_5(){

        //prepare
        String s = "2101";
        int expected = 1;

        //execute
        int result = dec26_decode_ways.numDecodings(s);

        //check
        assertEquals(expected,result);
    }

    @Test
    void custom_test_case_1(){

        //prepare
        String s = "01";
        int expected = 0;

        //execute
        int result = dec26_decode_ways.numDecodings(s);

        //check
        assertEquals(expected,result);
    }

    @Test
    void custom_test_case_2(){

        //prepare
        String s = "00";
        int expected = 0;

        //execute
        int result = dec26_decode_ways.numDecodings(s);

        //check
        assertEquals(expected,result);
    }

    @Test
    void custom_test_case_3(){

        //prepare
        String s = "0000000000000000";
        int expected = 0;

        //execute
        int result = dec26_decode_ways.numDecodings(s);

        //check
        assertEquals(expected,result);
    }
}
