package basics.e_flowControl;

class ExceptionHandling {
     public static void main(String[] args) {

         try {
             int denominator = 0;
             System.out.println(  10/denominator );
             if (denominator == 0)
                 // Manually throw an exception
                 throw new ArithmeticException("Cannot divide by )");
         }
         catch (ArithmeticException exception){ // Type definition Recommended
             System.out.println(  exception );
         }
         catch (Exception exception){ // Not recommended
             System.out.println(  exception.getMessage() );
         }

         finally {
             System.out.println( "Calcul finished" );
         }


        // ________ END ________
        System.out.println("\n");
        System.out.println("________ END ________");
    }
}
