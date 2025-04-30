//Create a method to convert a given number of days into years, months, and days
package Function_task;

import java.util.Scanner;

public class DaysYear {
    public static void daysYear(int num){
        // calculating years
        int years = (num/365);
        // calculating months
        int months = (num-years*365)/30;
        // calculating days
        int days=(num-years*365-months*30);
        System.out.println(years+" years "+ months+" months "+" and "+days+" days");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to be converted: ");
        int num = sc.nextInt();
        sc.close();
        daysYear(num);
    }
    
}
