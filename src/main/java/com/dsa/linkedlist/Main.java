package com.dsa.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedListDemo linkedListDemo = new LinkedListDemo(2);
        linkedListDemo.append(3);
        linkedListDemo.append(4);
        linkedListDemo.reverse();
  //      linkedListDemo.prepend(1);
//        linkedListDemo.append(15);
//        linkedListDemo.append(20);
//        linkedListDemo.append(25);
      //  boolean isSet = linkedListDemo.set(1, 22);
       // System.out.println("Linked has been updated=> " + isSet);
       // linkedListDemo.insert(1,33);
        linkedListDemo.printList();
//        LinkedListDemo.Node removeNode =linkedListDemo.removeFirst();
//
//        linkedListDemo.printList();
//        linkedListDemo.getHead();
//        linkedListDemo.getTail();
//        linkedListDemo.getLength();
//       System.out.println("Removed Node => "+removeNode.value);
    }
}
