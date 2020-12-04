package com.leet.leetcode_dec_2020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dec04_The_kth_Factor_of_n {
	//https://leetcode.com/problems/the-kth-factor-of-n/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000;
		int k = 4;
		System.out.println(kthFactor_1(n, k));
	}

	//find factor until number of k times only
    public static int kthFactor_1(int n, int k) {

    	if(n <= 1) {
    		return n;
    	}
    	int count = 0;
    	for(int i = 1; i <= n; i++) {
    		if(n%i == 0)count++;
    		if(count == k)return i;
    	}
    	return -1;
    }
    //approach 1 find all possible factor and compare with k
    public static int kthFactor(int n, int k) {
        
    	List<Integer> rs = new ArrayList<Integer>();
    	
    	int left = 1;
    	int right = n;
    	
    	while(left <= right) {
    		
    		if(n%left == 0) {
        		
    			right = n/left;
    			
    			if(!rs.contains(left)) {
        			rs.add(left);
        		}
        		if(!rs.contains(right)) {
        			rs.add(right);
        		}
    		}
    		left++;
    	}
    	
    	if(k <= rs.size()) {
    		Collections.sort(rs);
    		return rs.get(k-1);
    	}
    	
    	return -1;
    }
}
