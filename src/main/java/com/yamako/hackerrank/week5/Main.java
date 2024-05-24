package com.yamako.hackerrank.week5;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s = "aZzzzzzzzzzzzzzzzzzzzzzzzzzzz";
        List<Integer> A  = Arrays.asList(10, 20, 300,  32, 40, 50, 63, 166);
        List<Integer> B  = Arrays.asList(8, 27, 1, 65, 17, 6, 32, 6,13, 68, 84, 4, 34, 49 );
        int k = 2;
        int t = 3;

        System.out.println(Result_StrongPassword.minimumNumber(s.length(), s));


    }
}
