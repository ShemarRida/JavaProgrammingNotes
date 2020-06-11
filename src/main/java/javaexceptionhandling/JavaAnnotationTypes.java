package javaexceptionhandling;

public class JavaAnnotationTypes {
    @interface MyCustomAnnotation {
        String value() default "default value";
    }
    @MyCustomAnnotation(value = "programiz")
    public void method1() {
        System.out.println("Test method 1");
    }

    @Deprecated
    public static void deprecatedMethod() {
        System.out.println("Deprecated method");
    }
    @FunctionalInterface
    public interface MyFuncInterface{
        public void firstMethod();
    }
    @SuppressWarnings("deprecated")
    public static void main(String args[]) throws Exception {
        deprecatedMethod();
        JavaAnnotationTypes obj = new JavaAnnotationTypes();
        obj.method1();
    }
}
