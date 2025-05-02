//Create a method to find the sum of the first n natural numbers
package Function_task;

import java.util.Scanner;

public class SumOfNumbers {
    public static void sumOfNumbers(int num){
        int sum=0;
        for(int i=1;i<=num;i++){
            sum=sum+i;
        }
         System.out.println(sum);
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number upto which sum is done: ");
        int num=sc.nextInt();
        sc.close();
        sumOfNumbers(num);

    }
    
}
