package org.demo.hackerrank;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Teodora Bobirneci
 */
public class Brackets {
    private static Character[][] allowedBrackets = {{'(', ')'}, {'[', ']'}, {'{', '}'},};

    private static boolean isBalanced(String expression) {
        Stack<Character> brackets = new Stack<>();

        for (Character c : expression.toCharArray()) {
            if (isOpenBracket(c)) {
                brackets.push(c);
            } else {
                if (brackets.empty()) {
                    return false;
                }
                if (!matches(c, brackets.pop())) {
                    return false;
                }
            }
        }
        if (!brackets.isEmpty())
            return false;
        return true;
    }

    private static boolean matches(Character bracket, Character stackTop) {
        for (Character[] pair : allowedBrackets) {
            if (stackTop.equals(pair[0])) {
                return bracket.equals(pair[1]);
            }
        }
        return false;
    }

    private static boolean isOpenBracket(Character c) {
        for (Character[] pair : allowedBrackets) {
            if (c.equals(pair[0])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println((isBalanced(expression)) ? "YES" : "NO");
        }
    }


}
