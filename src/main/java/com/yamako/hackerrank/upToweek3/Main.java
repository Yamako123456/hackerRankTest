package com.yamako.hackerrank.upToweek3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        String input = "ABC";
        int j = 10;
//        System.out.format("j = %d\n", j);
        int k = 1;
//        System.out.format("k = %d\n", k);

        String str1 = "10101";
        String str2 = "00101";

        List<Integer> A = Arrays.asList(1, 1, 1, 2, 3, 5);
//        System.out.format("A = %s\n", A.toString());

//        List<Integer> B = Arrays.asList(7, 8, 9);
//        System.out.format("B = %s\n", B.toString());

//        System.out.println(Result_MigratoryBirds.migratoryBirds(A));
        System.out.println(Result_MaximjmPerimeterTriangle.maximumPerimeterTriangle(A));

        System.out.println();
    }
}