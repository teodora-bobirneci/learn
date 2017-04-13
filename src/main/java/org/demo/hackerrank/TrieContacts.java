package org.demo.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Teodora Bobirneci
 */
public class TrieContacts {

    static class Node {
        char c;
        HashMap<Character, Node> successors = new HashMap<>();
        int completeCount = 0;

        Node(Character c) {
            this.c = c;
        }
    }

    private static Node root = new Node('*');

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int a0 = 0; a0 < n; a0++) {
            String op = in.next();
            String contact = in.next();

            switch (op) {
                case "add":
                    add(contact.toCharArray(), root);
                    break;
                case "find":
                    System.out.println(find(contact.toCharArray(), root));
                    break;
                default:
                    throw new IllegalArgumentException("Unknown operation");
            }
        }
    }

    private static void add(char[] contact, Node node) {
        if (contact == null || contact.length == 0 || node == null) return;

        char c = contact[0];
        if (!node.successors.containsKey(c)) {
            node.successors.put(c, new Node(c));
        }
        node.successors.get(c).completeCount++;
        add(Arrays.copyOfRange(contact, 1, contact.length), node.successors.get(c));
    }

    private static int find(char[] contact, Node node) {
        if (contact.length == 0) return node.completeCount;
        char c = contact[0];
        if (node.successors.containsKey(c))
            return find(Arrays.copyOfRange(contact, 1, contact.length), node.successors.get(c));
        else return 0;
    }

}

