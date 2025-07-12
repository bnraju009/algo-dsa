package com.dsa.linkedlist;

public class LinkedListDemo {
    private Node head;
    private Node tail;
    private int length;

    public LinkedListDemo(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    //Basic Node Definition
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }


    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }



    public Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = head.next;
        }
        return temp;
    }

    public boolean set(int index, int value) {
        if (length < 0 || index > length) {
            return false;
        }
        Node temp = get(index);
        temp.value = value;
        return true;
    }

    public boolean insert(int index, int value) {
        if (length < 0 || index > length) {
            return false;
        }
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next=temp.next;
        temp.next=newNode;

        length++;
        return true;
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }


    public Node removeFirst() {
        if (length == 0) {
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        if (length == 0) {
            tail = null;
        }
        length--;
        return temp;
    }

    public Node removeLast() {
        if (length == 0) {
            return null;
        }
        Node temp = head;
        Node pre = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    // Helper Methods
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println("Value of current Node => " + temp.value);
            temp = temp.next;
        }
    }

    public void getLength() {
        System.out.println("Length => " + length);
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head-Value => null");
        } else {
            System.out.println("Head-Value => " + head.value);
        }

    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void getTail() {
        if (tail == null) {
            System.out.println("Tail-Value => null");
        } else {
            System.out.println("Tail-Value => " + tail.value);
        }
    }
}
