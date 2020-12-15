package com.leet.leetcode_dec_2020;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Dec14_TestCase {

    Dec14_Palindrome_Partitioning palindrome_partitioning = new Dec14_Palindrome_Partitioning();

    @Test
    void test_Palindrome_success_1(){
        //prepare
        String word = "abba";

        //execute
        boolean result = palindrome_partitioning.isPalindrome(word);

        //check
        assertTrue(result);

    }

    @Test
    void test_Palindrome_success_2(){
        //prepare
        String word = "aba";

        //execute
        boolean result = palindrome_partitioning.isPalindrome(word);

        //check
        assertTrue(result);

    }

    @Test
    void test_Palindrome_success_3(){
        //prepare
        String word = "a";

        //execute
        boolean result = palindrome_partitioning.isPalindrome(word);

        //check
        assertTrue(result);

    }

    @Test
    void test_Palindrome_fail(){
        //prepare
        String word = "ab";

        //execute
        boolean result = palindrome_partitioning.isPalindrome(word);

        //check
        assertFalse(result);

    }

    @Test
    void leetcode_test_case_1(){
        //prepare
        String word = "aab";
        List<List<String>>  expected = new ArrayList<>();

        String[][] expected_array = {{"a","a","b"}, {"aa","b"}};
        for(String[] expect : expected_array){
            expected.add(Arrays.asList(expect));
        }

        //execute
        List<List<String>>  result = palindrome_partitioning.partition(word);


        //check
        for(List<String> expect : expected){
            assertTrue(result.contains(expect));
        }
        assertEquals(expected.size(), result.size());

    }

    @Test
    void leetcode_test_case_2(){
        //prepare
        String word = "a";
        List<List<String>>  expected = new ArrayList<>();

        String[][] expected_array = {{"a"}};
        for(String[] expect : expected_array){
            expected.add(Arrays.asList(expect));
        }

        //execute
        List<List<String>>  result = palindrome_partitioning.partition(word);

        //check
        for(List<String> expect : expected){
            assertTrue(result.contains(expect));
        }
        assertEquals(expected.size(), result.size());

    }

    @Test
    void test_case_1(){
        //prepare
        String word = "abbaabba";
        List<List<String>>  expected = new ArrayList<>();
        String[][] expected_array = {
            {"a","b","b","a","a","b","b","a"},
            {"a","b","b","a","a","bb","a"},
            {"a","b","b","a","abba"},
            {"a","b","b","aa","b","b","a"},
            {"a","b","b","aa","bb","a"},
            {"a","b","baab","b","a"},
            {"a","bb","a","a","b","b","a"},
            {"a","bb","a","a","bb","a"},
            {"a","bb","a","abba"},
            {"a","bb","aa","b","b","a"},
            {"a","bb","aa","bb","a"},
            {"a","bbaabb","a"},
            {"abba","a","b","b","a"},
            {"abba","a","bb","a"},
            {"abba","abba"},
            {"abbaabba"}
        };

        for(String[] expect : expected_array){
            expected.add(Arrays.asList(expect));
        }

        //execute
        List<List<String>>  result = palindrome_partitioning.partition(word);

        //check
        for(List<String> expect : expected){
            assertTrue(result.contains(expect));
        }
        assertEquals(expected.size(), result.size());


    }

    @Test
    void test_case_2(){
        //prepare
        String word = "abbaabba";
        List<List<String>>  expected = new ArrayList<>();
        String[][] expected_array = {
                {"a","b","b","a","a","b","b","a"},
                {"a","b","b","a","a","bb","a"},
                {"a","b","b","a","abba"},
                {"a","b","b","aa","b","b","a"},
                {"a","b","b","aa","bb","a"},
                {"a","b","baab","b","a"},
                {"a","bb","a","a","b","b","a"},
                {"a","bb","a","a","bb","a"},
                {"a","bb","a","abba"},
                {"a","bb","aa","b","b","a"},
                {"a","bb","aa","bb","a"},
                {"a","bbaabb","a"},
                {"abba","a","b","b","a"},
                {"abba","a","bb","a"},
                {"abba","abba"},
                {"abbaabba"}
        };

        for(String[] expect : expected_array){
            expected.add(Arrays.asList(expect));
        }

        //execute
        List<List<String>>  result = palindrome_partitioning.partition(word);


        //check
        for(List<String> expect : expected){
            assertTrue(result.contains(expect));
        }
        assertEquals(expected.size(), result.size());


    }
}
