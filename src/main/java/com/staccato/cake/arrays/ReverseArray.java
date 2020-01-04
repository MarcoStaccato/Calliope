package com.staccato.cake.arrays;

public class ReverseArray {

    public static void main(String[] args) {

        System.out.println(reverse("reverse this"));

        String test = "abcde";
        System.out.println(reverse(test));

        System.out.println(reverseV2("test for reversing with while"));
    }

    public static String reverse(String input){
        char[] inputArr = input.toCharArray();
        for(int i=0; i<inputArr.length/2; i++){
            char current = inputArr[i];
            inputArr[i] = inputArr[inputArr.length - i - 1];
            inputArr[inputArr.length - i - 1] = current;
        }
        return new String(inputArr);
    }

    public static String reverseV2(String input){
        char[] inputArr = input.toCharArray();
        int start = 0;
        int end = input.length()-1;
        while(start < end){
            char current = inputArr[start];
            inputArr[start] = inputArr[end];
            inputArr[end] = current;
            start++;
            end--;
        }
        return new String(inputArr);
    }
}
