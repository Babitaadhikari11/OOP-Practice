//Write a method that returns the sum of squares of digits of a number
package Function_task;

import java.util.Scanner;

public class SumOfSquares {
    public static void sumSquare(int num){
        int remainder,sum=0;
        // int count=0;
        while(num!=0){
            
            remainder=num%10;
             sum=sum+remainder*remainder;
            num=num/10;
            }
             System.out.println(sum);

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number to calculate square of digits: ");
        int num= sc.nextInt();
        sc.close();
        sumSquare(num);

        }
    }
    

