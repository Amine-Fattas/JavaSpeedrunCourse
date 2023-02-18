package oop.c_polymorphism;

class Calculator {

    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    double sum(double a, double b) {
        return a + b;
    }

}

class MethodOverloading {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        // Sum of ints
        System.out.println(calculator.sum(5, 6));
        // Sum of floats
        System.out.println(calculator.sum(5f, 6f));
        // Sum of doubles
        System.out.println(calculator.sum(5.0, 6.0));
    }
}
