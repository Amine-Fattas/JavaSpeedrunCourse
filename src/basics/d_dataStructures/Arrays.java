package basics.d_dataStructures;

import java.util.Arrays;

class ArraysIntro{
    public static void main(String[] args) {

        int[] numbers1 = {1, 15, 42, 7, 4, 5};
        System.out.println(numbers1[3]);

        int numbers2[] = {1, 15, 42, 7, 4, 5};
        System.out.println(numbers1[2]);

        int[] numbers3 = new int[6];
        numbers3[5] = 10;
        System.out.println(numbers3[5]);
        System.out.println(numbers3[4]);

        System.out.println(numbers3.length);

        int[][] matrix = {
                { 43, 54, 234 },
                { 656, 34, 98 }
        };
        System.out.println(matrix[1][2]);

        int copyOfNumbers[] = Arrays.copyOf(numbers1, 6);
        System.out.println(copyOfNumbers.equals(numbers1));

        Arrays.sort(numbers1);
        System.out.println(Arrays.toString(numbers1));


        // ________ END ________
        System.out.println("\n");
        System.out.println("________ END ________");
    }
}
