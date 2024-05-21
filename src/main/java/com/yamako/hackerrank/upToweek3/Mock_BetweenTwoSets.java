package com.yamako.hackerrank.upToweek3;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Mock_BetweenTwoSets {

    /**
     * there will abe two arrays of integers. determine all integers that satisy the foloowing to conditions.
     * 1. the elements of the first array are all factores of the integer being considred : x
     * 2. the integer being considered: x is a factor of all elements of the second array
     * These numbers are referred to as being between the two arrays.
     * @param a
     * @param b
     * x: a.get(i) % x == 0 && x % b.get(j) == 0
     *
     * @return How many such numbers ("between the two arrays") exist.
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int count = 0;

        if (a == null || b == null || a.size() != b.size()) {
            return 0;
        }

        Optional<Integer> minBOptional = b.stream().min(Comparator.naturalOrder());
        int minB = minBOptional.get();
        System.out.println("minB is " + minB);

        OUTER:
        for (int x = 1; x <= minB; x++) {
            for (int j = 0; j < b.size(); j++) {
                if ( b.get(j) % x != 0)
                    continue OUTER;

            }
            for (int j = 0; j < a.size(); j++) {
                if ( x % a.get(j) != 0 )
                    continue OUTER;

            }
            System.out.println("x is " + x);

            count++;
        }
        return count;
    }
}
