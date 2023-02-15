package basics.d_dataStructures;

import java.util.HashMap;

class StacksAndHashMaps {
    public static void main(String[] args) {

        HashMap<Integer, String> months = new HashMap<>();

        months.put(1, "January");
        months.put(2, "February");
        months.put(3, "March");
        months.put(4, "April");
        months.put(5, "May");

        System.out.println(months.get(3));

        HashMap<String, String> days = new HashMap<>();

        days.put("Mo", "Monday");
        days.put("Tu", "Tuesday");
        days.put("We", "Wednesday");
        days.put("Th", "Thursday");

        System.out.println(days.get("Tu"));


        // ________ END ________
        System.out.println("\n");
        System.out.println("________ END ________");
    }
}
