package javaoopII;

public class JavaEncapsulation {

    static class Person {
        protected String profession;

        protected void displayInfo() {
            System.out.println("I am a " + profession);
        }
    }

    static class Teacher extends Person {
        public static void main(String[] args) {
            Teacher t1 = new Teacher();
            t1.profession = "teacher";
            t1.displayInfo();
        }
    }
}
