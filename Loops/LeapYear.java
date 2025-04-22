// Write a program to take a number from the user and print whether it is a leap year or not.
package Loops;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a year to be checked: ");
        int year=sc.nextInt();
        sc.close();
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println("the year is leap year.");
        }
        else{
            System.out.println("the year is not leap year.");
        }
    }
    
}
