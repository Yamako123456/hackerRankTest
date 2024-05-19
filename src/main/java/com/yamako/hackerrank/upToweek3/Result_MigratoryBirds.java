package com.yamako.hackerrank.upToweek3;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Result_MigratoryBirds {
    public static int migratoryBirds(List<Integer> arr) {
            Map<Integer, Integer> map = new TreeMap<>();
            for (int type: arr) {
                if (map.containsKey(type))
                    map.put(type, map.get(type) + 1);
                else
                    map.put(type, 1);
            }
            int maxVal = 0;
            int maxKey = 0;
            //Map.Entry<Integer, Integer> maxEntry = map.entrySet().stream().max(Map.Entry.comparingByValue()).get();
            for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
                if (entry.getValue() > maxVal) {
                    maxVal = entry.getValue();
                    maxKey = entry.getKey();
                }
            }
            return maxKey;
    }
}
