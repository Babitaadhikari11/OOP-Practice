package Function_task;

import java.util.Scanner;

public class PanlindromePrime {
    public static void panlindromePrime(int num){
        int backup = num;
        int rev = 0;
        // checking palindrome
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        // reverting to original
        num = backup; 
        // Prime checking
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("The number is prime.");
        } else {
            System.out.println("The number is not prime.");
        }

        if (backup == rev) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to be checked: ");
        int num = sc.nextInt();
        sc.close();
        panlindromePrime(num);
    }
}
