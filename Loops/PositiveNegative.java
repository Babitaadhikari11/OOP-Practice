package Loops;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number to be checked: ");
        int num=sc.nextInt();
        sc.close();
        if( num>0){
            System.out.println("the number is positive ");
        }
        else if(num==0){
            System.out.println("the number is zero");
        }
        else{
            System.out.println("the number is negative");
        }
        
        // Write a JAVA program to check whether a number is even or odd.
        if(num%2==0){
            System.out.println("the number is even.");
        }
        else{
            System.out.println("the number is odd.");
        }
        // Write a JAVA program to check whether a year is a leap year or not.
        if(num%4==0 && num%100!=0 || num%400==0){
            System.out.println("the year is leap year.");
        }
        else{
            System.out.println("the year is not leap year.");
        }

        
    }
}
