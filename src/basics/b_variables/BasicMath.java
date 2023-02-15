package basics.b_variables;

class BasicMath {
     public static void main(String[] args) {

         // Basic Operations
         System.out.println("10 + 4 = " + (10 + 4));
         System.out.println("10 - 4 = " + (10 - 4));
         System.out.println("10 * 4 = " + (10 * 4));
         System.out.println("10 / 4 = " + (10 / 4));
         System.out.println("10 % 4 = " + (10 % 4));

         System.out.println("10 / 4 = " + (10.0 / 4.0));


         // Incrementation
         int a = 10;
         a = a + 5;
         System.out.println("incremented a = " + a);
         a += 5;
         System.out.println("incremented a = " + a);

         int counter = 0;
         System.out.println("counter = " + counter++);
         System.out.println("counter = " + ++counter);


        // ________ END ________
        System.out.println("\n");
        System.out.println("________ END ________");
    }
}
