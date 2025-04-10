// hw7_2.java - Part 2: Binary Tree
// Name: Jacob Bello
// ID: [Your Student ID Here]
// Date: [Submission Date]

import java.util.*;

class TreeNode {
    int value;
    TreeNode left, right;

    TreeNode(int value) {
        this.value = value;
        this.left = this.right = null;
    }
}

public class hw7_2 {
    TreeNode root;

    public hw7_2(int rootValue) {
        root = new TreeNode(rootValue);
    }

    void append(int value) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            if (curr.left == null) {
                curr.left = new TreeNode(value);
                break;
            } else queue.add(curr.left);
            if (curr.right == null) {
                curr.right = new TreeNode(value);
                break;
            } else queue.add(curr.right);
        }
    }

    void preOrder() {
        preOrder(root);
        System.out.println();
    }

    private void preOrder(TreeNode node) {
        if (node == null) return;
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    void inOrder() {
        inOrder(root);
        System.out.println();
    }

    private void inOrder(TreeNode node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    void postOrder() {
        postOrder(root);
        System.out.println();
    }

    private void postOrder(TreeNode node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    void levelOrder() {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            System.out.print(curr.value + " ");
            if (curr.left != null) queue.add(curr.left);
            if (curr.right != null) queue.add(curr.right);
        }
        System.out.println();
    }

    int height() {
        return height(root);
    }

    private int height(TreeNode node) {
        if (node == null) return -1;
        return 1 + Math.max(height(node.left), height(node.right));
    }

    boolean isBST() {
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBST(TreeNode node, int min, int max) {
        if (node == null) return true;
        if (node.value <= min || node.value >= max) return false;
        return isBST(node.left, min, node.value) && isBST(node.right, node.value, max);
    }

    void findFirstNode() {
        TreeNode first = findFirstNode(root);
        System.out.println(first != null ? first.value : "");
    }

    private TreeNode findFirstNode(TreeNode node) {
        if (node == null) return null;
        while (node.left != null) node = node.left;
        return node;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rootValue = Integer.parseInt(sc.nextLine());
        hw7_2 tree = new hw7_2(rootValue);
        int commands = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < commands; i++) {
            String[] cmd = sc.nextLine().split(" ");
            switch (cmd[0]) {
                case "append":
                    tree.append(Integer.parseInt(cmd[1]));
                    break;
                case "isBST":
                    System.out.println(tree.isBST());
                    break;
                case "preOrder":
                    tree.preOrder();
                    break;
                case "inOrder":
                    tree.inOrder();
                    break;
                case "postOrder":
                    tree.postOrder();
                    break;
                case "height":
                    System.out.println(tree.height());
                    break;
                case "levelOrder":
                    tree.levelOrder();
                    break;
                case "findFirstNode":
                    tree.findFirstNode();
                    break;
            }
        }
    }
}
