package javaqueue;

import java.util.Deque;
import java.util.LinkedList;

public class JavaLinkedList {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();

        // Add elements to LinkedList
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        System.out.println("LinkedList: " + animals);
        Deque<String> mammals = new LinkedList<>();

        // Add element at starting of LinkedList
        mammals.addFirst("Cow");
        mammals.addFirst("Dog");
        mammals.addFirst("Cat");
        System.out.println("LinkedList: " + mammals);

        // Add elements at the end of LinkedList
        mammals.addLast("Zebra");
        System.out.println("New LinkedList: " + mammals);
    }
}

