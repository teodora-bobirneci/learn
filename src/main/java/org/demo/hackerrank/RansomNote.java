package org.demo.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Teodora Bobirneci
 */
public class RansomNote {

    private static String canWriteRansomNote(String[] magazine, String[] ransom) {
        boolean canWriteRansomNote = true;

        if (ransom.length > magazine.length) {
            canWriteRansomNote = false;
        } else {
            HashMap<String, Integer> availableWords = buildAvailableWords(magazine);
            HashMap<String, Integer> requiredWords = buildAvailableWords(ransom);

            if (availableWords.keySet().containsAll(requiredWords.keySet())) {
                for (Map.Entry<String, Integer> entry : requiredWords.entrySet()) {
                    if (entry.getValue() > availableWords.get(entry.getKey())) {
                        canWriteRansomNote = false;
                        break;
                    }
                }
            } else {
                canWriteRansomNote = false;
            }
        }
        return canWriteRansomNote ? "Yes" : "No";
    }

    private static HashMap<String, Integer> buildAvailableWords(String[] wordList) {
        HashMap<String, Integer> dictionary = new HashMap<>();
        if (wordList == null || wordList.length == 0) {
            return dictionary;
        }

        for (String word : wordList) {
            if (dictionary.containsKey(word)) {
                dictionary.put(word, dictionary.get(word) + 1);
            } else {
                dictionary.put(word, 1);
            }
        }

        return dictionary;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for (int magazine_i = 0; magazine_i < m; magazine_i++) {
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for (int ransom_i = 0; ransom_i < n; ransom_i++) {
            ransom[ransom_i] = in.next();
        }

        System.out.print(canWriteRansomNote(magazine, ransom));
    }

}
