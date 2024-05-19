package com.yamako.hackerrank.upToweek3;

import java.util.List;

public class Result_SubarrayDivision2 {
    public static int birthday(List<Integer> s, int d, int m) {
        int options = 0;
        int theLastOne = s.size() - 1;
        theLastOne -= m;
        theLastOne += 1;

        for (int i = 0; i <= theLastOne; i++) {
            int sum = 0;
            for (int j = i ; j < s.size() && j < i + m; j++) {
                sum += s.get(j);
            }
            if (sum == d) {
                options++;
            }
        }

        return options;
    }
}
