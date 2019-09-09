package com.staccato.cracking.linkedlists;

import com.staccato.cracking.linkedlists.setup.Node;
import com.staccato.cracking.linkedlists.setup.Utils;

public class Partition {

    public static void main(String[] args) {
        Node<Integer> node = Utils.getNodeInteger();

        Utils.printList(node);

        Node<Integer> result = partitionv2(node, 5);

        Utils.printList(result);
    }

    public static Node<Integer> partition(Node<Integer> node, int part){

        Node<Integer> head = node;
        Node<Integer> last = node;

        while(node != null){
            Utils.printList(head);
            Node<Integer> next = node.next;
            if(node.value < part){
                node.next = head;
                head = node;
            }else{
                last.next = node;
                node.next = null;

            }
            node = next;
        }
        last.next = null;

        return head;
    }

    public static Node<Integer> partitionv2(Node<Integer> node, int part){

        Node<Integer> head = node;
        Node<Integer> previous = node;
        node = node.next;

        while(node != null){
            Node<Integer> next = node.next;
            if(node.value < part){
                previous.next = node.next;
                node.next = head;
                head = node;
            }else{
                previous = node;
            }
            node = next;
        }
        return head;
    }
}
