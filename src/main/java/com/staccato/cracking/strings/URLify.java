package com.staccato.cracking.strings;

import java.util.Arrays;

//Strings 1.3

public class URLify {

    public static void main(String[] args) {
        urlify("Mr John Smith    ".toCharArray(), 13);
    }

    public static String urlify(char[] input, int trueLength){
        System.out.println("input: " + Arrays.toString(input));

        int spacecounter = 0;

        for(int i=0; i<trueLength; i++){
            if(input[i] == ' '){
                spacecounter++;
            }
        }

        int last = trueLength + spacecounter*2;

        for(int i =trueLength -1; i>=0; i--){
            if(input[i] == ' '){
                input[last - 1] = '0';
                input[last - 2] = '2';
                input[last - 3] = '%';
                last = last-3;
                System.out.println("replaced -> " + Arrays.toString(input));
            }else {
                input[last - 1] = input[i];
                System.out.println("moved    -> " + Arrays.toString(input));
                last--;
            }
        }

        return new String(input);
    }
}
