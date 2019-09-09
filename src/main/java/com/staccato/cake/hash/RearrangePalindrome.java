package com.staccato.cake.hash;

import java.util.HashSet;

public class RearrangePalindrome {

    public static void main(String[] args) {

        System.out.println(haspermutation("civic"));
        System.out.println(haspermutation("ciic"));
        System.out.println(haspermutation("ciasdic"));
    }

    public static  boolean haspermutation(String input){
        HashSet<Character> charMap = new HashSet<>();

        for(char c: input.toCharArray()){
            if(charMap.contains(c)){
                charMap.remove(c);
            }else{
                charMap.add(c);
            }
        }
        return charMap.size() <= 1;
    }
}
