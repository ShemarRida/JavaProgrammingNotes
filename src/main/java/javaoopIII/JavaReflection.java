package javaoopIII;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class JavaReflection {
    static class Dog {

        public Dog() {

        }
        public Dog(int age) {

        }

        private Dog(String sound, String type) {

        }
    }

    static class ReflectionDemo {
        public static void main(String[] args) {
            try {
                Dog d1 = new Dog();
                Class obj = d1.getClass();


                Constructor[] constructors = obj.getDeclaredConstructors();

                for(Constructor c : constructors) {

                    System.out.println("Constructor Name: " + c.getName());


                    int modifier = c.getModifiers();
                    System.out.println("Modifier: " + Modifier.toString(modifier));


                    System.out.println("Parameters: " + c.getParameterCount());
                }
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
