package com.dsa.stack;

import java.util.ArrayList;
import java.util.List;

public class StackWithArrayList<T> {
    private ArrayList<T> stackList = new ArrayList<>();

    public ArrayList<T> getStackList() {
        return stackList;
    }

    public void printStack() {
        for (int i = stackList.size()-1; i >= 0; i--) {
            System.out.println(stackList.get(i));
        }
    }

    public boolean isEmpty() {
        return stackList.size() == 0;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return stackList.get(stackList.size() - 1);
        }
    }

    public int size() {
        return stackList.size();
    }

    public void push(T value) {
        stackList.add(value);
    }

    public T pop() {
        if (isEmpty()) return null;
        return stackList.remove(stackList.size() - 1);
    }

    public static void main(String[] args) {
        StackWithArrayList stackWithArrayList = new StackWithArrayList();
        stackWithArrayList.push(1);
        stackWithArrayList.push(3);
        stackWithArrayList.push(2);
        stackWithArrayList.printStack();
       // stackWithArrayList.pop(); // It should remove top element from the list.
        System.out.println(stackWithArrayList.peek()); // It should return top element
    }

}
