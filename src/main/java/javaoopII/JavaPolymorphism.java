package javaoopII;

public class JavaPolymorphism {

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
            Animal a1;
            a1 = new Animal();
            a1.displayInfo();

            a1 = new Dog();
            a1.displayInfo();
        }
}
