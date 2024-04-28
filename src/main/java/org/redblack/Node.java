package org.redblack;

public class Node {
    int key;
    Node left;
    Node right;
    Node parent;
    boolean isRed;

    public Node(int key, boolean isRed) {
        this.key = key;
        this.isRed = isRed;
        this.left = null;
        this.right = null;
        this.parent = null;
    }
}
