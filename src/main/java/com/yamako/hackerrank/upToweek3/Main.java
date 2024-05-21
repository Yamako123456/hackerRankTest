package com.yamako.hackerrank.upToweek3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        String input = "ABC";
        int j = 7;
//        System.out.format("j = %d\n", j);
        int k = 4;
//        System.out.format("k = %d\n", k);

        String str1 = "10101";
        String str2 = "00101";

        int[] a  = new int[]{ 2, 3, 5, 1, 4};
        int n = a.length;

        List<Integer> A = Arrays.asList(2, 6);
//        System.out.format("A = %s\n", A.toString());

        List<Integer> B = Arrays.asList(24, 36);
//        System.out.format("B = %s\n", B.toString());

        System.out.println("result is " + Mock_BetweenTwoSets.getTotalX(A, B));


        System.out.println();
    }
}