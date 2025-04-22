// Write a Java program to input your full name and print a greeting message.
package Loops;
import java.util.Scanner;
public class Greet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter full name: ");
        String name=sc.nextLine();
        System.out.println("Good morning "+ name);
        sc.close();
    }
    
}
