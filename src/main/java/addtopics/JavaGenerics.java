package addtopics;

import java.util.ArrayList;

public class JavaGenerics {
    static class DemoClass {

        // generics method
        public <T> void genericsMethod(T data) {
            System.out.println("This is a generics method.");
            System.out.println("The data passed to method is " + data);
        }

        static class GenericsClass<T> {

            // variable of T type
            private T data;

            public GenericsClass(T data) {
                this.data = data;
            }

            // method that return T type variable
            public T getData() {
                return this.data;
            }

            public <T> void genericsMethod(T data) {
                System.out.println("This is a generics method.");
                System.out.println("The data passed to method is " + data);
            }

            public static void main(String[] args) {

                // initialize generic class with Integer data
                GenericsClass<Integer> intObj = new GenericsClass<>(5);
                System.out.println("Generic Class returns: " + intObj.getData());

                // initialize generic class with String data
                GenericsClass<String> stringObj = new GenericsClass<>("Java Programming");
                System.out.println("Generic Class returns: " + stringObj.getData());

                // initialize the class with Integer data
                DemoClass demo = new DemoClass();
                demo.<String>genericsMethod("Java Programming");
            }


        }
    }
}








//    public static void main(String[] args) {
//
//        // create an array list to store Integer data
//        ArrayList<Integer> list1 = new ArrayList<>();
//        list1.add(4);
//        list1.add(5);
//        System.out.println("ArrayList of Integer: " + list1);
//
//        // creates an array list to store String data
//        ArrayList<String> list2 = new ArrayList<>();
//        list2.add("Four");
//        list2.add("Five");
//        System.out.println("ArrayList of String: " + list2);
//
//        // creates an array list to store Double data
//        ArrayList<Double> list3 = new ArrayList<>();
//        list3.add(4.5);
//        list3.add(6.5);
//        System.out.println("ArrayList of Double: " + list3);
//    }

