package com.staccato.cake.math;

public class DuplicatedNumber {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5};

        System.out.println("Duplicated number is: " + getDuplicated(arr));
    }

    public static int getDuplicated(int[] input){
        int sum = 0;
        int n = input.length - 1;
        int triangularSum = (n + (n*n)) /2;

        for(int i : input){
            sum+=i;
        }

        return sum - triangularSum;
    }
}
