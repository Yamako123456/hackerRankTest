package com.yamako.hackerrank.week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static java.util.Collections.*;

public class Result_PickingNumbers {
    /**
     * find longest subarray where the absolute differenc between any two elements is less than or equals to 1;
     * @param a array of integer 0 < a[i] < 100
     * @return length of the longest subarray that meets the criterion
     */
    public static int pickingNumbers(List<Integer> a) {
        if (a == null || a.size() == 0)
            return 0;
        if (a.size() == 1)
            return 1;

        sort(a);
        System.out.println(a);
        List<Integer> lenthList = new ArrayList<>();
        int one = 0;
        int two = 1;
        int len = 1;
        while (two < a.size()) {
            if (Math.abs(a.get(two) - a.get(one)) <= 1) {
                len++;

            } else {
                lenthList.add(len);
                one = two;
                len = 1;
            }
            two++;
        }
        lenthList.add(len);
        if (lenthList.isEmpty())
            return 0;
        Optional<Integer> max = lenthList.stream().max(Integer::compareTo);
        return max.get();
    }

}
