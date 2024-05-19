package com.yamako.hackerrank.upToweek3;


import java.util.List;

public class Result3 {
    public static int findMedian(List<Integer> arr) {
        // Write your code here
        arr.sort(Integer::compareTo);
        //arr.sort((p1, p2) -> Integer.compare(p1, p2));
        int mid = arr.size() / 2;
        return arr.get(mid);
    }
}
