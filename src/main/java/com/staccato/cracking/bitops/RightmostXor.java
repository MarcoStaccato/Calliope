package com.staccato.cracking.bitops;

public class RightmostXor {

    public static void main(String[] args) {
//        rightmostDiff(11, 13);
//        rightmostEqual(1073741824, 1006895103);
        rightmostEqual(28, 27);
    }

    public static int rightmostDiff(int n, int m){
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(m));


        System.out.println(Integer.toBinaryString((n^m)));
        System.out.println(Integer.toBinaryString((-(n^m))));
        System.out.println(Integer.toBinaryString((n^m) & (-(n^m))));

        return 0;
    }

    public static int rightmostEqual(int n, int m){
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(m));
        System.out.println(Integer.toBinaryString(~(n^m)));
        System.out.println(Integer.toBinaryString(262144));
        System.out.println(Integer.toBinaryString((n&m) & (-(n&m))));
        return 0;
    }

//    1000000000000000000000000000000
//     111100000000111111111111111111
//                1000000000000000000
}
