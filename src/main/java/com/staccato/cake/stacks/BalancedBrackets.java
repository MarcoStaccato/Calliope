package com.staccato.cake.stacks;

import java.util.*;

public class BalancedBrackets {

    public static void main(String[] args) {
        String test1 = "{ [ ] ( ) }";
        String test2 = "{ [ ( ] ) }";

        System.out.println(isBalanced(test1));
        System.out.println(isBalanced(test2));

    }

    public static boolean isBalanced(String input){

        String openString  = "([{";
        String closeString = ")]}";
        Set<Character> open  = new LinkedHashSet<>();
        Set<Character> close = new LinkedHashSet<>();
        open.addAll(Arrays.asList('(', '[', '{'));
        close.addAll(Arrays.asList(')', ']', '}'));

        Stack<Character> stack = new Stack<>();

        for(char c : input.toCharArray()){
            if(open.contains(c)){
                stack.push(c);
            }
            if(close.contains(c)){
                if(stack.isEmpty()){
                    return false;
                }else if(openString.indexOf(stack.peek()) == closeString.indexOf(c)){
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }
}
