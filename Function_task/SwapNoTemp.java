//Write a method to swap two numbers without using a temporary variable
package Function_task;

import java.util.Scanner;

public class SwapNoTemp {
    public static void swapNoTemp(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("The new value after  swapping , a  is : "+a+" b is : "+b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a first number: ");
        int a= sc.nextInt();
        System.out.println("enter a second number: ");
        int b= sc.nextInt();
        System.out.println("before swapping a = "+a+" b= "+b);
        sc.close();
        swapNoTemp(a, b);

    }
    
}
