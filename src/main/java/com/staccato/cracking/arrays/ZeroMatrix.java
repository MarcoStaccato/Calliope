package com.staccato.cracking.arrays;

public class ZeroMatrix {

    public static int[][] demoMatrix = {
            {1,   2,  3,  4,  5},
            {6,   0,  8,  9, 10},
            {11, 12, 13, 14, 11},
            {15, 16,  5,  0, 18},
            {19, 20, 21, 22, 78}};

    public static void main(String[] args) {
        Utils.printMatrix(demoMatrix);
        getZeroes(demoMatrix);
    }

    public static int[][] getZeroes(int[][] matrix){
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        Utils.printMatrix(matrix);

        for (int i = 0; i < n; i++) {
            boolean isZero = matrix[i][0] == 0;
            for (int j = 0; j < n; j++) {
                if(isZero){ //set row as zero
                    matrix[i][j] = 0;
                }
                if(matrix[0][j] == 0){ //set column as zero
                    matrix[i][j] = 0;
                }
            }
        }
        Utils.printMatrix(matrix);

        return matrix;
    }
}
