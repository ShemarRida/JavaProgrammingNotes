package javaoopII;

public class JavaAbstractClass {

    abstract static class Animal {
        abstract void makeSound();

    }

    static class Dog extends Animal {
        public void makeSound() {
            System.out.println("Bark bark.");
        }
    }

    static class Cat extends Animal {
        public void makeSound() {
            System.out.println("Meows ");
        }
    }

    public static void main(String[] args) {
            Dog d1 = new Dog();
            d1.makeSound();

            Cat c1 = new Cat();
            c1.makeSound();
        }
    }

