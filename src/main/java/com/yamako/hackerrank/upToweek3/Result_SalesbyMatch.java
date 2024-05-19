package com.yamako.hackerrank.upToweek3;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result_SalesbyMatch {
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int pairs = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int code: ar) {
            if (map.get(code) == null)
                map.put(code, 1);
            else
                map.put(code, map.get(code) + 1);
        }
        for (Map.Entry<Integer, Integer> entry:  map.entrySet()) {
            int value = entry.getValue();
            pairs += value / 2;
        }

        return pairs;
    }
}
