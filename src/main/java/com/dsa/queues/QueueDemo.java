package com.dsa.queues;

public class QueueDemo {
    Node first;
    Node last;
    int length;

    public class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }
    QueueDemo(int value){
        Node newNode = new Node(value);
        first=newNode;
        last=newNode;
        length=1;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            first = newNode;
            last = newNode;
        } else {
            last.next=newNode;
            last=newNode;
        }

        length++;
    }

    public Node dequeue() {
        if (length == 0) {
            return null;
        }
        Node temp = first;
        if (length == 1) {
            first = null;
            last = null;
        } else {
            first = first.next;
            temp.next = null;
        }
        length--;
        return temp;
    }



    public void printData() {
        if (length == 0) {
            System.out.println("*******NO DATA FOUND ******");
        }
        Node temp=first;
        while (temp!=null){
            System.out.println("QueueDemo.printData => "+temp.value);
            temp=temp.next;
        }
    }


    public static String reverseString(String inputStr){
        int length = inputStr.length();
        char[] charArr = new char[length];
        int index = 0;
        for(int i = length-1; i>=0; i--){
            char ch = inputStr.charAt(i);
            System.out.println("CHAR ***** "+ch);
            charArr[index]=ch;
            index=index+1;
        }
        System.out.println(charArr);
        return new String(charArr);
    }

    public static void main(String[] args) {
        QueueDemo queueDemo = new QueueDemo(2);
        queueDemo.enqueue(1);
      //  queueDemo.enQueue(3);
      //  queueDemo.printData();
//        System.out.println("QueueDemo.main => "+queueDemo.dequeue().value);
//        System.out.println("QueueDemo.main => "+queueDemo.dequeue().value);
//        System.out.println("QueueDemo.main => "+queueDemo.dequeue());

        String str = reverseString("hello");
        System.out.println(str);


    }
}
