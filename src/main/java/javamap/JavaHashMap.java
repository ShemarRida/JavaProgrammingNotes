package javamap;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMap {
    public static void main(String[] args) {
        // Creating a hashmap of even numbers
        HashMap<String, Integer> evenNumbers = new HashMap<>();
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);
        System.out.println("HashMap1: " + evenNumbers);

        // Creating a hash map from other hashmap
        HashMap<String, Integer> numbers = new HashMap<>(evenNumbers);
        numbers.put("Three", 3);
        System.out.println("HashMap2: " + numbers);


        // Creating a HashMap
        HashMap<String, Integer> numbers1 = new HashMap<>();
        numbers1.put("One", 1);
        numbers1.put("Two", 2);
        numbers1.put("Three", 3);
        System.out.println("HashMap: " + numbers1);

        // Accessing the key/value pair
        System.out.print("Entries: ");
        for (Map.Entry<String, Integer> entry : numbers1.entrySet()) {
            System.out.print(entry);
            System.out.print(", ");
        }

        // Accessing the key
        System.out.print("\nKeys: ");
        for (String key : numbers1.keySet()) {
            System.out.print(key);
            System.out.print(", ");
        }

        // Accessing the value
        System.out.print("\nValues: ");
        for (Integer value : numbers1.values()) {
            System.out.print(value);
            System.out.print(", ");
        }
    }
}

