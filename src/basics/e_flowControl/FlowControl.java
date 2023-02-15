package basics.e_flowControl;

class FlowControl {
     public static void main(String[] args) {
        // if else
        int age = 25;

        if (age > 18) {
            System.out.println("Adult");
        }
        else {
            System.out.println("Minor");
        }

        // Ternary Operator
        String message = (age > 18) ? "Adult" : "Minor";
        System.out.println(message);

        // switch case
        String today = "Th";

        switch (today) {
            case "Mo":
                System.out.println("It's Monday");
                break;
            case "Tu":
                System.out.println("It's Tuesday");
                break;
            case "We":
                System.out.println("It's Wednesday");
                break;
            case "Th":
                System.out.println("It's Thursday");
                break;
            default:
                System.out.println("It's Weekend");
                break;
        }

        // ________ END ________
        System.out.println("\n");
        System.out.println("________ END ________");
    }
}
