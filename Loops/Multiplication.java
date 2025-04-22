//Write a program to print the multiplication table of a given number using for loop.
package Loops;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to calculate multiplication: ");
        int num=sc.nextInt();
        sc.close();
        int mul=1;
        for(int i=1;i<=10;i++){
            mul=num*i;
            System.out.println(num+"*"+i+"="+mul);
        }
    }
    
}
