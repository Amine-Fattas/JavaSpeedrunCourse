package basics.d_dataStructures;

import java.util.ArrayList;
import java.util.Arrays;

class ArrayLists {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();

        ArrayList<String> arrayListWithCapacity = new ArrayList<String>(10);

        ArrayList<String> arrayListWithInitValues =
                new ArrayList<String>(Arrays.asList("Monday", "Tuesday", "Wednesday"));

        arrayList.add("My name");
        arrayListWithInitValues.add("Thursday");
        arrayListWithInitValues.remove("Tuesday");

        arrayListWithInitValues.set(0, "Sunday");
        System.out.println(arrayListWithInitValues.toString());
        System.out.println(arrayListWithInitValues.get(2));

        // ________ END ________
        System.out.println("\n");
        System.out.println("________ END ________");
    }
}
