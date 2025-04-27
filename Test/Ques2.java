//calculates the product of the digits in a number given by a user
//using a loop.
package Test;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter digits: ");
        int num=sc.nextInt();
        sc.close();
        int temp=num;
        int mul=1;
        int digit=0;
        while(temp!=0){
            temp/=10;
            digit++;
        }

        for(int i=1;i<=digit;i++){
            int di = num % 10;
            mul = mul * di;
            num /= 10; 
        }
        System.out.println("the multiplication is: "+mul);
    }
    
}
