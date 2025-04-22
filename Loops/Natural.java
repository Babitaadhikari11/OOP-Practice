//Take a number n and print the sum of first n natural numbers using a loop.
package Loops;

import java.util.Scanner;

public class Natural {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number upto which sum is calculated: ");
        int num=sc.nextInt();
        sc.close();
        int sum=0;
        for(int i=1;i<=num;i++){
            sum=sum+i;
        }
        System.out.println(sum);

    }
    
}
