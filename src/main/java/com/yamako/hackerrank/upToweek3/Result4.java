package com.yamako.hackerrank.upToweek3;

public class Result4 {
    public static int marsExploration(String s) {
        // Write your code here
        int count = 0;

        String sos = "SOS";
        for (int i = 0; i < s.length() - 2; i += 3) {
            String sub = s.substring(i, i + 3);
            if (!sub.equals(sos)) {
                for (int j = 0; j < 3; j++) {
                    if (sub.charAt(j) != sos.charAt(j)) {
                        count++;
                    }
                }
            }

        }
        return count;
    }
}
