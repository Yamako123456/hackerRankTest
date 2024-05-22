package com.yamako.hackerrank.extra;

import java.util.LinkedList;

public class CipherPractice {
    public static void main(String[] args) {
        CipherPractice obj = new CipherPractice();
        String input = "ABC";
        int k = 3;
        System.out.println(obj.cyphering(input, k));
    }

    public String cyphering(String input, int shift) {
        String output = "";

        int myA = 'A';
        int myZ = 'Z';

        LinkedList<Character> alphabet = new LinkedList<>();
        for (int i = myA; i <= myZ; i++) {
            alphabet.add((char) i);
        }

        for (int i = 0; i < shift; i++) {
            char ch = alphabet.removeLast();
            alphabet.addFirst(ch);
        }
        for (int i = 0; i < input.length();  i++) {
            char ch = input.charAt(i);
            output = output + alphabet.get(ch - myA);
        }

        return output;
    }

}
