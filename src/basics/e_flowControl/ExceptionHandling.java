package basics.e_flowControl;

class ExceptionHandling {
     public static void main(String[] args) {

         try {
             System.out.println(  10/0 );
         }
         catch (ArithmeticException exception){ // Type definition Recommended
             System.out.println(  exception.toString() );
         }
         catch (Exception exception){ // Not recommended
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
