package com.yamako.hackerrank.upToweek3;

import java.util.Collections;
import java.util.List;

public class Result6 {
    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
//        String result = "";
        // Write your code here
        A.sort(Integer::compareTo);
//        System.out.println("A: " + A);
        Collections.sort(B, Collections.reverseOrder());
//        System.out.println("B: " + B.toString());

        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) + B.get(i) < k) {
                return "NO";
            }
        }
        return "YES";
    }
}
