package com.dsa.trees;

import javax.lang.model.util.Elements;

public class BinarySearchTree {
     Node root;

    public class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (temp.value == newNode.value) {
                return false;
            }
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }
    public boolean contains(int value){
        Node temp=root;
        while(temp!=null){
            if(value<temp.value){
                temp=temp.left;
            } else if (value>temp.value) {
                temp=temp.right;
            }else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        BinarySearchTree searchTree = new BinarySearchTree();
        searchTree.insert(47);
        searchTree.insert(21);
        searchTree.insert(76);
        searchTree.insert(18);
        searchTree.insert(52);
        searchTree.insert(82);
        searchTree.insert(27);

        System.out.println(searchTree.root.left.right.value);

        System.out.println(searchTree.contains(82)); // This should return true
        System.out.println(searchTree.contains(101)); // This should return false
    }
}
