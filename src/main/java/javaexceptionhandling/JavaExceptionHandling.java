package javaexceptionhandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class JavaExceptionHandling {
    static class ListOfNumbers {
        private int[] list = new int[10];

        public ListOfNumbers() {

            for (int i = 0; i < 10; i++) {
                list[i] = i;
            }
        }

        public void writeList() {
            PrintWriter out = null;

            try {
                System.out.println("Entering try statement");


                out = new PrintWriter(new FileWriter("OutputFile.txt"));


                for (int i = 0; i < 10; i++) {
                    out.println("Value at: " + i + " = " + list[i]);
                }
            } catch (IndexOutOfBoundsException e1) {
                System.out.println("IndexOutOfBoundsException => " + e1.getMessage());
            } catch (IOException e2) {
                System.out.println("IOException => " + e2.getMessage());
            } finally {

                if (out != null) {
                    System.out.println("Closing PrintWriter");
                    out.close();
                } else {
                    System.out.println("PrintWriter not open");
                }
            }

        }

        public static void main(String[] args) {
            JavaExceptionHandling.ListOfNumbers list = new JavaExceptionHandling.ListOfNumbers();
            list.writeList();
        }
    }
}

