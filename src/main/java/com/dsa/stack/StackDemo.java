package com.dsa.stack;

public class StackDemo {
    Node top;
    int height;

    class Node {
        Node next;
        int value;

        Node(int val) {
            this.value = val;
        }
    }

    public void push(int value){
        Node newNode = new Node(value);
        if (height == 0) {
            top = newNode;
        } else {
            newNode.next=top;
            top=newNode;
        }
        height++;
    }

    public Node pop(){
        if(height==0){
            return null;
        }
        Node temp=top;
        top=top.next;
        temp.next=null;
        height--;
        return temp;
    }
    public Node minVale(){
        if(height==0){
            return null;
        }
        Node minNode = null;
        for(int i=0;i<height;i++){

        }
        return minNode;
    }
    public void print(){
        if(height==0){
            System.out.println("StackDemo.print-- NO DATA FOUND --------");
        }
        Node temp=top;
        while(temp!=null){
            System.out.println("VAL--> "+temp.value);
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        StackDemo st = new StackDemo();
        st.push(7);
        st.push(2);
        st.push(5);
        st.push(3);
       // st.pop();
        st.print();
    }
}
