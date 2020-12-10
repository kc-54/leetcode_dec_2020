package com.leet.leetcode_dec_2020;

public class Dec10_Valid_Mountain_Array {

    //https://leetcode.com/problems/valid-mountain-array/
    public static boolean validMountainArray(int[] arr) {

//        1st solution, run time 1 ms; memory usage 40.4MB
//        if(arr.length < 3){
//            return false;
//        }
//        boolean decreasing = false, increasing = arr[0] < arr[1];
//        if(!increasing) return false;
//
//        int prev = arr[0];
//
//        for(int i = 1; i < arr.length; i++){
//
//            if(prev == arr[i]){
//                return false;
//            }else if(arr[i] > prev){
//                if(decreasing) return false;
//            }else{
//                if(!decreasing)decreasing = true;
//            }
//
//            prev = arr[i];
//        }
//
//        return decreasing && increasing;


//        2nd solution, run time 1 ms; memory usage 40.1 MB


        int pointer = 0;
        while(pointer + 1 < arr.length && arr[pointer] < arr[pointer+1]){
            pointer++;
        }
        if(pointer == 0 || pointer == arr.length-1){
            return false;
        }
        while(pointer + 1 < arr.length && arr[pointer] > arr[pointer+1]){
            pointer++;
        }
        return  pointer == arr.length -1;

    }


}
