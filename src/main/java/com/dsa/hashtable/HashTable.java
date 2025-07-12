package com.dsa.hashtable;

import java.util.ArrayList;

public class HashTable {

    int size = 7;
    Node[] dataMap;

    class Node {
        String key;
        int value;
        Node next;

        Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    HashTable() {
        dataMap = new Node[size];
    }

    public Node[] getDataMap() {
        return dataMap;
    }
    public int get(String key){
        int value =0;
        int index = hash(key);
        Node temp = dataMap[index];
        while(temp!=null){
            if(temp.key==key){
                return temp.value;
            }
            temp=temp.next;
        }

        return value;
    }

    public void set(String key, int value){
        Node newNode = new Node(key, value);
        int index = hash(key);
        if(dataMap[index]==null){
            dataMap[index]=newNode;
            return;
        }
        Node temp=dataMap[index];
        if(temp.key==key){
            temp.value += value;
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
            if(temp.key==key){
                temp.value += value;
                return;
            }
        }
        temp.next=newNode;
    }

    public ArrayList keys(){
        ArrayList<String> keys = new ArrayList(size);
        for(int i=0;i<size;i++){
            Node temp=dataMap[i];
            while(temp!=null){
                keys.add(temp.key);
                temp=temp.next;
            }
        }
        return keys;
    }

    private int hash(String key) {
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for (int i = 0; i < keyChars.length; i++) {
            int asciiValue = keyChars[i];
            hash = (hash + asciiValue * 23) % dataMap.length;
        }
        return hash;
    }

    public void printTable() {
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            if (dataMap[i] != null) {
                Node temp = dataMap[i];
                while (temp != null) {
                    System.out.println("   {" + temp.key + ", " + temp.value + "}");
                    temp = temp.next;
                }
            }
        }
    }

    public static void main(String[] args) {
        HashTable myHashTable = new HashTable();
        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);
        myHashTable.set("bolts", 200);
        myHashTable.set("screws", 140);
        myHashTable.printTable();
       int value = myHashTable.get("lumber");
        System.out.println(" DATA from => "+value);
        System.out.println(myHashTable.keys());
    }
}