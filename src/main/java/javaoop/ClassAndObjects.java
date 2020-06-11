package javaoop;

public class ClassAndObjects {
    public static void main(String[] args) {
        Truth truth1 = new Truth();
        Truth truth2 = new Truth();
        truth1.isALie();
        truth2.notALie();

        MyMethod myBanger = new MyMethod();
        myBanger.myMethod();
        myBanger.multiply();

        int a, b;
        b = 27;
        a = 3;
        myBanger.divide(a, b);

        for (int x = 0; x <= 10; x++){
            myBanger.getSquare(x);
        }



    }
}
