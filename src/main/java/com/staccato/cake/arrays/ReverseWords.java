package com.staccato.cake.arrays;

public class ReverseWords {

    public static void main(String[] args) {
        String test = "The eagle has landed";
        String test2 = "landed has eagle The";
        System.out.println(reverseWords(test2.toCharArray()));
    }

    public static String reverseWords(char[] input){
        char[] reversed = reverseIndex(input, 0, input.length-1);
        int start = 0;
        System.out.println(reversed);

        for(int i=0; i<input.length; i++){
            if(input[i] == ' '){
                reverseIndex(input, start, i-1);
                start = i+1;
            }
        }

        System.out.println(input);

        reverseIndex(input, start, input.length-1);
        return new String(reversed);
    }

    private static char[] reverseIndex(char[] input, int start, int end){
        while (start < end){
            char current = input[start];
            input[start] = input[end];
            input[end] = current;
            start++;
            end--;
        }
        return input;
    }
}
