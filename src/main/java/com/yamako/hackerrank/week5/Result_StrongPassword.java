package com.yamako.hackerrank.week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Result_StrongPassword {
    /** Strong password is:
     *Its length is at least 6
     * It contains at least one digit.
     * It contains at least one lowercase English character.
     * It contains at least one uppercase English character.
     * It contains at least one special character. The special characters are: !@#$%^&*()-+
     * @param n
     * @param password
     * @return Return the minimum number of characters to make the password strong
     */
    public static int minimumNumber(int n, String password) {
        System.out.println(password);
        int len = password.length();
        if ( password == null || len ==0 ) {
            return 6;
        }

        int result = 0;
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_characters = "!@#$%^&*()-+";
        boolean hasLower = password.chars().anyMatch(ch -> lower_case.indexOf(Character.toString(ch))  >= 0 );
        System.out.println("lower: " + hasLower);
        if (! hasLower) {
            result++;
            len++;
        }
        boolean hasUpper = password.chars().anyMatch(ch -> upper_case.indexOf(Character.toString(ch))  >= 0 );
        System.out.println("upper: " + hasUpper);
        if (! hasUpper) {
            result++;
            len++;
        }

        boolean hasDigit = password.chars().anyMatch(ch -> numbers.indexOf(Character.toString(ch))  >= 0 );
        System.out.println("Digit: " + hasDigit);
        if (!hasDigit) {
            result++;
            len++;
        }

        boolean hasSpecial = password.chars().anyMatch(ch -> special_characters.indexOf(Character.toString(ch))  >= 0 );
        System.out.println("special: " + hasSpecial);
        if (! hasSpecial) {
            result++;
            len++;
        }
        int less = 6 - len;
        if (less > 0)
            result += less;

        return result;
    }

}
