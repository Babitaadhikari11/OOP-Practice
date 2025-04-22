// Write a program to input a number from 1 to 7 and display the day of the week using switch.
package Loops;
import java.util.Scanner;
public class DaysOfWeek {
    


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("1.'Sunday' ");
        System.out.println("2.'Monday' ");
        System.out.println("3.'Tueday' ");
        System.out.println("4.'Wednesday' ");
        System.out.println("5.'Thursday' ");
        System.out.println("6.'Friday' ");
        System.out.println("7.'Saturday' ");
        System.out.print("enter day as:");
        int day=sc.nextInt();
        sc.close();
        switch (day) {
            case 1:
            System.out.println("Sunday");  
            break;

            case 2:
            System.out.println("Monday");
            break;

            case 3:
            System.out.println("Tueday");
            break;

            case 4:
            System.out.println("Wednesday");
            break;

            case 5:
            System.out.println("Thursday");
            break;

            case 6:
            System.out.println("Friday");
            break;

            case 7:
            System.out.println("Saturday");
            break;
        
            default:
            System.out.println("some other day of the week");
                break;
        }
    }
}

    

