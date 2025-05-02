package Function_task;

import java.util.Scanner;

public class CompoundInterest {

    // Method to calculate compound interest
    public static void compoundInterest(double principal, double rate, int time) {
        double amount; //this is the actual compound interest
        amount = principal*Math.pow((1+rate/100), time); //pow is used for calculating power  of time
        System.out.println(amount);
       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input principal amount
        System.out.print("Enter the principal amount in Rs.: ");
        double principal = sc.nextDouble();
        System.out.print("Enter the annual interest rate (%): ");
        double rate = sc.nextDouble();
        System.out.print("Enter the time period (in years): ");
        int time = sc.nextInt();
        sc.close();
        compoundInterest(principal, rate, time);
       
    }
}