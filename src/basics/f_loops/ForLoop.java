package basics.f_loops;

import java.util.ArrayList;
import java.util.Arrays;

class ForLoop {
    public static void main(String[] args) {

        ArrayList<Integer> list =
                new ArrayList<>(Arrays.asList(123, 5, 42, 678, 54));

        // Normal For Loop
        System.out.println("Normal For Loop");

        for (int i = 0; i < list.size() - 1; i++) {
            System.out.println(list.get(i));
        }

        // Enhanced For Loop
        System.out.println("Enhanced For Loop");

        for (int num : list) {
            System.out.println(num);
        }

        // ________ END ________
        System.out.println("\n");
        System.out.println("________ END ________");
    }
}
