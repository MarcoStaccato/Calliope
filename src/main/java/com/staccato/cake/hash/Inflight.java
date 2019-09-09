package com.staccato.cake.hash;

import java.util.HashSet;
import java.util.Set;

public class Inflight {

    static int[] movies = {45, 54, 40, 40, 67, 90, 54};

    public static void main(String[] args) {
        System.out.println(existPair(80, movies));
    }

    public static boolean existPair(int flightlength, int[] movielengths){
        Set<Integer> seen = new HashSet<>();

        for(int len : movielengths){
            if(seen.contains(flightlength - len)) return true;
            seen.add(len);
        }
        return false;
    }
}
