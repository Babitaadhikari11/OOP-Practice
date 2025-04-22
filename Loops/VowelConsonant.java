// Write a program to input a character and check if it is a vowel or a consonant using if-else.
package Loops;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character to be checked: ");
        char n=sc.next().charAt(0);
        sc.close();
        if(n=='a'|| n=='e'|| n=='i'|| n=='o'|| n=='u'){
            System.out.println("the alphabet is vowel.");

        }
        else{
            System.out.println("the number is consonant.");
        }
    }
    
}
