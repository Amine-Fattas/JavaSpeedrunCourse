package basics.b_variables;

class Casting {
     public static void main(String[] args) {

         boolean bool = true;

         char character = 'a';

         // Numbers
         byte byteVar = 100;
         short shortVar = 1000;
         int intVar = 1000000000;
         long longVar = 1000000000100000000l;

         float floatVar = 1000000000100000000.0f;
         double doubleVar = 1000000000100000000.0;

         // Casting Tests: uncomment the line you wanna test
         // byte < short < int < long < float < double

         // Implicit Casting
         // Valid casting
         short shortResult = byteVar;
         float result = longVar;

         // Invalid Casting
//         byte byteResult = shortVar;
//         float floatResult = doubleVar;

         // Explicit Casting
         byte byteResult = (byte) shortVar;
         float floatResult = (float) doubleVar;

         System.out.println("result: " + result);


        // ________ END ________
        System.out.println("\n");
        System.out.println("________ END ________");
    }
}
