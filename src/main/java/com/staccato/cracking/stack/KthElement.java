package com.staccato.cracking.stack;

import java.util.Stack;

public class KthElement {

    static int[] array = new int[]{7, 6, 5, 4, 3, 2, 1};

    public static void main(String[] args) {
//        Pointer p = new Pointer();
//        System.out.println(p.dist);
//        System.out.println(getKthElement(array, 2));
    }

    public static int getKthElement(int[] input, int k){
        Stack<Integer> sorted = new Stack<>();

        for(int n : input){
            pushSorted(n, sorted);
        }

        while(k>1){
            sorted.pop();
            k--;
        }
        return sorted.pop();

    }

    public static void pushSorted(int n, Stack<Integer> sorted){
        Stack<Integer> aux = new Stack<>();

        while(!sorted.isEmpty() && sorted.peek() > n){
            aux.push(sorted.pop());
        }
        sorted.push(n);
        while(!aux.isEmpty()){
            sorted.push(aux.pop());
        }
    }

    private class Pointer{
        int[] coord;
        int dist;
    }
}
