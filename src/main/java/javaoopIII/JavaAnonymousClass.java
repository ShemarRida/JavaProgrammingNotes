package javaoopIII;

public class JavaAnonymousClass {
    interface Polygon {
        public void display();
    }

    static class AnonymousDemo {
        public void createClass() {

            // anonymous class implementing interface
            Polygon p1 = new Polygon() {
                public void display() {
                    System.out.println("Inside an anonymous class.");
                }
            };
            p1.display();
        }
    }

    public static void main(String[] args) {
        AnonymousDemo an = new AnonymousDemo();
        an.createClass();
    }
}


