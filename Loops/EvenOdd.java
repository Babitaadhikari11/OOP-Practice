package Loops;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number to be checked: ");
        int num=sc.nextInt();
        sc.close();
        if(num%2==0){
            System.out.println("the number is even.");
        }
        else{
            System.out.println("the number is odd.");
        }
    }
    
}
