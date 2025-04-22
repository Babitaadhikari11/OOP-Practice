// Take two numbers as input and print their sum, difference, product, and quotient.
package Loops;

import java.util.Scanner;

public class ProductDifference {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the first number: ");
        int num1=sc.nextInt();
        System.out.print("enter the second number: ");
        int num2=sc.nextInt();
        int sum=num1+num2;
        int product=num1*num2;
        int quotient=num1%num2;
        System.out.println("the sum is : "+sum+"\nthe product is : "+product+"\nthe divison is :"+quotient);
        sc.close();

        
    }
    
}
