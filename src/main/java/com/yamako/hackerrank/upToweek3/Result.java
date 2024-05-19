package com.yamako.hackerrank.upToweek3;

public class Result {

    public static String simpleCipher(String encrypted, int k) {
        String result = "";
        k = k % 26;
        char[] inArr = encrypted.toCharArray();
        char[] outArr = new char[inArr.length];

        for (int i = 0; i < inArr.length; i++) {
            if (inArr[i] - k  < 'A') {
                outArr[i] = ( char) ('Z' - ('A' -  (inArr[i] - k) - 1));
            } else {
                outArr[i] = (char) (inArr[i] - k);

            }
        }
        result = new String(outArr);
        return result;
    }

}
