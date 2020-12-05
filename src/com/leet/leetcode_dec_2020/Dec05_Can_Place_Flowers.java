package com.leet.leetcode_dec_2020;

public class Dec05_Can_Place_Flowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		// TODO Auto-generated method stub
		if(flowerbed.length == 1) {
			return (flowerbed[0] == 0 && n<=1) || (flowerbed[0] == 1 && n<= 0) ;
		}
		
		for(int i = 0; i < flowerbed.length; i++) {
			
			if(i-1 > 0 && i+1 < flowerbed.length) {
				if(flowerbed[i] == 0 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
					flowerbed[i] = 1;
					n--;
				}
			}else if(i == 0) {
				if(i+1 < flowerbed.length && flowerbed[i] == 0 && flowerbed[i+1] == 0) {
					flowerbed[i] = 1;
					n--;
				}
			}else if(i+1 == flowerbed.length) {
				if(flowerbed[i] == 0 && flowerbed[i-1] == 0) {
					flowerbed[i] = 1;
					n--;
				}
			}
			if(n==0)return true;
		}
		
		
		return n<=0;
	}

}
