package com.staccato.cracking.bitops;

public class SwapPairs {

    public static void main(String[] args) {
//        System.out.println(Integer.valueOf("1111111111111110101010101010101", 2));
//        System.out.println(Integer.valueOf("101 0101  0101 0101  0101 0101  0101 0101", 2));

        System.out.println(swapPair(83748));
    }

    public static int swapPair(int n){

        return (n<<1&0b10101010101010101010101010101010) | (n>>1&0b01010101010101010101010101010101);
//        System.out.println(Integer.toBinaryString(-1431655765>>1));
//        System.out.println(Integer.toBinaryString((n<<1&0b10101010101010101010101010101010)));
//        System.out.println(Integer.toBinaryString((n>>1&0b01010101010101010101010101010101)));
//        System.out.println(Integer.toBinaryString(((n&0b10101010101010101010101010101010)>>1)));
    }

//    10100 0111 0010 0100
//   101000 1010 0000 1000
//            10 0010 0000

//    10100 0111 0010 0100
//   101000 1010 0000 1000
//             1 0001 0000
}
