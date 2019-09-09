package com.staccato.cracking.strings;

public class OneAway {

    public static void main(String[] args) {
        System.out.println(isOneAway("palesci", "pale"));
        System.out.println(isOneAway("pale", "bale"));
    }

    public static boolean isOneAway(String first, String second){

        String s1 = first.length() < second.length() ? first : second; //shortest
        String s2 = first.length() < second.length() ? second : first; //longest

        if(s2.length() - s1.length() >1) return false;

        int index1=0, index2=0;
        boolean foundIt = false;

        while(index1 < s1.length() && index2 < s2.length()){
            if(s1.charAt(index1) != s2.charAt(index2)){
                if(foundIt) return false;
                foundIt = true;
                if(s1.length() == s2.length()){ //swap
                    index1++;
                }
            }else{ //matches
                index1++;
            }
            index2++;
        }
        return true;
    }
}
