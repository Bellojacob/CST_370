// hw7_1.java - Part 1: Binary Search Tree
// Name: Jacob Bello
// ID: [Your Student ID Here]
// Date: [Submission Date]

import java.util.*;

class Node {
    int value;
    Node left, right;

    Node(int value) {
        this.value = value;
        this.left = this.right = null;
    }
}

public class hw7_1 {
    Node root;

    void add(int value) {
        root = addRecursive(root, value);
    }

    private Node addRecursive(Node node, int value) {
        if (node == null) return new Node(value);
        if (value < node.value) node.left = addRecursive(node.left, value);
        else node.right = addRecursive(node.right, value);
        return node;
    }

    void preOrder() {
        preOrder(root);
        System.out.println();
    }

    private void preOrder(Node node) {
        if (node == null) return;
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    void postOrder() {
        postOrder(root);
        System.out.println();
    }

    private void postOrder(Node node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    int height() {
        return height(root);
    }

    private int height(Node node) {
        if (node == null) return -1;
        return 1 + Math.max(height(node.left), height(node.right));
    }

    int countLeaves() {
        return countLeaves(root);
    }

    private int countLeaves(Node node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) return 1;
        return countLeaves(node.left) + countLeaves(node.right);
    }

    int countOneChildNodes() {
        return countOneChildNodes(root);
    }

    private int countOneChildNodes(Node node) {
        if (node == null) return 0;
        int count = 0;
        if ((node.left == null) != (node.right == null)) count = 1;
        return count + countOneChildNodes(node.left) + countOneChildNodes(node.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        hw7_1 tree = new hw7_1();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String[] cmd = sc.nextLine().split(" ");
            switch (cmd[0]) {
                case "add":
                    tree.add(Integer.parseInt(cmd[1]));
                    break;
                case "preOrder":
                    tree.preOrder();
                    break;
                case "postOrder":
                    tree.postOrder();
                    break;
                case "height":
                    System.out.println(tree.height());
                    break;
                case "countLeaves":
                    System.out.println(tree.countLeaves());
                    break;
                case "countOneChildNodes":
                    System.out.println(tree.countOneChildNodes());
                    break;
            }
        }
    }
}