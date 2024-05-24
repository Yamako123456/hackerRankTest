package com.yamako.hackerrank.week5;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Result_MaxMin {
    /**
     * Create array of length k out of input array such that its unvairness is minimized.
     * @param k
     * @param arr - zero or positive integer; element is not unique
     * @return  the minimum possible unfairness which is max - min
     */
    public static int maxMin(int k, List<Integer> arr) {
        if (arr == null || arr.size() < k)
            return 0;
        Collections.sort(arr);
        int p1 = 0;
        int p2 = k - 1;
        int min = Integer.MAX_VALUE;

        while (p2 < arr.size() && p1 < p2) {
            int diff = arr.get(p2) - arr.get(p1);
            if (diff < min) {
                min = diff;
            }

            p1++;
            p2++;
        }


        return min;
    }
}
