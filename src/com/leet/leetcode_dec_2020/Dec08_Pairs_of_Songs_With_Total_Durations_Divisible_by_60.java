package com.leet.leetcode_dec_2020;

public class Dec08_Pairs_of_Songs_With_Total_Durations_Divisible_by_60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public int numPairsDivisibleBy60(int[] time) {
        
    	int [] mods = new int [60];
    	int pair = 0;
    	
    	for(int i : time) {
    		mods[i%60]++;
    	}
    	for(int i = 0; i <= 30; i++ ) {
    		if(i%30 != 0) {
    			pair += mods[i] * mods[60-i];
    		}else {
    			pair += mods[i] * (mods[i] -1)/2;
    		}
    	}
    	
    	
    	return pair;
    }
	
}
