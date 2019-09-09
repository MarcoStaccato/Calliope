package com.staccato.cake.stacks;

import java.util.Stack;

public class StaQueue {

    static Stack<String> stack1 = new Stack<>();
    static Stack<String> stack2 = new Stack<>();

    public static void main(String[] args) {

        StaQueue queue = new StaQueue();

//        queue.push();
    }

    public static void push(String string){
        if(stack2.isEmpty()){
            stack2.push(string);
            refill();
        }else{
            stack1.push(string);
        }

    }

    public static String pop(){
        if(stack2.isEmpty()){
            refill();
        }
        return stack2.pop();
    }

    private static void refill(){
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
    }
}
