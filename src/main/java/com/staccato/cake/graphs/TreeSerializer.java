package com.staccato.cake.graphs;

import com.staccato.cake.graphs.trees.Node;
import com.staccato.cake.graphs.trees.TreeBuilder;

public class TreeSerializer {

    private static String NULL_VALUE = "NULL";

    private static int counter = 0;

    public static void main(String[] args) {

        Node balanced = TreeBuilder.buildBalancedTree();
        balanced.preorder();

        String ser = serialize(balanced);
        System.out.println(ser);

        Node node = deSerialize(ser);
        node.preorder();

        System.out.println("======Random======");

        Node random = TreeBuilder.BuildUnBalancedTree();
        random.preorder();

        String randomSer = serialize(random);
        System.out.println(randomSer);

        Node randNode = deSerialize(randomSer);
        randNode.preorder();
    }

    public static String serialize(Node node){

        if(node == null){
            return NULL_VALUE + ",";
        }

        String serialized = node.value + ",";
        serialized += serialize(node.left);
        serialized += serialize(node.right);

        return serialized;
    }

    public static Node deSerialize(String values){
        String[] valueArray = values.split(",");
        Node result = deSerialize(valueArray);
        counter = 0;
        return result;
    }

    private static Node deSerialize(String[] values){
        if(NULL_VALUE.equals(values[counter])){
            counter++;
            return null;
        }

        Node node = new Node(Integer.valueOf(values[counter++]));
        node.left = deSerialize(values);
        node.right = deSerialize(values);

        return node;
    }
}
