package com.dsa.queues;

import java.util.ArrayList;
import java.util.List;

public class QuequeDemoWithList<T> {
    ArrayList<T> list = new ArrayList<>();
    T value;
    QuequeDemoWithList(T value){
        this.value=value;
        list.add(value);
    }
    public void enqueue(T value){
        list.add(value);
    }
    public boolean dequeue(){
        if(list.isEmpty()){
            return false;
        }
        return list.remove(list.get(0));
    }
    public void printData(){
        System.out.println(list);
    }

    public static void main(String[] args) {
        QuequeDemoWithList demoWithList = new QuequeDemoWithList(1);
        demoWithList.enqueue(2);
        demoWithList.enqueue(3);
        //demoWithList.printData();
        demoWithList.dequeue(); // It should remove the first element in list that is 1.
        demoWithList.printData();
    }

}
