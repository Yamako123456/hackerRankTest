package com.yamako.hackerrank.week4;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class Result_LeftRotation {
    /**
     * A left rotation operation on an array of size n shifts each of the arrays's elements 1 unit to the left.
     * @param d is how many steps you rotate the list's element to left. circular
     * @param arr is list of integer
     * @return result list
     */
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        if (arr == null || arr.size() <= 1 || d == 0)
            return arr;
        d = d % arr.size();
        System.out.println(d);
        System.out.println(arr);
        LinkedList<Integer> list = new LinkedList<>(arr);
        for (int i = 0; i < d; i++) {
            int lastElem = list.removeFirst();
            list.addLast(lastElem);
        }

        return list;
    }
}
