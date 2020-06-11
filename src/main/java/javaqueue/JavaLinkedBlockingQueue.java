package javaqueue;

import java.util.concurrent.LinkedBlockingQueue;

public class JavaLinkedBlockingQueue {
    public static void main(String[] args) {
        LinkedBlockingQueue<String> animals = new LinkedBlockingQueue<>(5);

        // Using add()
        animals.add("Dog");
        animals.add("Cat");

        // Using offer()
        animals.offer("Horse");
        System.out.println("LinkedBlockingQueue: " + animals);
    }
}
