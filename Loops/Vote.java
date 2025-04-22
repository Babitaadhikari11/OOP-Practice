//Input the age of a person and check if they are eligible to vote (18 or older).
package Loops;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter age to be checked: ");
        int age=sc.nextInt();
        sc.close();
        if(age>18){
            System.out.println("eligible to vote.");
        }
        else{
            System.out.println("not eligible.");
        }
    }
    
}
