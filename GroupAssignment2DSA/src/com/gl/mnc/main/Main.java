package com.gl.mnc.main;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class Main {
    Node node;

    // convert Binary search Tree to skewed tree
    public Node convertToSkewedTree(Node root) {

        if (root == null) {
            return null;
        }

       
        Node presentNode = root;
        Node right = null;

        // Traverse the tree
        while (presentNode != null) {
            
            if (presentNode.left != null) {
                Node left = presentNode.left;
                presentNode.left = null;
                presentNode= left;
            } else {
                
                System.out.print(presentNode.data + " ");

               
                right = presentNode.right;
                presentNode = right;
            }
        }

        return right; 
    }

    //traversing to display the node values in ascending order
    public void inOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
    	//Hard coding
        Main tree = new Main();
        tree.node = new Node(50);
        tree.node.left = new Node(30);
        tree.node.right = new Node(60);
        tree.node.left.left = new Node(10);
        tree.node.right.left = new Node(55);

       //converting binary tree to skewed tree
        tree.inOrderTraversal(tree.node);

    }
}
