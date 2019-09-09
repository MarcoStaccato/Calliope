package com.staccato.cake.arrays;

import java.util.*;

public class ClosestKPoints {

    static int[][] pointArray = {{1,2}, {1, 1}, {100, 100}, {1, 1}, {5, 0}, {6,1}};

    public static void main(String[] args) {

        List<List<Integer>> points = new LinkedList<>();

        for(int[] p : pointArray){
            List<Integer> point = new LinkedList<>();
            point.add(p[0]);
            point.add(p[1]);

            points.add(point);
        }

        Collections.sort(points, (List<Integer> l1, List<Integer> l2) -> getDistance(l1) - getDistance(l2));

//        get k elements
        int k =3;
        while(k-- > 0){
            System.out.println(Arrays.toString(points.remove(0).toArray()));
        }
        System.out.println("rest of array");

        points.stream().forEach(list -> System.out.println(Arrays.toString(list.toArray())));
    }

    private static int getDistance(List<Integer> input){
        return (int) getDistance(input.get(0), input.get(1));
    }

    private static double getDistance(int x, int y){
        return Math.sqrt((x*x) + (y*y));
    }





//    public static int[][] getClosestNodes(int[][] input, int k){
//        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
//        int[][] result = new int[k][2];
//
//        for(int i=0; i<input.length; i++){
//            int[] point = input[i];
//            map.put(getDistance(point[0], point[1]), Arrays.asList(input[i][0], input[i][1]));
//        }
//        for(int i=0; i<k; i++){
//            int key = map.firstKey();
//            result[i][0] = map.get(key).get(0);
//            result[i][1] = map.get(key).get(1);
//            map.remove(key);
//        }
//        for(int[] res : result){
//            System.out.println(Arrays.toString(res));
//        }
//        return result;
//    }
}
