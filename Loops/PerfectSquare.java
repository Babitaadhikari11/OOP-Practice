//Input a number and check if it is a perfect square using for loop.
package Loops;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number to be checked for perfect square: ");
   int n=sc.nextInt();
   sc.close();
    for(int i=1;i<=n;i++){
        if(i*i==n){
            System.out.println("sqaure");
        }
    }
    System.out.println("no");
}
    
}
