package com.staccato.cake.greedy;

import java.util.Arrays;

public class ProductOfAllIntegers {


    public static void main(String[] args) {

        int[] test = {1, 7, 3, 4};

//        should return [84, 12, 28, 21]
        int[] result = getProductOfAllIntegersExceptIndex(test);

        System.out.println(Arrays.toString(result));
    }

    public static int[] getProductOfAllIntegersExceptIndex(int[] input){
        int size = input.length;

        int[] toRight = new int[size];
        int[] toLeft = new int[size];
        int[] result = new int[size];

        toRight[0] = 1;
        for (int i = 1; i < size; i++) {
            toRight[i] = input[i-1] * toRight[i-1];
        }
//        System.out.println(Arrays.toString(toRight));

        toLeft[size-1] = 1;
        for (int i = size - 2; i >= 0; i--) {
            toLeft[i] = input[i+1] * toLeft[i+1];
        }
//        System.out.println(Arrays.toString(toLeft));

        for (int i = 0; i < size; i++) {
            result[i] = toRight[i] * toLeft[i];
        }

        return result;
    }
}
