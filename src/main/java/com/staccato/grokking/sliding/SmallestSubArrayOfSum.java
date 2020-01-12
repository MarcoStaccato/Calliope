package com.staccato.grokking.sliding;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SmallestSubArrayOfSum {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(3, 4, 1, 1, 6));

        int result = getSmallSubarraysOfSum(list, 8);
        System.out.println(result);
    }

    private static int getSmallSubarraysOfSum(List<Integer> input, int targetSum){
        int minLen = Integer.MAX_VALUE;
        int leftIndex = 0;
        int subarraySum = 0;

        for(int i = 0; i<input.size(); i++){
            if(input.get(i) > targetSum) return 1;

            subarraySum = subarraySum + input.get(i);

            while(subarraySum >= targetSum){
                minLen = Math.min(minLen, i-leftIndex + 1);
                subarraySum = subarraySum - input.get(leftIndex);
                leftIndex++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
