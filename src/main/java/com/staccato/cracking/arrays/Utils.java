package com.staccato.cracking.arrays;

import java.util.Arrays;

public class Utils {

    public static void printMatrix(int[][] matrix){
        System.out.println("--------------");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("--------------");
    }
}
