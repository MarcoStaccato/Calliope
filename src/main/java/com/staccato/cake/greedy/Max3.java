package com.staccato.cake.greedy;

public class Max3 {

    public static void main(String[] args) {
        System.out.println(max3(new int[]{-10,-10,1,3,2}));
    }

    public static int max3(int[] input){
        int max1 = input[0];
        int max2 = input[0];
        int max3 = input[0];

        int min1 = input[0];
        int min2 = input[0];

        for(int n : input){
//            check for max
            if(n>0){
                if(n>max3){
                    if(n>max2){
                        max3 = max2;
                        max2 = n;
                        if(n>max1){
                            max2 = max1;
                            max1 = n;
                        }
                    }else{
                        max3 = n;
                    }
                }
            }
//            check for min
            if(n<0){
                if(n<min2){
                    min2 = n;
                    if(n<min1){
                        min2 = min1;
                        min1 = n;
                    }
                }
            }
        }

        System.out.println(max1 + " : " + max2 + " : " + max3);
        System.out.println(min1 + " : " + min2);
        return Math.max((min1 * min2 * max1), (max1*max2*max3));
    }
}
