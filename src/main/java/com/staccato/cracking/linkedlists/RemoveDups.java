package com.staccato.cracking.linkedlists;

import com.staccato.cracking.linkedlists.setup.Node;
import com.staccato.cracking.linkedlists.setup.Utils;

import java.util.HashSet;

public class RemoveDups {

    public static void main(String[] args) {

        Node<Integer> node = Utils.getNodeInteger();
        Utils.printList(node);

        deleteDups(node);
        Utils.printList(node);

//        deleteDupsv2(node);
//        Utils.printList(node);


    }
    //extra hash set
    public static Node<Integer> deleteDups(Node<Integer> node){
        HashSet<Integer> set = new HashSet<>();
        Node<Integer> result = node;
        Node<Integer> previous = node;
        Node<Integer> current = node.next;

        set.add(node.value);

        while(current != null){
            if(set.contains(current.value)){
                previous.next = current.next;
            }else{
                set.add(current.value);
            }
            previous = current;
            current = current.next;
        }
        return result;
    }

    //no extra space
    public static void deleteDupsv2(Node<Integer> node){
        Node<Integer> current = node.next;

        while(current != null){ //get current value

            Node<Integer> auxHead = node;
            Node<Integer> prevHead = node;

            Integer value = current.value;
            boolean found = false;

            while(auxHead != null){ //check the whole list
                if(auxHead.value.equals(value)){
                    if(found){
                        prevHead.next = auxHead.next;
                    }else{
                        found = true;
                    }
                }
                prevHead = auxHead;
                auxHead = auxHead.next;
            }
            current = current.next;
        }
    }
}
