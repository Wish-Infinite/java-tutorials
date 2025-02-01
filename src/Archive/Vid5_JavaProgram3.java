package Archive;

import java.util.Arrays;

public class Vid5_JavaProgram3 {
    public static void main(String[] args) {
        String[] fruits = new String[3];
        fruits[0] = "Mango";
        fruits[1] = "Banana";
        fruits[2] = "Guava";

        System.out.println(fruits[2]);

        int[] temperature = new int[8];
        temperature[0] = 32;
        temperature[1] = 35;
        System.out.println(temperature[1]);


        int[][] temp2 = {{23, 25, 29, 34},
                {32, 35, 36, 31}};

        System.out.println(temp2[1][3]);

        String[] fruits2 = {"Mango", "Banana", "Papaya", "Guava"};
        System.out.println(fruits2.length);
        Arrays.sort(fruits2);
        System.out.println(fruits2[1]);

    }
}
