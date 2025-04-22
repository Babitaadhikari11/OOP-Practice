// Input a number and display the factorial of that number using a for loop.
package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to calculate factorial: ");
        int n=sc.nextInt();
        sc.close();
    int fact=1;
    for(int i=n;i>=1;i--){
        fact=fact*i;
    }
    System.out.println(fact);
    }
    
    
}
