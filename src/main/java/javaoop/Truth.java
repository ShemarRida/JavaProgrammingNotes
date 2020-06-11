package javaoop;

public class Truth {
    Boolean truth;

    void isALie(){
        truth = false;
        System.out.println("Is it the truth? " + truth);
    }
    void notALie(){
        truth = true;
        System.out.println("Is it the truth? " + truth);
    }
}
