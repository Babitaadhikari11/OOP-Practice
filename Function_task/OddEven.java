// Write a method to print all odd numbers from 1 to a given number n
package Function_task;

import java.util.Scanner;

public class OddEven {
    public static void oddEven(int num){
        System.out.println("odd numbers are: ");
        for(int i=1;i<=num;i++){
            if(i%2!=0){
                System.out.println(i);
            }

        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter upto which odd needs to be printed:  ");
        int num= sc.nextInt();
        sc.close();
        oddEven(num);

    }
    
}
