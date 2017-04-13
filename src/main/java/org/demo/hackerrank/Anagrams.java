package org.demo.hackerrank;

import java.util.Scanner;

/**
 * @author Teodora Bobirneci
 */
public class Anagrams {

    private static final int NO_OF_LETTERS = 26;

    private static int numberNeeded(String first, String second) {
        int[] charCountFirst = characterCount(first);
        int[] charCountSecond = characterCount(second);

        return delta(charCountFirst, charCountSecond);
    }

    private static int[] characterCount(String s) {
        int[] charCount = new int[NO_OF_LETTERS];

        for (char c : s.toCharArray()) {
            charCount[((int) c) - 'a'] += 1;
        }

        return charCount;
    }

    private static int delta(int[] charCountFirst, int[] charCountSecond) {
        int count = 0;

        for (int i = 0; i < charCountFirst.length; i++) {
            count += Math.abs(charCountFirst[i] - charCountSecond[i]);
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
