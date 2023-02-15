package basics.c_stringClass;

class StringBufferBuilder {
     public static void main(String[] args) {

         String str = "Hello ";

         StringBuilder stringBuilder = new StringBuilder(str);

         stringBuilder.append("World1 ");
         stringBuilder.append("World2 ");
         stringBuilder.append("World3 ");
         stringBuilder.append("World4 ");
         System.out.println(stringBuilder);

         stringBuilder.insert(0, "Big ");
         System.out.println(stringBuilder);

         stringBuilder.delete(0,2);
         System.out.println(stringBuilder);




        // ________ END ________
        System.out.println("\n");
        System.out.println("________ END ________");
    }
}
