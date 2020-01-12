package com.staccato.cake.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MergeMeetingTimes {


    public static void main(String[] args) {

        Integer[][] input = {{0,1}, {3,5}, {4,8}, {10,12}, {9,10}};
        List<List<Integer>> testInput = new LinkedList<>();

        for (int i = 0; i < input.length; i++) {
            testInput.add(Arrays.asList(input[i]));
        }

        printList(testInput);
        List<List<Integer>> result = mergeMeetingTimes(testInput);
        printList(result);
    }

    public static List<List<Integer>> mergeMeetingTimes(List<List<Integer>> input){
        List<List<Integer>> result = new LinkedList<>();

        Collections.sort(input, (List<Integer> l1, List<Integer> l2) -> l1.get(0) - l2.get(0));
        List<Integer> previous = input.get(0);

        for(List<Integer> current : input){
            if(previous.get(1) >= current.get(0)){
                previous.set(1, current.get(1));
            }else{
                result.add(previous);
                previous = current;
            }
        }
        result.add(previous);
        return result;
    }


    private static void printList(List<List<Integer>> list){
        System.out.print("Array: {");
        for(List<Integer> item : list){
            System.out.print(item.toString() + " ");
        }
        System.out.print("}\n");
    }
}
