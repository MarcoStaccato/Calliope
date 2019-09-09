package com.staccato.cracking.bitops;

public class RightmostZero {

    public static void main(String[] args) {

        System.out.println(getRightmostZero(89));
    }

    public static int getRightmostZero(int input){
        System.out.println(Integer.toBinaryString(input));
//        System.out.println(Integer.toBinaryString(input | input + 1));
        System.out.println(Integer.toBinaryString((input | input + 1) + 1));
        System.out.println(Integer.toBinaryString(input | ((input | input + 1) + 1)));
        return (input | ((input | input + 1) + 1)) - input;
    }
}