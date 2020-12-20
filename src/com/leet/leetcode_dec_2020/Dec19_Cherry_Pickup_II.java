package com.leet.leetcode_dec_2020;

public class Dec19_Cherry_Pickup_II {

    //https://leetcode.com/problems/cherry-pickup-ii/
    public int cherryPickup(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        Integer[][][] dp = new Integer[rows][cols][cols];
        int result = 0;

        dp[0][0][cols-1] = grid[0][0] + grid[0][cols-1];

        for(int row = 1; row < rows; row++){

            for(int j = 0; j < cols; j++){

                for(int k = 0; k < cols; k++){

                    int cur_grid_bot_1 = grid[row][j];
                    int cur_grid_bot_2 = grid[row][k];
                    int prev = 0;

                    if(j==k){
                        cur_grid_bot_2 = 0;
                    }

                    for(int pos_j = -1; pos_j < 2; pos_j++){

                        if(j+pos_j < 0 || j+pos_j == cols){
                            continue;
                        }

                        for(int pos_k = -1; pos_k < 2; pos_k++){

                            if(k+pos_k < 0 || k+pos_k == cols){
                                continue;
                            }

                            if(dp[row-1][j+pos_j][k+pos_k]!=null){

                                prev = Math.max(prev, dp[row-1][j+pos_j][k+pos_k]);

                                if(dp[row][j][k]==null){
                                    dp[row][j][k] = cur_grid_bot_1 + cur_grid_bot_2 +  prev;
                                }else{
                                    dp[row][j][k] = Math.max(cur_grid_bot_1 + cur_grid_bot_2 +  prev, dp[row][j][k]);
                                }

                            }

                        }
                    }

                }
            }

        }

        for(Integer[] last_row :  dp[rows-1]){
            for(int i = 0; i < cols; i++){
                if(last_row[i] != null){
                    result = Math.max(result, last_row[i]);
                }
            }
        }

        return result;
    }

}
