package basics.f_loops;

import java.util.ArrayList;
import java.util.Arrays;

class WhileLoops {
    public static void main(String[] args) {

        ArrayList<Integer> list =
                new ArrayList<>(Arrays.asList(123, 5, 42, 678, 54));

        // While
        System.out.println("While");

        int i = 0;
        while (i<list.size()) {
            System.out.println(list.get(i));
            i++;
        }

        // Do While
        System.out.println("Do While");

        int j = 0;
        do  {
            System.out.println(list.get(j));
            j++;
        } while (j<list.size());

        // ________ END ________
        System.out.println("\n");
        System.out.println("________ END ________");
    }
}
