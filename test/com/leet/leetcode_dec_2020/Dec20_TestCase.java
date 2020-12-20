package com.leet.leetcode_dec_2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Dec20_TestCase {

    Dec20_Decoded_String_at_Index dec20_decoded_string_at_index = new Dec20_Decoded_String_at_Index();

    @Test
    void leetcode_test_case_1(){

        //prepare
        String S = "leet2code3";
        int K = 10;
        String expected = "o";

        //execute
        String result = dec20_decoded_string_at_index.decodeAtIndex(S,K);

        //check
        assertEquals(expected, result);

    }

    @Test
    void leetcode_test_case_2(){

        //prepare
        String S = "ha22";
        int K = 5;
        String expected = "h";

        //execute
        String result = dec20_decoded_string_at_index.decodeAtIndex(S,K);

        //check
        assertEquals(expected, result);

    }

    @Test
    void leetcode_test_case_3(){

        //prepare
        String S = "a2345678999999999999999";
        int K = 1;
        String expected = "a";

        //execute
        String result = dec20_decoded_string_at_index.decodeAtIndex(S,K);

        //check
        assertEquals(expected, result);

    }

    @Test
    void leetcode_test_case_4(){

        //prepare
        String S = "y959q969u3hb22odq595";
        int K = 222280369;
        String expected = "y";

        //execute
        String result = dec20_decoded_string_at_index.decodeAtIndex(S,K);

        //check
        assertEquals(expected, result);

    }
    @Test
    void leetcode_test_case_5(){

        //prepare
        String S = "a2b3c4d5e6f7g8h9";
        int K = 9;
        String expected = "b";

        //execute
        String result = dec20_decoded_string_at_index.decodeAtIndex(S,K);

        //check
        assertEquals(expected, result);

    }

    @Test
    void leetcode_test_case_6(){

        //prepare
        String S = "a2b3c4d5e6f7g8h9";
        int K = 40;
        String expected = "c";

        //execute
        String result = dec20_decoded_string_at_index.decodeAtIndex(S,K);

        //check
        assertEquals(expected, result);

    }

    @Test
    void leetcode_test_case_7(){

        //prepare
        String S = "vk6u5xhq9v";
        int K = 554;
        String expected = "k";

        //execute
        String result = dec20_decoded_string_at_index.decodeAtIndex(S,K);

        //check
        assertEquals(expected, result);

    }
}
