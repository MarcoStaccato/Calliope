package com.staccato.cracking.linkedlists;

import com.staccato.cracking.linkedlists.setup.Node;
import com.staccato.cracking.linkedlists.setup.Utils;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Palindrome {

    public static void main(String[] args) {

        Node<Integer> node = Utils.getNodeInteger();
        Node<Integer> pal = Utils.getPalindromeNode();
        Node<Integer> even = Utils.getEvenPalindrome();


        Utils.printList(node);
//        System.out.println(isPalindrome(node));
        System.out.println(isPalindromev2(node));

        Utils.printList(pal);
//        System.out.println(isPalindrome(pal));
        System.out.println(isPalindromev2(pal));

        Utils.printList(even);
        System.out.println(isPalindromev2(even));
    }

    public static boolean isPalindrome(Node<Integer> node){
        Node<Integer> reversed = reverseList(node);

        while(node != null){
            if(reversed.value.equals(node.value)){
                node = node.next;
                reversed = reversed.next;
            }else{
                return false;
            }
        }
        return true;
    }

    public static Node<Integer> reverseList(Node<Integer> node){
        //copy head
        Node<Integer> head = null;

        while (node != null) {
            Node<Integer> copy = new Node<>(node.value);
            copy.next = head;
            head = copy;
            node = node.next;
        }
        return head;
    }

    public static boolean isPalindromev2(Node<Integer> node){

        Deque<Integer> stack = new ArrayDeque<>();

        Node<Integer> fast = node;

//        push half
        while(fast != null && fast.next != null){
            stack.push(node.value);
            node = node.next;
            fast = fast.next.next;
        }

        if(fast != null){ //list is odd size
            node = node.next;
        }

        System.out.println(Arrays.toString(stack.toArray()));

        while(node != null){
            if(!stack.pop().equals(node.value)){
                return false;
            }else{
                node = node.next;
            }
        }
        return true;
    }


}
