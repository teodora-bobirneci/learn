package org.demo.hackerrank;

import java.util.Scanner;

/**
 * @author Teodora Bobirneci
 */
public class Fibonacci {

    private static long[] memo;

    private static long fibonacci(int n) {
        if (n <= 2) {
            return memo[n];
        }
        if (memo[n] != 0)
            return memo[n];
        memo[n - 1] = fibonacci(n - 1);
        memo[n - 2] = fibonacci(n - 2);
        return memo[n - 1] + memo[n - 2];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        memo = new long[n + 1];
        memo[0] = 0L;
        memo[1] = 1L;
        memo[2] = 1L;
        scanner.close();
        System.out.println(fibonacci(n));
    }

}
