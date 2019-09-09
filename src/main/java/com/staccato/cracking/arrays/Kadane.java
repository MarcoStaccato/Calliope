package com.staccato.cracking.arrays;

public class Kadane {


    public static void main(String[] args) {
        int test[] = {1, 3, -4, -1, -2, 1, 5, -3};

        int maxSum = maxSubArraySum(test, test.length);

        System.out.println(maxSum);
    }

    static int maxSubArraySum(int a[], int size)
    {
        int max_so_far = a[0];
        int curr_max = a[0];

        for (int i = 1; i < size; i++) {
            System.out.println("current max: " + curr_max + " -> max[" + a[i] + ", "+ (curr_max+a[i]) + "]");
            curr_max = Math.max(a[i], curr_max+a[i]);
            System.out.println("max so far : "+ max_so_far + " -> max[" + max_so_far + ", "+ curr_max + "]");
            max_so_far = Math.max(max_so_far, curr_max);
        }
        System.out.println(curr_max);
        return max_so_far;
    }}
