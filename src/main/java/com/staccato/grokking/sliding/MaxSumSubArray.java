package com.staccato.grokking.sliding;

import java.util.Arrays;

public class MaxSumSubArray {

    public static void main(String[] args) {

        int[] testInput = {2, 1, 5, 1, 3, 2, 14};

        System.out.println("Input: " + Arrays.toString(testInput));

        int result = getMaxSum(testInput, 3);

        System.out.println("Result: " + result);

    }

    private static int getMaxSum(int[] array, int size){
        int maxSum = Integer.MIN_VALUE;
        int windowSum = 0;
        int windowLeftIndex = 0;

        for(int i = 0; i<array.length; i++){
            if(i<size){
                windowSum = windowSum + array[i];
                continue;
            }
            windowSum = windowSum - array[windowLeftIndex] + array[i];
            maxSum = Math.max(maxSum, windowSum);
            windowLeftIndex++;
        }
        return maxSum;
    }
}
