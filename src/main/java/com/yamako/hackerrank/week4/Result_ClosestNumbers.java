package com.yamako.hackerrank.week4;
import java.util.*;

public class Result_ClosestNumbers {
    /**
     * which pair or pairs of elements have the smallest absolute difference between them.
     * @param arr
     * @return
     */
    public static List<Integer> closestNumbers(List<Integer> arr) {
        Collections.sort(arr);
        int min = Integer.MAX_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.size() - 1; i++) {
            int diff = Math.abs(arr.get(i) - arr.get(i + 1));
            if (diff < min) {
                min = diff;
            }
            map.put(i, diff);
        }
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == min) {
                result.add(arr.get(entry.getKey()));
                result.add(arr.get(entry.getKey() + 1));
            }

        }

        return result;
    }
}
