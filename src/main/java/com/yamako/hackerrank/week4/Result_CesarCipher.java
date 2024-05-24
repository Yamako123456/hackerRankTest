package com.yamako.hackerrank.week4;

import java.util.LinkedList;

public class Result_CesarCipher {

    /**
     * shift only letters to the right and circular manner. That means cipher cylinder shift to the left.
     * @param s text to encrypt no space
     * @param k how many posiion to shift to the right in ASCII
     * @return encrypted text
     */
    public static String caesarCipher(String s, int k) {
        if (k == 0 || s == null || s.length() < 2 || s.length() == k ) {
            return s;
        }
        char aCh = 'a';
        char zCh = 'z';
        char ACh = 'A';
        char ZCh = 'Z';
        LinkedList<Character> upper = new LinkedList();
        LinkedList<Character> lower = new LinkedList();

        for (char i = ACh; i <= ZCh; i++) {
            upper.add(i);
        }
        for (char i = aCh; i <= zCh; i++) {
            lower.add(i);
        }

        for (int i = 0; i < k; i++) {
            char first =  upper.removeFirst();
            upper.addLast(first);

        }
        for (int i = 0; i < k; i++) {
            char first = lower.removeFirst();
            lower.addLast(first);
        }

        String result = "";
        for (char ch : s.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                result += upper.get(ch - 'A');
            } else if (ch >= 'a' && ch <= 'z') {
                result += lower.get(ch - 'a');
            } else {
                result += ch;
            }
        }


        return result;
    }
}
