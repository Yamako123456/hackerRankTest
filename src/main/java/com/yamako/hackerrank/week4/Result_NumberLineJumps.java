package com.yamako.hackerrank.week4;

public class Result_NumberLineJumps {
    /**
     * The first kangaroo starts at location x1 and moves at a rate of v1 meters per jump
     * The second kangaroo starts at location x2 and moves at a rate of v2 meters per jump
     *
     * @param x1 kanga 1 initial position
     * @param v1 kanga 1 speed
     * @param x2 kanga 2 initial position
     * @param v2 kanga 2 speed
     * @return YES if possible them at same position; otherwise, NO
     */
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
//        int ahead = x1 >= x2 ? x1 : x2;
//        int behind = x1 >= x2 ? x2 : x1;
//        int fast = v1 >= v2 ? v1 : v2;
//        int slow = v1 >= v2 ? v2 : v1;
        if ( x1 == x2)
            return "YES";
        if (x1 != x2 && v1 == v2)
            return  "NO";
        if ((x1 > x2 && v1 > v2) || (x2 > x1 && v2 > v2))
            return "NO";

        int diff = Math.abs(x1 - x2);
        int speedDiff = Math.abs(v2 - v1);
        return diff % speedDiff == 0 ? "YES" : "NO";
    }
}
