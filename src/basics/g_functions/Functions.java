package basics.g_functions;

import java.util.ArrayList;
import java.util.Arrays;

class Functions {

    static void printItemsOf(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list =
                new ArrayList<>(Arrays.asList(123, 5, 42, 678, 54));

        // We extracted the printing logic to a function
        Functions.printItemsOf(list);

        // ________ END ________
        System.out.println("\n");
        System.out.println("________ END ________");
    }
}
