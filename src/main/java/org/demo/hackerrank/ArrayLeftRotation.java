package org.demo.hackerrank;

import java.util.Scanner;

/**
 * @author Teodora Bobirneci
 */
public class ArrayLeftRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        rotate(a, k);
    }

    private static void rotate(int[] a, int k) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[(i + k) % a.length] + " ");
        }
    }
}
