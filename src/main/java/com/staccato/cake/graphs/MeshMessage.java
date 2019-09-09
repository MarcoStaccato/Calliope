package com.staccato.cake.graphs;

import java.util.*;

public class MeshMessage {

    static Map<String, String[]> network = new HashMap<String, String[]>() {{
        put("Min", new String[]{"William", "Jayden", "Omar"});
        put("William", new String[]{"Min", "Noam"});
        put("Jayden", new String[]{"Min", "Amelia", "Ren", "Noam"});
        put("Ren", new String[]{"Jayden", "Omar"});
        put("Amelia", new String[]{"Jayden", "Adam", "Miguel"});
        put("Adam", new String[]{"Amelia", "Miguel", "Sofia", "Lucas"});
        put("Miguel", new String[]{"Amelia", "Adam", "Liam", "Nathan"});
        put("Noam", new String[]{"Nathan", "Jayden", "William"});
        put("Omar", new String[]{"Ren", "Min", "Scott"});
    }};

    public static void main(String[] args) {

        getShortestRoute(network, "Min", "Adam");
        getShortestRouteV2(network, "Min", "Adam");

    }

    static void getShortestRoute(Map<String, String[]> network, String source, String recipient) {

        Queue<String> pending = new LinkedList<>();

        Set<String> visited = new HashSet<>();

        Map<String, String> paths = new HashMap<>();

        boolean found = false;

        pending.add(source);

        paths.put(source, null);

        while(!pending.isEmpty() && !found){

            String current = pending.poll();
            visited.add(current);

            String[] neighbours = network.get(current);

            if(neighbours == null) continue;

            for(String n : neighbours){

                if(!visited.contains(n)){
                    pending.add(n);
                    paths.put(n, current);
                }

                if(recipient.equals(n)){
                    found = true;
                    break;
                }
            }
        }

        printPath(paths, recipient);
    }


    static void getShortestRouteV2(Map<String, String[]> network, String source, String recipient) {

        if(!network.containsKey(source) || !network.containsKey(recipient)){
            throw new IllegalArgumentException("Source and recipient must exist on network");
        }

        Queue<String> pending = new LinkedList<>();

        Map<String, String> paths = new HashMap<>();

        paths.put(source, null);

        pending.add(source);

        //create adjacency list
        while(!pending.isEmpty()){

            String current = pending.poll();
            String[] neighbours = network.get(current);

            if(neighbours == null) continue;

            for(String n : neighbours) {
                if(!paths.containsKey(n)){
                    pending.add(n);
                    paths.put(n, current);
                }
            }
            if(recipient.equals(current)){
                printPath(paths, recipient);
                break;
            }
        }

        if(!paths.containsKey(recipient)){
            System.out.println("Could not find any path to recipient");
        }
    }


    public static void printPath(Map<String, String> paths, String recipient){

        List<String> shortPath = new LinkedList<>();

        String previous = paths.get(recipient);

        shortPath.add(recipient);

        while(previous != null){
            shortPath.add(previous);
            previous = paths.get(previous);
        }

        Collections.reverse(shortPath);

        System.out.println(Arrays.toString(shortPath.toArray(new String[0])));
    }



}