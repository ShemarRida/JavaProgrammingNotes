package javaarrays;

import java.util.Arrays;

public class CopyArrays {
    public static void main(String[] args) {
//        int [] ages = {19, 20, 21, 22, 23, 24};
//        int [] youngAdults = ages;
//
//        for (int age: ages) {
//            System.out.print(age + "\n");
//        }
//        String[] source = {"Mike", "Oz", "Chris", "Haydi", "Ava", "Miya"};
//        String[] destination = new String[6];
//
//        for (int x = 0; x < source.length; x++){
//            destination[x] = source[x];
//        }
//        System.out.println(Arrays.toString(destination));

//        String[] nameList = {"Mike", "Oz", "Chris", "Haydi", "Ava", "Miya"};
//        String[] copyOfNames = new String[nameList.length];
//        System.arraycopy(nameList, 0, copyOfNames, 0, nameList.length);
//        System.out.println(Arrays.toString(copyOfNames));

//        String[] nameList = {"Mike", "Oz", "Chris", "Haydi", "Ava", "Miya"};
//        String[] copyOfNames = Arrays.copyOfRange(nameList, 0, nameList.length);
//        System.out.println("COPY OF NAMES = " + Arrays.toString(copyOfNames));

        String[][] nameList = {
                {"Mike", "Oz", "Chris"},
                {"Haydi", "Ava"},
                {"Miya"}
        };
        String[][] copyOfNames = new String[nameList.length][];

//        for (int x = 0; x < copyOfNames.length; x++){
//            copyOfNames[x] = new String[nameList[x].length];
//            for (int z = 0; z < copyOfNames[x].length; z++){
//                copyOfNames[x][z] = nameList[x][z];
//            }
//        }
//        System.out.println(Arrays.deepToString(copyOfNames));
        for (int x = 0; x < nameList.length; x++){
            copyOfNames[x] = new String[nameList[x].length];
            System.arraycopy(nameList[x], 0, copyOfNames[x], 0, copyOfNames[x].length);
        }
        System.out.println(Arrays.deepToString(copyOfNames));

    }
}
