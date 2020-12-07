package com.leet.leetcode_dec_2020;

public class Dec07_Spiral_Matrix_II {
	//https://leetcode.com/problems/spiral-matrix-ii/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20;
		
		for(int i[] : generateMatrix(n)) {
			for(int k : i) {
				System.out.print(k + " " );
			}
			System.out.println();
		}
	}
	
	
    public static int[][] generateMatrix(int n) {
        
    	int [][] rs = new int[n][n];
  
    	
    	int dir = 1;//1 to the right, 2 downwards, 3 to the left, 4 upwards
    	int sizes = n*n;
    	int pos_x = 0;
    	int pos_y = 0;
    	for(int i = 1; i <= sizes; i++) {
			rs[pos_y][pos_x] = i;
			//check direction and if the next spot is filled or not to decide next coordinate
    		if(dir==1) {
    			if(pos_x+1 < n && rs[pos_y][pos_x+1]== 0) {
    				pos_x ++;
    			}else {
    				dir=2;
    				pos_y++;
    			}
    		}
    		else if(dir==2) {
    			if(pos_y+1 < n && rs[pos_y+1][pos_x]== 0) {
    				pos_y ++;
    			}else {
    				dir=3;
    				pos_x--;
    			}
    		}
    		else if(dir==3) {
    			if(pos_x-1 >= 0 && rs[pos_y][pos_x-1]== 0) {
    				pos_x--;
    			}else {
    				dir=4;
    				pos_y--;
    			}
    		}
    		else if(dir==4) {
    			if(pos_y-1 >= 0 && rs[pos_y-1][pos_x]== 0) {
    				pos_y --;
    			}else {
    				dir=1;
    				pos_x++;
    			}
    		}
    	}
    	
    	
    	
    	return rs;
    }
}
