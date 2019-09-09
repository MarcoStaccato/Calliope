package com.staccato.cake.graphs.trees;

import java.util.concurrent.ThreadLocalRandom;

public class TreeBuilder {

    public static Node buildBalancedTree(){
        Node root = new Node(6);

        root.add(4);
        root.add(8);
        root.add(3);
        root.add(5);
        root.add(7);
        root.add(9);

        return root;

    }

    public static Node BuildUnBalancedTree(){
        Node root = new Node(6);

        for (int i = 0; i < 14; i++) {
            root.add(ThreadLocalRandom.current().nextInt(20));
        }

        return root;
    }

}
