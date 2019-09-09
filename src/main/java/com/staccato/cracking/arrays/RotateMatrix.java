package com.staccato.cracking.arrays;

import java.util.Arrays;

public class RotateMatrix {

    public static int[][] demoMatrix = {{1,   2,  3,  4},
                                        {5,   6,  7,  8},
                                        {9,  10, 11, 12},
                                        {13, 14, 15, 16}};

    public static void main(String[] args) {
        printMatrix(demoMatrix);
        rotateMatrix(demoMatrix);
//        rotate(demoMatrix);
    }

    public static int[][] rotateMatrix(int[][] matrix){

        int n = matrix.length;

        for (int layer = 0; layer < n; layer++) {
            int first = layer;
            int last = n-layer-1;
            System.out.println("-----------> start: " + layer + " last: " + last);

            for (int i = first; i < last; i++) {
                int offset = i - first;

                int top = matrix[first][i]; //save top
                //                    top  <- left
                matrix[first][i]           = matrix[last-offset][first];
                //                    left <- bottom
                matrix[last-offset][first] = matrix[last][last-offset];
                //                  bottom <- right
                matrix[last][last-offset]  = matrix[i][last];
                //                   right <- top
                matrix[i][last]            = top;
                System.out.println("step: " + layer + " iteration: " + i);
                printMatrix(matrix);
            }
            System.out.println("result from: " + layer);
            printMatrix(matrix);
        }

        return matrix;
    }

    public static int[][] rotate(int[][] matrix){
        int n = matrix.length;
        int[][] result = new int[n][n];
        int aux = n-1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[j][aux-i] = matrix[i][j];
            }
        }
        printMatrix(result);
        return result;
    }

    public static int[][] snailMatrix(int[][] matrix){
        int n = matrix.length;

        int current = 0;

        int last = matrix.length;

        for (int i = 0; i < n/2; i++) {
            for (int j = 0; j < n/2; j++) {

            }
        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }


}
