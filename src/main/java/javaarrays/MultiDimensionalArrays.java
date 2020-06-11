package javaarrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {

        int[][] a = {
                {0, 1, 2, 3},
                {4, 5, 6},
                {7, 8},
                {9}
        };
        System.out.println("Length of row 1: " + a[0].length);
        System.out.println("Length of row 2: " + a[1].length);
        System.out.println("Length of row 3: " + a[2].length);
        System.out.println("Length of row 4: " + a[3].length);

        for (int x = 0; x < a.length; x++){
            for (int z = 0; z <a[x].length; z++){
                System.out.println(a[x][z]);
            }
        }
        for (int[] innerArray : a){
            for (int data : innerArray){
                System.out.println(data);
            }
        }
        int[][][] test = {
                {
                        {1, -2, 3},
                        {2, 3, 4}
                },
                {
                        {-4, -5, 6, 9},
                        {1},
                        {2, 3}
                }
        };
        for (int[][] array2D: test) {
            for (int[] array1D: array2D) {
                for(int item: array1D) {
                    System.out.println(item);
                }
            }
        }


    }

}
