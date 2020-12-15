package com.leet.leetcode_dec_2020;

import java.util.*;

public class Dec14_Palindrome_Partitioning {

    //1st solution
    //DFS & Memo
    //Run time : 15ms
//    int count = 0;
//    Map<String,List<List<String>>> Memo = new HashMap<>();
//    List<List<String>> result = new ArrayList<>();
//
//    public List<List<String>> partition(String s) {
//
//        List<String> first_half = new ArrayList<>();
//        dfs(first_half,s);
//
//        System.out.println(count);
//        return result;
//    }
//
//    public void dfs (List<String> first_half, String word){
//
//        if(word.length()>1){
//            String word_1st_half = word.substring(0,1);
//            String word_2nd_half = word.substring(1);
//
//            List<String> pass_first_half = new ArrayList<>(first_half);
//            pass_first_half.add(word_1st_half);
//
//            dfs(pass_first_half,word_2nd_half);
//
//        }else{
//            List<String> solution = new ArrayList<>(first_half);
//            solution.add(word);
//            result.add(solution);
//        }
//        addCombination(first_half, word);
//
//    }
//
//    //Memo
//    public void addCombination(List<String> first_half, String word){
//
//        List<List<String>> combinations = new ArrayList<>();
//
//        if(word.length()>1){
//
//            for(int len = 1; len < word.length(); len++){
//                String first_half_word = word.substring(0,len+1);
//                String second_half_word = word.substring(len+1);
//
//                if(isPalindrome(first_half_word)){
//                    List<String> combination = new ArrayList<>();
//                    combination.add(first_half_word);
//                    if(!second_half_word.isEmpty()){
//                        for(List<String> combination_of_second_half : Memo.get(second_half_word)){
//                            List<String> combination_of_both = new ArrayList<>();
//                            combination_of_both.addAll(combination);
//                            combination_of_both.addAll(combination_of_second_half);
//                            combinations.add(combination_of_both);
//                        }
//                    }else{
//                        combinations.add(combination);
//                    }
//                }
//            }
//
//            addResult(first_half, combinations);
//
//            String first_letter = word.substring(0,1);
//            for(List<String> combination_of_second_half : Memo.get(word.substring(1))){
//                List<String> combination_of_both = new ArrayList<>();
//                combination_of_both.add(first_letter);
//                combination_of_both.addAll(combination_of_second_half);
//                combinations.add(combination_of_both);
//            }
//
//        }else{
//
//            List<String> combination = new ArrayList<>();
//
//            combination.add(word);
//            combinations.add(combination);
//
//        }
//        Memo.put(word, combinations);
//
//    }
//
//    public void addResult(List<String> first_half, List<List<String>> combinations){
//        for(List<String> c : combinations){
//            count++;
//            List<String> ans = new ArrayList<>(first_half);
//            ans.addAll(c);
//            result.add(ans);
//        }
//    }
//

    //2nd solution
    //Runtime : 7ms
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        boolean[][] dp = new boolean[s.length()][s.length()];
        for(int i = 0; i < s.length(); i++) {
            for(int j = 0; j <= i; j++) {
                if(s.charAt(i) == s.charAt(j) && (i - j <= 2 || dp[j+1][i-1])) {
                    dp[j][i] = true;
                }
            }
        }
        helper(res, new ArrayList<>(), dp, s, 0);
        return res;
    }

    private void helper(List<List<String>> res, List<String> path, boolean[][] dp, String s, int pos) {
        if(pos == s.length()) {
            res.add(new ArrayList<>(path));
            return;
        }

        for(int i = pos; i < s.length(); i++) {
            if(dp[pos][i]) {
                path.add(s.substring(pos,i+1));
                helper(res, path, dp, s, i+1);
                path.remove(path.size()-1);
            }
        }
    }

    //helper class
    public boolean isPalindrome(String s){

        if(s.length() == 1){
            return true;
        }

        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
