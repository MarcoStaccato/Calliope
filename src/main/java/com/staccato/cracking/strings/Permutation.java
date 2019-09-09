package com.staccato.cracking.strings;

import java.util.Arrays;

//Strings 1.2

public class Permutation {

    public static void main(String[] args) {

        System.out.println(isPermutation("dog", "god")); //true

        System.out.println(isPermutation("g ood", "d ogo")); //true

        System.out.println(isPermutation("wont", "pass")); //false

//        counting chars
        System.out.println(isPermutationv2("dog", "god")); //true

        System.out.println(isPermutationv2("g ood", "d ogo")); //true

        System.out.println(isPermutationv2("wont", "pass")); //false



    }

//    bruteforce, sort strings
    public static boolean isPermutation(String original, String comparate){
        original = sanitizeString(original);
        comparate = sanitizeString(comparate);

        if(original.length() != comparate.length()){
            return false;
        }
        char[] originalSorted =original.toCharArray();
        char[] comparateSorted = comparate.toCharArray();

//        move to own sort function
        Arrays.sort(originalSorted);
        Arrays.sort(comparateSorted);

        String originalString = new String(originalSorted);
        String comparateString = new String(comparateSorted);

        return originalString.equals(comparateString);
    }


//    count characters
    public static boolean isPermutationv2(String original, String comparate){
        original = sanitizeString(original);
        comparate = sanitizeString(comparate);
        if(original.length() != comparate.length()){
            return false;
        }

        int[] letters = new int[128];

        char[] origArray = original.toCharArray();
        char[] compArray = comparate.toCharArray();

        for(int i = 0; i<original.length(); i++){
            letters[origArray[i]]++;
            letters[compArray[i]]--;
        }

        for(int i = 0; i<128; i++){
            if(letters[i] > 0){
                return false;
            }
        }
        return true;
    }






    public static String sanitizeString(String input){
        return input.replaceAll(" ", "");
    }
}
