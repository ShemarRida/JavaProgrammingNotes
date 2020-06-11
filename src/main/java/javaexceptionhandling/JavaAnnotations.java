package javaexceptionhandling;

public class JavaAnnotations {
    static class Animal {
        public void displayInfo() {
            System.out.println("I am an animal.");
        }
    }

    static class Dog extends Animal {
        @Override
        public void displayInfo() {
            System.out.println("I am a dog.");
        }
    }


    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.displayInfo();
    }
}

