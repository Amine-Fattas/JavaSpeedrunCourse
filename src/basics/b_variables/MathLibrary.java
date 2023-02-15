package basics.b_variables;

class MathLibrary {
     public static void main(String[] args) {

         System.out.println( "Math.abs(-4.1456)  = " + Math.abs(-4.1456)  );
         System.out.println( "Math.ceil(4.1456)  = " + Math.ceil(4.1456)  );
         System.out.println( "Math.floor(4.1456) = " + Math.floor(4.1456) );
         System.out.println( "Math.round(4.1456) = " + Math.round(4.1456) );
         System.out.println( "Math.max(5, 10)    = " + Math.max(5, 10)    );
         System.out.println( "Math.min(5, 10)    = " + Math.min(5, 10)    );
         System.out.println( "Math.exp(1)        = " + Math.exp(1)        );
         System.out.println( "Math.pow(10, 4)    = " + Math.pow(10, 4)    );
         System.out.println( "Math.sqrt(9)       = " + Math.sqrt(9)       );
         System.out.println( "Math.PI = π        = " + Math.PI            );
         System.out.println( "Math.sin(π/2)      = " + Math.sin(Math.PI/2));
         System.out.println( "Math.sin(π/2)      = " + Math.cos(Math.PI/2));
         System.out.println( "Math.tan(π/2)      = " + Math.tan(Math.PI/2));

         System.out.println( "Random float in [0,1] = " + Math.random());
         System.out.println( "Random float in [0,20] = " + Math.random() * 20);
         System.out.println( "Random int   in [0,20] = " + (int) (Math.random() * 20));

        // ________ END ________
        System.out.println("\n");
        System.out.println("________ END ________");
    }
}
