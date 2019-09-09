package com.staccato.cake.hash;

import java.util.Arrays;
import java.util.HashMap;

public class WordCloud {

    public static void main(String[] args) {

        cloudWord(  "After beating the eggs, Dana read the next step: " + "Add milk and eggs, then add flour and sugar.");

    }

    static HashMap<String, Integer> cloudWord(String input){
        String[] words = clean(input);
        HashMap<String, Integer> cloud = new HashMap<>();

        for(String word : words){
            cloud.computeIfPresent(word.toLowerCase(), (k, v) -> v + 1);
            cloud.computeIfAbsent(word.toLowerCase(), k -> new Integer(1));
        }

        System.out.println(Arrays.asList(cloud));

        return cloud;
    }



    private static String[] clean(String input){
        StringBuilder builder = new StringBuilder();

        for(char c : input.toCharArray()){
            if(c == ' ' || Character.isLetter(c)){
                builder.append(c);
            }
        }
        return builder.toString().split(" ");
    }


}
