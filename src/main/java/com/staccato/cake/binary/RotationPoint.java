package com.staccato.cake.binary;


/**
 * Use binary reasch to find the rotation point for a "sorted" array
 */
public class RotationPoint {


    public static void main(String[] args) {

        String[] test = {"p", "r", "s", "u", "x", "a", "b", "d", "e", "k", "o"};
        String[] test2 = {"c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o","p", "r", "s", "u", "x", "a", "b"};

        System.out.println(getIndexRotation(test));
        System.out.println(getIndexRotation(test2));

    }

    public static int getIndexRotation(String[] input){
        int len = input.length;
        int point = len/2;
        int start = 0;
        int end = len-1;

        int steps = 0;

        while(start < end){
            steps++;
            if(input[point].compareTo(input[end]) > 0) start = point;
            else end = point;

            point = (start + end) / 2;
            if((start +1) == end) break;
        }
        System.out.println("found in " + steps + " steps");
        return point+1;
    }
}
