package com.dsa.doublelinkedlist;

public class DoubleLinkedList {
    Node head;
    Node tail;
    int length;

    public class Node {
        int value;
        Node next;
        Node pre;

        public Node(int value) {
            this.value = value;
        }
    }

    public DoubleLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.pre = tail;
            tail = newNode;
        }
        length++;
    }
    public void prepend(int value){
        Node newNode = new Node(value);
        if(length==0){
            head=newNode;
            tail=newNode;
        } else {
            Node temp= head;
            newNode.next=temp;
            head=newNode;
        }
        length++;
    }
    public void printData(){
        if(length==0){
            System.out.println("NO DATA");
        }
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList ll = new DoubleLinkedList(10);
        ll.append(20);
        ll.prepend(5);

        ll.printData();
        System.out.println(ll.length);

    }

}
