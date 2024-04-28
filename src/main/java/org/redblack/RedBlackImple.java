package org.redblack;

public class RedBlackImple {
    private Node root;

    public RedBlackImple() {
        this.root = null;
    }

    private void rotateLeft(Node x) {
        Node y = x.right;
        x.right = y.left;
        if (y.left != null) {
            y.left.parent = x;
        }
        y.parent = x.parent;
        if (x.parent == null) {
            root = y;
        } else if (x == x.parent.left) {
            x.parent.left = y;
        } else {
            x.parent.right = y;
        }
        y.left = x;
        x.parent = y;
    }

    private void rotateRight(Node x) {
        Node y = x.left;
        x.left = y.right;
        if (y.right != null) {
            y.right.parent = x;
        }
        y.parent = x.parent;
        if (x.parent == null) {
            root = y;
        } else if (x == x.parent.right) {
            x.parent.right = y;
        } else {
            x.parent.right = y;
        }
        y.right = x;
        x.parent = y;
    }

    public void insert(int key) {
        Node newNode = new Node(key, true);
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent = null;
            while (current != null) {
                parent = current;
                if (key < current.key) {
                    current = current.left;
                } else {
                    current = current.right;
                }
            }
            newNode.parent = parent;
            if (parent.key > key) {
                parent.left = newNode;
            } else {
                parent.right = newNode;
            }
            fixViolation(newNode);
        }
    }

    private void fixViolation(Node node) {
        while (node != root && node.parent.isRed) {
            if (node.parent == node.parent.parent.left) {
                Node uncle = node.parent.parent.right;
                if (uncle != null && uncle.isRed) {
                    node.parent.isRed = false;
                    uncle.isRed = false;
                    node.parent.parent.isRed = true;
                    node = node.parent.parent;
                } else {
                    if (node == node.parent.right) {
                        node = node.parent;
                        rotateLeft(node);
                    }
                    node.parent.isRed = false;
                    node.parent.parent.isRed = true;
                    rotateRight(node.parent.parent);
                }
            } else {
                Node uncle = node.parent.parent.left;
                if (uncle != null && uncle.isRed) {
                    node.parent.isRed = false;
                    uncle.isRed = false;
                    node.parent.parent.isRed = true;
                    node = node.parent.parent;
                } else {
                    if (node == node.parent.left) {
                        node = node.parent;
                        rotateRight(node);
                    }
                    node.parent.isRed = false;
                    node.parent.parent.isRed = true;
                    rotateLeft(node.parent.parent);
                }
            }
        }
        root.isRed = false;
    }

    private void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.key + (node.isRed ? "(R) " : "(B) "));
        inorder(node.right);
    }

    public void inorderTraversal() {
        inorder(root);
        System.out.println();
    }

    public static void main(String[] args) {
        RedBlackImple tree = new RedBlackImple();
        int[] keys = {7, 3, 18, 10, 22, 8, 11, 26};
        for (int key : keys) {
            tree.insert(key);
            System.out.println("After insertion " + key + ":");
            tree.inorderTraversal();
            System.out.println("-----------------------");
        }
    }
}
