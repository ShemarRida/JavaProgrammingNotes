package javaarrays;

public class Java_Arrays {
    public static void main(String[] args) {
        String[] strings = {"Banger", "Boomer", "Ratata"};
        int[] cars = new int[3];

        for (int x = 0; x < strings.length; x++){
            System.out.println(strings[x]);
        }

        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);

        String[] names = {"Mar", "Bob", "Marley"};
        Integer[] age = {10, 11, 12};

        for (int x = 0; x < names.length; x++){
            System.out.println(names[x]);
        }

        Double[] numbers = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        Double sum = 0.0;
        Double average;

        for (double number : numbers){
            sum = sum + number;
        }
        int arrayLength = numbers.length;

        average = sum / arrayLength;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

    }


}
