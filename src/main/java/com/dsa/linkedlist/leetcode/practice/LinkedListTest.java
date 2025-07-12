package com.dsa.linkedlist.leetcode.practice;

public class LinkedListTest {

    Node head;
    Node tail;
    int length;

    public class Node {
        int vale;
        Node next;

        public Node(int val) {
            this.vale = val;
        }
    }

    public LinkedListTest(int val){
        Node newNode = new Node(val);
        head=newNode;
        tail=newNode;
        this.length = 1;
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else {
            tail.next=newNode;
            tail=newNode;
        }
        length++;
    }

    public void prepend(int value){
      Node newNode = new Node(value);
      if(head==null){
          head=newNode;
          tail=newNode;
      }else{
          newNode.next=head;
          head=newNode;
      }
      length++;
    }
    public void insert(int index, int value){
        Node newNode = new Node(value);
        if(length==0){
            head=newNode;
            tail=newNode;
        }
    }

    public Node get(int index) {
        if (length == 0) {
            return null;
        }
        Node temp = head;
//        int counter = 0;
//        while (temp != null) {
//            counter = counter + 1;
//            if (counter == index) {
//                return temp;
//            }
//
//            temp=temp.next;
//        }
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }

    public void printData(){
        Node temp=head;
        while(temp!=null){
            System.out.println(" Data is :"+temp.vale);
            temp=temp.next;
        }
    }


    public static void main(String[] args) {
        LinkedListTest ll = new LinkedListTest(20);
        ll.append(30);
        ll.append(40);
        ll.append(50);
        ll.prepend(10);
        ll.printData();
        Node node =ll.get(0);
        System.out.println(node.vale);

    }

}
