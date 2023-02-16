package basics.g_functions;

class ThrowingFunctions {

    static void divideByZero() throws ArithmeticException {
        System.out.println(  10/0 );
    }

     public static void main(String[] args) {
         try {
             ThrowingFunctions.divideByZero();
         }
         catch (ArithmeticException exception){ // Type definition Recommended
             System.out.println(  exception.toString() );
         }

         finally {
             System.out.println( "Calcul finished" );
         }

        // ________ END ________
        System.out.println("\n");
        System.out.println("________ END ________");
    }
}
