// Write a program that takes a number and checks if it is divisible by both 5 and 11.
package Loops;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number to be checked: ");
        int num=sc.nextInt();
        sc.close();
        if(num%5==0 && num%11==0){
            System.out.println("the number is divisible by 5 and 11.");
        }
        else{
            System.out.println("the number is not divisible by 5 and 11.");
        }
    }
    
}
