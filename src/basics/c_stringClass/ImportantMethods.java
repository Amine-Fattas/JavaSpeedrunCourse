package basics.c_stringClass;

class ImportantMethods {
     public static void main(String[] args) {

         String str = "  Hello World  ";
         String str2 = new String("  Hello World  ");

         System.out.println("charAt 7: "   + str.charAt(7));
         System.out.println("indexOf W: "  + str.indexOf('W'));
         System.out.println("contains: " + str.contains("Hello"));
         System.out.println("length: "   + str.length());

         System.out.println("== : " + (str == str2));
         System.out.println("equals: " + str.equals(str2));

         System.out.println("replace: " + str.replace(
                 "World",
                 "Universe"
         ));

         System.out.println("substring: " + str.substring(5,10));

         for(String word: str.split(" "))
             System.out.println("split: " + word + ",");

         System.out.println("toUpperCase: " + str.toUpperCase());
         System.out.println("trim: " + str.trim());



        // ________ END ________
        System.out.println("\n");
        System.out.println("________ END ________");
    }
}
