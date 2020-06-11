package javaoopIII;

public class JavaNestedStaticClass {

    static class Animal {

        class Reptile {
            public void displayInfo() {
                System.out.println("I am a reptile.");
            }
        }


        static class Mammal {
            public void displayInfo() {
                System.out.println("I am a mammal.");
            }
        }
    }

    public static void main(String[] args) {
        Animal animal = new Animal();

        Animal.Reptile reptile = animal.new Reptile();
        reptile.displayInfo();

        Animal.Mammal mammal = new Animal.Mammal();
        mammal.displayInfo();

        }

}
