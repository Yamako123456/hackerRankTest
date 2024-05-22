package com.yamako.hackerrank.week4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Result_SepareateTheNumbers {
    /**
     * A numeric string s is beautiful if it can be split into a sequence of two or more positive integers,
     *
     * satisfying the following conditions:
     *  1. Increasing by 1
     *  2. No leading zero.
     *  3. Order of characters is unchanged
     *
     * @param s is numeric string
     * @result
     *          If it is beautiful, print YES x, where x is the first number of the increasing sequence.
     *          If there are multiple such values of x, choose the smallest.
     *          Otherwise, print NO.
     */
    public static void separateNumbers(String s) {

        if (s == null || s.length() < 2 || s.charAt(0) == '0') {
            System.out.println("NO");
            return;
        }
        Set<Long> zeroIndex = new HashSet();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                zeroIndex.add((long)i);
            }
        }
        List<Long> numList = new ArrayList<>();
        int initialLen = s.length() / 2; // Starts with the longest lenth.

        Long num = Long.parseLong(s.substring(0, initialLen));
        numList.add(num);

        num += 1;
        int p = initialLen;
        int len = num.toString().length();

        try{
            OUTER:
            while (initialLen > 0) {
                INNER:
                while (p < s.length()) {
                    String str = s.substring(p, p + len);
                    if (str.charAt(0) == '0') {
                        initialLen--;
                        if (initialLen == 0) {
                            System.out.println("NO");
                            return;
                        }
                        numList.clear();
                        num = Long.parseLong(s.substring(0, initialLen));
                        numList.add(num);
                        num += 1;
                        len = num.toString().length();
                        p = initialLen;

                        continue OUTER;
                    }
                    Long actual = Long.parseLong(str);

                    if ( !actual.equals(num)) {
                        initialLen--;
                        if (initialLen == 0) {
                            System.out.println("NO");
                            return;
                        }
                        numList.clear();
                        num = Long.parseLong(s.substring(0, initialLen));
                        numList.add(num);
                        num += 1;
                        len = num.toString().length();
                        p = initialLen;

                        continue OUTER;
                    }


                    numList.add(num);
                    p += len;
                    num += 1;
                    len = num.toString().length();
                }

                if ( p == s.length() && !numList.isEmpty() ) {
                    System.out.println("YES " + numList.get(0));
                    return;
                } else {
                    initialLen--;
                    if (initialLen == 0) {
                        System.out.println("NO");
                        return;
                    }
                    numList.clear();
                    num = Long.parseLong(s.substring(0, initialLen));
                    numList.add(num);
                    num += 1;
                    len = num.toString().length();
                    p = initialLen;
                }
            }
        }catch(Exception e) {
            //System.out.println("error at " + s);
            //System.out.println("YES " + numList.get(0));
            System.out.println("NO");
            return;
        }
        System.out.println("NO");
    }
}




