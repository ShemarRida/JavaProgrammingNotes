package javaoopII;

public class SuperKeyword {

    static class Animal {


        public void display(){
            System.out.println("I am an animal");
        }
    }

    static class Dog extends Animal {

        @Override
        public void display(){
            System.out.println("I am a dog");
        }

        public void printMessage(){
            display();
            super.display();
        }
    }

    public static void main(String[] args) {
            Dog dog1 = new Dog();
            dog1.printMessage();
        }
    }

