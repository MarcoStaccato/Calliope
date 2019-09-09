package com.staccato.cracking.linkedlists.setup;

public class Utils {


    public static Node<Integer> getNodeInteger(){
        Node<Integer> node = new Node<>(1, null);
        setupInt(node);
        return node;
    }

    public static Node<Character> getCharNode(){
        Node<Character> node = new Node<>('a', null);
        setUpChar(node);
        return node;
    }

    public static Node<Integer> getPalindromeNode(){
        return setUpPalindrome();
    }

    public static Node<Integer> getEvenPalindrome(){
        return setUpEvenPalindrome();
    }

    private static void setupInt(Node<Integer> node){
        node.next = new Node(
                new Integer(3),
                new Node(new Integer(5),
                        new Node(new Integer(8),
                                new Node(new Integer(5),
                                        new Node(new Integer(10),
                                                new Node(new Integer(2),
                                                        new Node(new Integer(1),
                                                                new Node(new Integer(4),
                                                                        new Node(new Integer(6),
                                                                                new Node(new Integer(1),
                                                                                        new Node(new Integer(14),
                                                                                                new Node(new Integer(6), null))))))))))));
    }

    private static void setUpChar(Node<Character> node){
        node.next = new Node(
                Character.valueOf('b'),
                new Node(Character.valueOf('c'),
                        new Node(Character.valueOf('d'),
                                new Node(Character.valueOf('e'),
                                        new Node(Character.valueOf('f'), null)))));
    }

//    private static Node<Integer> setUpPalindrome(){
//        return new Node<Integer>(0, new Node<Integer>(1, new Node<Integer>(2, new Node<Integer>(1, new Node<Integer>(0, null)))));
//    }

    private static Node<Integer> setUpPalindrome(){
        return new Node<Integer>(3, new Node<Integer>(5, new Node<Integer>(3, new Node<Integer>(5, null))));
    }

    private static Node<Integer> setUpEvenPalindrome(){
        return new Node<Integer>(1, new Node<Integer>(2, new Node<Integer>(0, new Node<Integer>(0, new Node<Integer>(2, new Node<Integer>(1, null))))));
    }

    public static void printList(Node node){
        System.out.print("[");
        int counter = 30;
        while(node.next != null & --counter > 0){
            System.out.print(node.value.toString() + ", ");
            node = node.next;
        }
        System.out.println(node.value.toString() + "]");
    }

    public static void printNode(Node n){
        System.out.println("Current value: [" + n.value.toString() + "]");
    }

    public static void printNode(String s, Node n){
        System.out.print(s);
        printNode(n);
    }

}
