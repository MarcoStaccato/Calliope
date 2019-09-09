package com.staccato.cracking.linkedlists;

import com.staccato.cracking.linkedlists.setup.Node;
import com.staccato.cracking.linkedlists.setup.Utils;

public class DeleteMiddleNode {

    public static void main(String[] args) {
        Node<Character> node = Utils.getCharNode();

        Utils.printList(node);

//        deleteMiddle(node);

        deleteAny(node.next.next);

        Utils.printList(node);
    }

    public static void deleteMiddle(Node<Character> node){
        Node<Character> slow = node;
        Node<Character> prevSlow = node;
        Node<Character> fast = node;

        int counter = 0;

        while(fast != null){
            System.out.println(fast.value);
            prevSlow = slow;
            slow = slow.next;
            if(fast.next != null){
                fast = fast.next.next;
            }
        }
        prevSlow.next = slow.next;
    }

    public static void deleteAny(Node<Character> any){
        Node<Character> current = any;
        Node<Character> next = any.next;

        current.value = any.next.value;
        current.next = any.next.next;
    }
}
