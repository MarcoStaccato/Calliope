package com.staccato.cracking.strings;

import java.util.HashSet;

//Strings 1.1

public class UniqueCharacters {

    public static void main(String[] args) {

        boolean test1 = hasUniqueCharacters("this");

        System.out.println(test1);

        boolean test2 = hasUniqueCharacters("This is a second test");
        System.out.println(test2);

        System.out.println(hasUniqueChars("trying"));



    }

    //added extra space
    public static boolean hasUniqueCharacters(String string) {
        HashSet charSet = new HashSet<Character>();
        for(int i = 0; i<string.length(); i++){
            if(charSet.contains(string.charAt(i))){
                return false;
            }else{
                charSet.add(string.charAt(i));
            }
        }
        return true;
    }

//    using an int as bit vector
//    only works for lowercase
    public static boolean hasUniqueChars(String input){
        int checker = 0; //setup bit vector

        for(int i = 0; i<input.length(); i++){
            System.out.println(input.charAt(i) + " -> " +(input.charAt(i)+0) + " to bit: 2^" + (input.charAt(i) -'a'));
            int charVal = input.charAt(i) -'a';
//            1<<charVal moves 0000 1 to 10000
            if((checker & (1<<charVal)) > 0){
                return false;
            }
//            activates bit(s) on charVal position
            checker |=(1<< charVal);
            System.out.println(checker);
        }
        return true;
    }
}
