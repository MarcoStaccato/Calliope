package com.staccato.cracking.linkedlists;

import com.staccato.cracking.linkedlists.setup.Node;
import com.staccato.cracking.linkedlists.setup.Utils;

public class Reverse {

    public static void main(String[] args) {

        reverse(Utils.getNodeInteger());
        reverseNodes(Utils.getNodeInteger(), 4);
    }

    public static Node<Integer> reverse(Node<Integer> head){

        Utils.printList(head);
        Node prev = null;
        Node next = null;
        Node current = head;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        Utils.printList(prev);
        return prev;
    }

    public static Node<Integer> reverseNodes(Node<Integer> head, int n){

        Utils.printList(head);
        Node prev = null;
        Node next = null;
        Node current = head;
        int counter = 0;

        while(current != null && counter < n){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            counter++;
        }
        Utils.printList(prev);
        return prev;
    }
}
