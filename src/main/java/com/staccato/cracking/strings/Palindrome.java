package com.staccato.cracking.strings;

// Strings 1.4
public class Palindrome {

    public static void main(String[] args) {

        System.out.println("Version 1: ");
        System.out.println(isPalindrome("taco cat"));
        System.out.println(isPalindrome("taco cat ..z"));

        System.out.println("Version 2: ");
        System.out.println(isPalindromev2("taco cat"));
        System.out.println(isPalindromev2("taco cat ..z"));

        System.out.println("Version 3: ");
        System.out.println(isPalindromev3("taco cat"));
        System.out.println(isPalindromev3("taco cat ..z"));
    }

    //two iterations count array
    public static boolean isPalindrome(String input){
        input = input.toLowerCase();

        int[] count = new int['z' - 'a' + 1];

        for(int i =0; i<input.length(); i++){
            char letter = input.charAt(i);
            if(Character.isLetter(letter)){
                count[letter - 'a']++;
            }
        }
        byte odds = 0;
//        System.out.println(input + " -> " + Arrays.toString(count));
        for(int c : count){
            if(c%2 != 0){
                odds++;
            }if(odds > 1){
                return false;
            }
        }
        return true;
    }

    //one iteration count array
    public static boolean isPalindromev2(String input){
        input = input.toLowerCase();

        int[] count = new int['z' - 'a' + 1];
        short oddcount =0;

        for(int i =0; i<input.length(); i++){
            char letter = input.charAt(i);
            if(Character.isLetter(letter)){
                count[letter - 'a']++;
                if(count[letter - 'a'] % 2 != 0){
                    oddcount++;
                }else{
                    oddcount--;
                }
            }
        }
        return oddcount <=1;
    }

    public static boolean isPalindromev3(String input){
        input = input.toLowerCase();
        int bitVector = 0;
        for(int i =0; i<input.length(); i++) { //fill bitVector
            char letter = input.charAt(i);
            if(Character.isLetter(letter)){
                int bitValue = 1 << letter;
//                System.out.println(letter + " -> " + Integer.toBinaryString(bitValue));
                if((bitVector & bitValue) == 0){
                    bitVector |= bitValue; //odd, turn on
                }else{
                    bitVector &= ~bitValue; //found odd, turn off since now its a pair
                }
            }
        }
//        check if vector only has ONE bit on
        return (bitVector & (bitVector - 1)) == 0;
    }



}
