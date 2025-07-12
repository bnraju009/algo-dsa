package com.dsa.linkedlist;

import java.util.HashSet;

public class LinkedListTest {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
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

    public Node get(int index) {
        if (length == 0) {
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            if (temp != null) {
                temp = temp.next;
            }
        }
        if (temp == null) {
            System.out.println(" No value found with supplied index " + index);
        }

        return temp;
    }

    public Node set(int index, int value) {
        if (length == 0) {
            return null;
        }
        Node node = get(index);
        if (node != null) {
            node.value = value;
        }
        return node;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        }
        if (index == 0) {
            prepend(value);
            length--;
            return true;
        }
        if (length == index) {
            append(value);
            length--;
            return true;
        }

        Node newNode = new Node(value);
        Node pre = get(index - 1);
        newNode.next = pre.next;
        pre.next = newNode;

        length++;
        return true;
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

    public Node remove(int index) {
        if (index < 0 || index > length) {
            return null;
        }
        if (index == 0) {
            return removeFirst();
        }
        if (index == length - 1) {
            return removeLast();
        }
        Node pre = get(index - 1);
        Node temp = pre.next;
        pre.next = temp.next;
        temp.next = null;
        length--;

        return null;
    }

    public void reverse() {
        if (length == 0) {
            System.out.println("LinkedListTest.reverse=> NO DATA FOUND");
        }
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = head.next;
        Node before = null;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public void printList() {
        while (head != null) {
            System.out.print(head.value + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public void getLength() {
        System.out.println("length = " + length);
    }


    public void removeDuplicates() {
        HashSet<Integer> data = new HashSet<>();
        Node current = head;
        Node prev = null;
        while (current != null) {
            if (data.contains(current.value)) {
                prev.next = current.next;
                length--;
            } else {
                data.add(current.value);
                prev = current;

            }
            current = current.next;
        }

    }

    public static void main(String[] args) {
        LinkedListTest linkedList = new LinkedListTest();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);

        // linkedList.append(3);
        // linkedList.prepend(1);
        // linkedList.get(2);
        // linkedList.set(1,33);
        //linkedList.insert(3, 5);
        // linkedList.removeFirst();
        // linkedList.removeLast();
        // linkedList.remove(2);
        // linkedList.reverse();
        linkedList.printList();
        linkedList.removeDuplicates();
        linkedList.printList();
        // linkedList.getLength();
    }
}
