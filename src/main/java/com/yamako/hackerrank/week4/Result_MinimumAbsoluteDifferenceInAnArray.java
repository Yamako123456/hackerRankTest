package com.yamako.hackerrank.week4;

import java.util.Collections;
import java.util.List;

import java.lang.Integer;

public class Result_MinimumAbsoluteDifferenceInAnArray {
    /**
     *
     * @param arr
     * @return minimum absolute value between 2 elements in array
     */
    public static int minimumAbsoluteDifference(List<Integer> arr) {
        if (arr == null || arr.size() < 2) {
            return 0;
        }
        Collections.sort(arr);
        int result = Integer.MAX_VALUE;

        int p1 = 0;
        int p2 = 1;
        while (p2 < arr.size() && p1 < p2) {
            int diff = Math.abs(arr.get(p1) - arr.get(p2));
            if (diff < result) {
                result = diff;
            }
            p1++;
            p2++;
        }

        return result;
    }

}
