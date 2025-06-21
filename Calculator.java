package Polymorphism;


public class Calculator {

    
    public int add(int a, int b) {
        return a + b;
    }

    
    public double add(double a, double b) {
        return a + b;
    }

    
    public int add(int a, int b, int c) {
        return a + b + c;
    }


    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Testing all overloaded methods
        int sum1 = calc.add(10, 20);             // Calls method a
        double sum2 = calc.add(5.5, 3.2);         // Calls method b
        int sum3 = calc.add(1, 2, 3);             // Calls method c

        // Displaying results
        System.out.println("Sum of two integers: " + sum1);
        System.out.println("Sum of two doubles: " + sum2);
        System.out.println("Sum of three integers: " + sum3);
    }
}