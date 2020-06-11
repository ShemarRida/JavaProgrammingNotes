package javaoop;

public class JavaStrings {
    public static void main(String[] args) {
        String greeting = "Hello! Nice to meet you";
        System.out.println(greeting);
        System.out.println("Length of greeting: " + greeting.length());

        String first_name = "Shemar ";
        String last_name = "Rida";
        //String first_and_last = first_name.concat(last_name);
        String first_and_last = first_name + last_name;
        System.out.println("My name is " + first_and_last);

        boolean result = first_name.equals(last_name);
        boolean res = first_and_last.equals(first_name + last_name);
        System.out.println("Are the first and last name the same? " + result);
        System.out.println(first_and_last.toUpperCase());
        System.out.println(first_and_last.toLowerCase());
        System.out.println(first_and_last.replaceAll("Shemar Rida", "Ava Amelia"));
        System.out.println(first_and_last.replaceAll("Shemar Rida", "Ava Amelia").toUpperCase());

    }
}
