package com.staccato.cake.graphs;

import com.staccato.cake.graphs.trees.Node;
import com.staccato.cake.graphs.trees.TreeBuilder;

public class SecondLargest {

    public static void main(String[] args) {
        Node balanced = TreeBuilder.buildBalancedTree();

        balanced.inorder();

        getSecondLargest(balanced);

        Node random = TreeBuilder.BuildUnBalancedTree();

        random.inorder();

        getSecondLargest(random);
    }

    public static Node getSecondLargest(Node root){

        Node right = root.right;
        Node previous = root;

        while(right.right != null){
            previous = right;
            right = right.right;
        }

        System.out.println(previous.value);
        return previous;

    }


}
