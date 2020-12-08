package com.leet.leetcode_dec_2020;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Dec08_TestCase {
	
	Dec08_Pairs_of_Songs_With_Total_Durations_Divisible_by_60 tested ;
	
	@Test
	void test_success() {
		//prepare
		int[] time = {30,20,150,100,40};
		tested = new Dec08_Pairs_of_Songs_With_Total_Durations_Divisible_by_60();
		//execute
		
		int rs = tested.numPairsDivisibleBy60(time);
		
		//check
		
		assertEquals(3,rs);
	}

	@Test
	void test_no_found() {
		//prepare
		int[] time = {30,20,20};
		tested = new Dec08_Pairs_of_Songs_With_Total_Durations_Divisible_by_60();
		//execute
		
		int rs = tested.numPairsDivisibleBy60(time);
		
		//check
		
		assertEquals(0,rs);
	}

	@Test
	void test_all_same() {
		//prepare
		int[] time = {60,60,60};
		tested = new Dec08_Pairs_of_Songs_With_Total_Durations_Divisible_by_60();
		//execute
		
		int rs = tested.numPairsDivisibleBy60(time);
		
		//check
		
		assertEquals(3,rs);
	}

}
