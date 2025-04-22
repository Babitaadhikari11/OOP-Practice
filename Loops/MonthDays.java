//Input a month number (1–12) and print the number of days in that month using switch.
package Loops;

import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1-12 indicating corresponding months: ");
        int num=sc.nextInt();
        sc.close();
        switch (num) {
            case 1:
            System.out.println("31 days");
            break;

            case 2:
            System.out.println("28 days");
            break;

            case 3:
            System.out.println("31 days");
            break;

            case 4:
            System.out.println("30 days");
            break;

            case 5:
            System.out.println("31 days");
            break;

            case 6:
            System.out.println("30 days");
            break;

            case 7:
            System.out.println("31 days");
            break;

            case 8:
            System.out.println("31 days");
            break;

            case 9:
            System.out.println("30 days");
            break;

            case 10:
            System.out.println("31 days");
            break;

            case 11:
            System.out.println("30 days");
            break;

            case 12:
            System.out.println("31 days");
            break;

        
        
            default:
            System.out.println("no months found");
                break;
        }
    }
    
}

    

