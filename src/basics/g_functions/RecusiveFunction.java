package basics.g_functions;

import java.util.ArrayList;
import java.util.Arrays;

class RecusiveFunction {

    static void printItemsOf(ArrayList<Integer> list, int i) {
        if (i < list.size()) {
            System.out.println(list.get(i));
            RecusiveFunction.printItemsOf(list, i+1);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list =
                new ArrayList<>(Arrays.asList(123, 5, 42, 678, 54));

        RecusiveFunction.printItemsOf(list, 0);

        // ________ END ________
        System.out.println("\n");
        System.out.println("________ END ________");
    }
}
