package com.staccato.cake.arrays;

public class ReverseArray {

    public static void main(String[] args) {

        System.out.println(reverse("reverse this"));

        String test = "abcde";
        System.out.println(reverse(test));
        System.out.println(test.length());
    }

    public static String reverse(String input){
        char[] inputArr = input.toCharArray();
        System.out.println(inputArr.length);
        for(int i=0; i<inputArr.length/2; i++){
            char current = inputArr[i];
            inputArr[i] = inputArr[inputArr.length - i - 1];
            inputArr[inputArr.length - i - 1] = current;
        }
        return new String(inputArr);
    }
}
