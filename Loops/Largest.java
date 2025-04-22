package Loops;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("enter first number: ");
       int num1=sc.nextInt();
       System.out.print("enter second number: ");
       int num2=sc.nextInt();
       System.out.print("enter third number: ");
       int num3=sc.nextInt();
       sc.close();
        if(num1>num2){
            if(num1>num3){
                System.out.println("the greatest number is 'num1' "+num1);
            }
        }
        else if(num2>num3){
            if(num2>num1){
                System.out.println("the greatest number is 'num2' "+num2);
            }
        }
        else{
            System.out.println("the greatest number is 'num3' "+num3);
        }
        
    }
    
}
    

