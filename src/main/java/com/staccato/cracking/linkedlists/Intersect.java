package com.staccato.cracking.linkedlists;

import com.staccato.cracking.linkedlists.setup.Node;

public class Intersect {

    public static void main(String[] args) {

    }

    public static boolean doIntersect(Node<Integer> a, Node<Integer> b){
        int lenA = length(a);
        int lenB = length(b);

        while(lenA > lenB){
            a = a.next;
        }

        while(lenB > lenA){
            b = b.next;
        }

        while (a != null){
            if(a == b){
                return true;
            }
            a = a.next;
            b = b.next;
        }
        return false;
    }


    public static int length(Node a){
        int result = 0;
        while(a != null){
            result++;
        }
        return result;
    }
}
