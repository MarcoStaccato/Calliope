package com.staccato.cracking.strings;

public class Compression {

    public static void main(String[] args) {
        System.out.println(compress("aabcccccaaa"));
    }

    public static String compress(String input){
        StringBuilder result = new StringBuilder();
        int count = 1;
        char current = input.charAt(0);
        result.append(input.charAt(0));

        for(int i=1; i<input.length(); i++){
            System.out.println(result.toString());
            char c = input.charAt(i);
            if(c == current){
                count++;
            }else{
                result.append(current).append(count);
                count = 1;
                current = c;
            }
        }
        result.append(current).append(count);
        return input.length() > result.length() ? result.toString() : input;
    }
}
