package com.staccato.cake.graphs.trees;

public class Node {

    public int value;

    public Node left;

    public Node right;

    public Node(int value){
        this.value = value;
    }

    public void add(int value){
        add(this, value);
    }

    private Node add(Node current, int val){

        if(current == null){
            return new Node(val);
        }

        if(val < current.value){
            current.left = add(current.left, val);
        }else if(val > current.value){
            current.right = add(current.right, val);
        }else {
            return current;
        }

        return current;
    }


    public void inorder(){
        inorder(this);
        System.out.println("");
    }

    private void inorder(Node node){
        if(node == null) return;
        inorder(node.left);
        System.out.print(node.value + ", ");
        inorder(node.right);
    }
}
