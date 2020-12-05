package com.leet.leetcode_dec_2020;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Dec05_TestCase {

	@Test
	void test1() {
		int [] flowerbed = {1,0,0,0,1};
		int n = 1;
		Dec05_Can_Place_Flowers test = new Dec05_Can_Place_Flowers();
		assertEquals(test.canPlaceFlowers(flowerbed,n), true);
		
	}

	@Test
	void test2() {
		int [] flowerbed = {1,0,0,0,1};
		int n = 2;
		Dec05_Can_Place_Flowers test = new Dec05_Can_Place_Flowers();
		assertEquals(test.canPlaceFlowers(flowerbed,n), false);
		
	}
	
	@Test
	void test3() {
		int [] flowerbed = {1,0,0,0,1};
		int n = 0;
		Dec05_Can_Place_Flowers test = new Dec05_Can_Place_Flowers();
		assertEquals(test.canPlaceFlowers(flowerbed,n), true);
		
	}

	@Test
	void test4() {
		int [] flowerbed = {1,0,0};
		int n = 1;
		Dec05_Can_Place_Flowers test = new Dec05_Can_Place_Flowers();
		assertEquals(test.canPlaceFlowers(flowerbed,n), true);
		
	}

	@Test
	void test5() {
		int [] flowerbed = {1,0,0};
		int n = 2;
		Dec05_Can_Place_Flowers test = new Dec05_Can_Place_Flowers();
		assertEquals(test.canPlaceFlowers(flowerbed,n), false);
		
	}
	
	@Test
	void test6() {
		int [] flowerbed = {1,0,0};
		int n = 0;
		Dec05_Can_Place_Flowers test = new Dec05_Can_Place_Flowers();
		assertEquals(test.canPlaceFlowers(flowerbed,n), true);
		
	}
	
	@Test
	void test7() {
		int [] flowerbed = {0,0,0};
		int n = 0;
		Dec05_Can_Place_Flowers test = new Dec05_Can_Place_Flowers();
		assertEquals(test.canPlaceFlowers(flowerbed,n), true);
		
	}
	
	@Test
	void test8() {
		int [] flowerbed = {0,0,0};
		int n = 1;
		Dec05_Can_Place_Flowers test = new Dec05_Can_Place_Flowers();
		assertEquals(test.canPlaceFlowers(flowerbed,n), true);
		
	}
	
	@Test
	void test9() {
		int [] flowerbed = {0,0,0};
		int n = 2;
		Dec05_Can_Place_Flowers test = new Dec05_Can_Place_Flowers();
		assertEquals(test.canPlaceFlowers(flowerbed,n), true);
		
	}
	
	@Test
	void test10() {
		int [] flowerbed = {0,0,0};
		int n = 3;
		Dec05_Can_Place_Flowers test = new Dec05_Can_Place_Flowers();
		assertEquals(test.canPlaceFlowers(flowerbed,n), false);
		
	}

	@Test
	void test11() {
		int [] flowerbed = {0,0,1};
		int n = 0;
		Dec05_Can_Place_Flowers test = new Dec05_Can_Place_Flowers();
		assertEquals(test.canPlaceFlowers(flowerbed,n), true);
		
	}
	
	@Test
	void test12() {
		int [] flowerbed = {0,0,1};
		int n = 1;
		Dec05_Can_Place_Flowers test = new Dec05_Can_Place_Flowers();
		assertEquals(test.canPlaceFlowers(flowerbed,n), true);
		
	}
	
	@Test
	void test13() {
		int [] flowerbed = {0,0,1};
		int n = 2;
		Dec05_Can_Place_Flowers test = new Dec05_Can_Place_Flowers();
		assertEquals(test.canPlaceFlowers(flowerbed,n), false);
		
	}
	
	@Test
	void test14() {
		int [] flowerbed = {0,1,0};
		int n = 0;
		Dec05_Can_Place_Flowers test = new Dec05_Can_Place_Flowers();
		assertEquals(test.canPlaceFlowers(flowerbed,n), true);
		
	}
	
	@Test
	void test15() {
		int [] flowerbed = {0,1,0};
		int n = 1;
		Dec05_Can_Place_Flowers test = new Dec05_Can_Place_Flowers();
		assertEquals(test.canPlaceFlowers(flowerbed,n), false);
		
	}

	@Test
	void test16() {
		int [] flowerbed = {1,1,1};
		int n = 0;
		Dec05_Can_Place_Flowers test = new Dec05_Can_Place_Flowers();
		assertEquals(test.canPlaceFlowers(flowerbed,n), true);
		
	}
	
	@Test
	void test17() {
		int [] flowerbed = {1,1,1};
		int n = 1;
		Dec05_Can_Place_Flowers test = new Dec05_Can_Place_Flowers();
		assertEquals(test.canPlaceFlowers(flowerbed,n), false);
		
	}
	
	@Test
	void test18() {
		int [] flowerbed = {1};
		int n = 0;
		Dec05_Can_Place_Flowers test = new Dec05_Can_Place_Flowers();
		assertEquals(test.canPlaceFlowers(flowerbed,n), true);
		
	}
	
	@Test
	void test19() {
		int [] flowerbed = {1};
		int n = 1;
		Dec05_Can_Place_Flowers test = new Dec05_Can_Place_Flowers();
		assertEquals(test.canPlaceFlowers(flowerbed,n), false);
		
	}
	
	@Test
	void test20() {
		int [] flowerbed = {0};
		int n = 0;
		Dec05_Can_Place_Flowers test = new Dec05_Can_Place_Flowers();
		assertEquals(test.canPlaceFlowers(flowerbed,n), true);
		
	}
	
	@Test
	void test21() {
		int [] flowerbed = {0};
		int n = 1;
		Dec05_Can_Place_Flowers test = new Dec05_Can_Place_Flowers();
		assertEquals(test.canPlaceFlowers(flowerbed,n), true);
		
	}
}
