package com.leet.leetcode_dec_2020;

public class Dec25_Diagonal_Traverse {

    //https://leetcode.com/problems/diagonal-traverse/
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix.length == 0){
            return new int[]{};
        }
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] result = new int[rows*cols];
        int[] position = {0,0,0};

        goUp(matrix,result,position);

        return result;
    }

    public void goDown(int[][] matrix, int[] result, int[] position){

        if(position[2] == result.length){
            return;
        }

        int X = position[0];
        int Y = position[1];
        int counter = position[2];

        while(true){
            result[counter++] = matrix[Y][X];

            if(X-1 < 0 || Y+1 >= matrix.length){
                if(Y+1 >= matrix.length){
                    position[0] = X+1;
                    position[1] = Y;
                }else{
                    position[0] = X;
                    position[1] = Y+1;
                }
                break;
            }
            X--;
            Y++;
        }

        position[2] = counter;

        goUp(matrix,result,position);
    }


    public void goUp(int[][] matrix, int[] result, int[] position){

        if(position[2] == result.length){
            return;
        }

        int X = position[0];
        int Y = position[1];
        int counter = position[2];

        while(true){
            result[counter++] = matrix[Y][X];

            if(X+1 >= matrix[0].length || Y-1 < 0){
                if(X+1 >= matrix[0].length){
                    position[0] = X;
                    position[1] = Y+1;
                }else{
                    position[0] = X+1;
                    position[1] = Y;
                }
                break;
            }
            X++;
            Y--;
        }

        position[2] = counter;

        goDown(matrix,result,position);
    }
}
