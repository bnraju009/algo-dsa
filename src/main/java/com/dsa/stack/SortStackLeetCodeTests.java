package com.dsa.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class SortStackLeetCodeTests {

    public static void sortStack(StackWithArrayList<Integer> input) {
        StackWithArrayList<Integer> tempStack = new StackWithArrayList();


        while (!input.isEmpty()) {
            int temp = input.pop();

            // Move elements from tempStack back to input if they are bigger than temp
            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                input.push(tempStack.pop());
            }

            tempStack.push(temp);
        }

        // Copy sorted elements back to the original stack
        while (!tempStack.isEmpty()) {
            input.push(tempStack.pop());
        }
    }


    public static void main(String[] args) {
        StackWithArrayList stack = new StackWithArrayList();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Before sorting:");
        stack.printStack();

        sortStack(stack);

        System.out.println("\nAfter sorting:");
        stack.printStack();

        /*
            EXPECTED OUTPUT:
            ----------------
            Before sorting:
            4
            1
            5
            2
            3

            After sorting:
            1
            2
            3
            4
            5

        */

    }
}
