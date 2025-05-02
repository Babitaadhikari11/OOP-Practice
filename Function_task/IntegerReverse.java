//Create a method to reverse an integer number without converting it to a string
package Function_task;

import java.util.Scanner;

public class IntegerReverse {
    public static void integerReverse(int num){
        int rev=0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println(rev);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the desire integer: ");
        int num=sc.nextInt();
        sc.close();
        integerReverse(num);
        
    }
    
}
