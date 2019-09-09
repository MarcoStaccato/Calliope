package com.staccato.cracking.linkedlists;

import com.staccato.cracking.linkedlists.setup.Node;

public class SumList {

    public static void main(String[] args) {

        Node<Integer> a = new Node<>(7, new Node<>(1, new Node<>(6, null)));
        Node<Integer> b = new Node<>(5, new Node<>(9, new Node<>(2, null)));

        Node<Integer> c = new Node<>(6, new Node<>(1, new Node<>(7, null)));
        Node<Integer> d = new Node<>(2, new Node<>(9, new Node<>(5, null)));

        System.out.println(sum(a, b));
//        System.out.println(sum(c, d));
    }

    public static int sum(Node<Integer> n, Node<Integer> m){
        int numA = 0;
        int numB = 0;

        int decimal = 1;
        while(n != null){
            numA = numA + (decimal * n.value);
//            numA = (numA*10) + n.value;
            decimal = decimal*10;
            n = n.next;
        }

        decimal = 1;

        while(m != null){
            numB = numB + (decimal * m.value);
//            numB = (numB*10) + m.value;
            decimal = decimal*10;
            m = m.next;
        }

        System.out.println(numA + " " + numB);

        return numA + numB;
    }
}
