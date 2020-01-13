package com.staccato.cake.arrays;

public class IndexOf {

    public static void main(String[] args) {
        String s = "lrnkbldxguzgcseccinlizyogwqzlifxcthdgmanjztlt";
        String x = "an";

        System.out.println(indexOf(s, x));
    }

    public static int indexOf(String s, String x) {
        int xIndex = 0;
        char lastX = x.charAt(0);

        for(int i=0; i<s.length(); i++){
            char curr = s.charAt(i);
            if(curr == lastX){
                if(xIndex == x.length()-1) return i - xIndex;
                lastX = x.charAt(++xIndex);
            }else{
                lastX = x.charAt(0);
                xIndex = 0;
                if(curr == lastX){
                    if(xIndex == x.length()-1) return i - xIndex;
                    lastX = x.charAt(++xIndex);
                }
            }
        }
        int back = checkBack(s, x);
        return back > -1 ? back: -1;
    }


    public static int checkBack(String s, String x){
        int xIndex = x.length()-1;
        char lastX = x.charAt(x.length()-1);
        for(int i=s.length()-1; i>=0; i--){
            char curr = s.charAt(i);
            if(curr == lastX){
                if(xIndex == 0) return i;
                lastX = x.charAt(--xIndex);
            }else{
                lastX = x.charAt(x.length()-1);
                xIndex = x.length()-1;
                if(curr == lastX){
                    if(xIndex == 0) return i;
                    lastX = x.charAt(--xIndex);
                }
            }
        }
        return -1;
    }

}
