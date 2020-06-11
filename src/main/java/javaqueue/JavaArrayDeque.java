package javaqueue;

import java.util.ArrayDeque;

public class JavaArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<String> animals= new ArrayDeque<>();

        // Using add()
        animals.add("Dog");

        // Using addFirst()
        animals.addFirst("Cat");

        // Using addLast()
        animals.addLast("Horse");
        System.out.println("ArrayDeque: " + animals);
    }
}
