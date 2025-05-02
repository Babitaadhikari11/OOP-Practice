//Write a method to check if a number is a Kaprekar number
package Function_task;

import java.util.Scanner;

public class Kaprekar {
    public static void kaprekarNumber(int num){
        int temp,square, sum=0, c=1, a=0,b=0;
        square=num*num;
        System.out.println("the square is: "+square);
        temp=num;
        while(temp!=0){
            c=c*10;
            temp=temp/10;
        }
        a=square%c;
        b=square/c;
        sum=a+b;
        if(sum==num){
            System.out.print("The number is kaprekar number");
        }
        else{
            System.out.print("the number is not kaprekar number");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to be checked: ");
        int num =sc.nextInt();
        sc.close();
        kaprekarNumber(num);
    }
    
}
