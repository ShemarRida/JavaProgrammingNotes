package javaoop;

public class JavaInstanceOf {
    static class Animal{
        public void description(){
//            System.out.println("I am an animal.");
            System.out.println("I am a dog.");
        }

    }
    static class Dog extends Animal{

    }
    static class Cat extends Animal {

    }

    public static void main(String[] args) {
//        Dog dog = new Dog();
//        Animal animal = new Animal();
//        Cat cat = new Cat();
//
//        System.out.println("Is dog an instance of the Object class: " + (dog instanceof Object));
//        System.out.println("Is animal an instance of the Object class: " + (animal instanceof Object));
//        System.out.println("Is cat an instance of the Object class: " + (cat instanceof Object));
//        Dog dog = new Dog();
//        Animal animal = dog;
//        animal.description();
        //ClassCastException
//        Animal animal = new Animal();
//        Dog dog = (Dog)animal;
//        dog.description();
        Dog dog = new Dog();
        Animal animal = dog; //- Upcasting

        if (animal instanceof Dog){
            Dog dog2 = (Dog)animal; //- Downcasting
            dog2.description();
        }
    }
}
