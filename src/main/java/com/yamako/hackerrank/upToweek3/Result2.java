package com.yamako.hackerrank.upToweek3;

import java.util.*;

public class Result2 {
    public static String partitionArray(int k, List<Integer> numbers) {
        // Write your code here
        int len = numbers.size();
        if (len % k != 0)
            return "No";

        // Using lambda expression to sort by age
        numbers.sort((p1, p2) -> Integer.compare(p1, p2));
        Map<Integer, Integer> map = new HashMap<>();
        int duplicate = 0;
        for(Integer num : numbers) {
            if (map.get(num) == null)
                map.put(num, 1);
            else
                map.put(num, map.get(num) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > k)
                return "No";
        }


        return "Yes";
    }
}
