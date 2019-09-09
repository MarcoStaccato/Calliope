package com.staccato.cake.graphs;

import com.staccato.cake.graphs.trees.Node;
import com.staccato.cake.graphs.trees.TreeBuilder;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class SuperBalancedTree {

    public static void main(String[] args) {

        Node balanced = TreeBuilder.buildBalancedTree();
        Node unbalanced = TreeBuilder.BuildUnBalancedTree();

        System.out.println(isTreeBalanced(balanced));
        System.out.println("-----------");
        System.out.println(isTreeBalanced(unbalanced));

    }

    public static boolean isTreeBalanced(Node root){

        if(root == null) return true; // no leafs, superbalanced

        Stack<NodeDepth> stack = new Stack<>();
        List<Integer> lengths = new LinkedList<>();

        stack.push(new NodeDepth(root, 1));

        while(!stack.isEmpty()){

            NodeDepth nodeDepth = stack.pop();
            Node current = nodeDepth.node;

            System.out.println(current.value + " -> " + nodeDepth.depth);

            if(current.left != null){
                stack.push(new NodeDepth(current.left, nodeDepth.depth + 1));
            }

            if(current.right != null){
                stack.push(new NodeDepth(current.right, nodeDepth.depth + 1));
            }

            if(current.right == null && current.left == null){
                if(!lengths.contains(nodeDepth.depth)){
                    lengths.add(nodeDepth.depth);
                }
                if(lengths.size() > 2){
                    return false;
                }
            }
        }

        if(lengths.size() < 3){
            return true;
        }
        return false;
    }

    static class NodeDepth{
        Node node;
        int depth;

        NodeDepth(Node node, int depth){
            this.node = node;
            this.depth = depth;
        }
    }
}
