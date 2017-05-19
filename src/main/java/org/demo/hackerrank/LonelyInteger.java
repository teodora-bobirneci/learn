package org.demo.hackerrank;

import java.util.Scanner;

/**
 * @author Teodora Bobirneci
 */
public class LonelyInteger {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int result = 0;
        for (int item : a) {
            result ^= item;
        }
        System.out.print(result);
    }
}
