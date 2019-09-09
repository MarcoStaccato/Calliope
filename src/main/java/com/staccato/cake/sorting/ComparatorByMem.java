package com.staccato.cake.sorting;

import java.util.*;

public class ComparatorByMem {

    public static void main(String[] args) {
        List<String> alphabet = new LinkedList<>(Arrays.asList("b", "d", "r", "e", "8", "0"));

        sort(alphabet);

        System.out.println(Arrays.toString(alphabet.toArray()));

        sortLambda(alphabet);

        System.out.println(Arrays.toString(alphabet.toArray()));
    }

    public static void sort(List<String> input){

        Collections.sort(input, new Comparator<String>(){

            @Override
            public int compare(String s1, String s2){
                System.out.println("[" + s1 + ":" + s2 + "] -> " + s1.compareTo(s2));
                return s1.compareTo(s2);
            }
        });
    }

    public static void sortLambda(List<String> input){

        Collections.sort(input, (o1, o2) -> o1.compareTo(o2) * (-1));
    }
}
