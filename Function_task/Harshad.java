//Write a method to determine whether a number is a Harshad number or not
package Function_task;

import java.util.Scanner;

public class Harshad {
    public static void harsadNum(int num){
        int temp = num;
        int sum = 0;
         // Count the number of digits in temp
         while(num !=0){
            int digit =num%10;
            sum += digit;
            num/=10;


         }
        if(temp%sum ==0){
            System.out.println(temp+" is a harshad number.");
        }
        else{
            System.out.println(temp+" is a not harshad number.");

        }
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to be determined: ");
        int num = sc.nextInt();
        sc.close();
        harsadNum(num);

        
    }
}
