package Loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num; // Use temp to count digits
        int digits = 0; 
        int reversed = 0;
        int original = num;

        // Count the number of digits in temp
        while (temp != 0) {
            temp /= 10;
            digits++;
        }

        // Now reverse the number using num (which is still original)
        for (int i = 0; i < digits; i++) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Number of digits: " + digits);
        System.out.println("Reversed number: " + reversed);
        System.out.println("Original number: " + original);

        if (original == reversed) {
            System.out.println("It is a palindrome number");
        } else {
            System.out.println("Not a palindrome number");
        }

        sc.close();
    }
}
