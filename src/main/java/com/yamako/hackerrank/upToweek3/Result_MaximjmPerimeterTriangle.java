package com.yamako.hackerrank.upToweek3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class Result_MaximjmPerimeterTriangle {

    /**
     *
     * @param sticks
     * @return List<Integer> non-decreasing order
     *         construct non-degenerate triangle
     */
    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        List<Integer> badResult = Arrays.asList(-1);

        if (sticks == null) {
            return badResult;
        }
        sticks = sticks.stream().filter(x -> x > 0).collect(Collectors.toList());
        System.out.println(sticks);

        if (sticks.size() < 3) {
            return badResult;
        }

        sticks.sort(Integer::compareTo);
        System.out.println(sticks);

        Collections.reverse(sticks);
        System.out.println(sticks);

        int p1 = 0;
        int p2 = 1;
        int p3 = 2;

        while ( p3 < sticks.size()  && p2 < p3 && p1 < p2) {
            if ( !isDegenerate(sticks.get(p1), sticks.get(p2), sticks.get(p3)))
                break;
            p3++;
            if (p3 == sticks.size()) {
                p2++;
                if (p2 == sticks.size() - 1) {
                    p1++;
                    if (p1 == sticks.size() - 2) {
                        return badResult;
                    }
                    p2 = p1 + 1;
                }
                p3 = p2 +1;
            }
        }
        return Arrays.asList(sticks.get(p3), sticks.get(p2), sticks.get(p1));
    }

    public static boolean isDegenerate(int n1, int n2, int n3) {
        //riangle inequality theorem
        return n1 >= n2 + n3 || n2 >= n1 + n3 || n3 >= n1 + n2;
    }

}
