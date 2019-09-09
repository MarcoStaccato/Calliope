package com.staccato.cracking.linkedlists;

import com.staccato.cracking.linkedlists.setup.Node;
import com.staccato.cracking.linkedlists.setup.Utils;

public class KtoLast {

    public static void main(String[] args) {

        Node<Integer> node = Utils.getNodeInteger();
        Utils.printList(node);

//        Node<Integer> kto = kToLast(node, 4);
        Node<Integer> kto = kToLastRecursive(node, 4, 0);

        Utils.printList(kto);

    }

    public static Node<Integer> kToLast(Node<Integer> node, int k){
        int counter = 0;
        while(counter < k){
            node = node.next;
            counter++;
        }
        return node;
    }

    public static Node<Integer> kToLastRecursive(Node<Integer> node, int k, int counter){
        if(counter == k){
            return node;
        }else{
            return kToLastRecursive(node.next, k, ++counter);
        }
    }
}
