package basics.g_functions;

import java.util.ArrayList;
import java.util.Arrays;

class MultipleArguments {
    static int sum(int ... numbers) {
        int sum = 0;
        for (int number: numbers) sum += number;
        return sum;
    }
    public static void main(String[] args) {

        System.out.println(
                "Somme = " + MultipleArguments.sum(12, 34, 63, 234, 678)
        );

        // ________ END ________
        System.out.println("\n");
        System.out.println("________ END ________");
    }
}
