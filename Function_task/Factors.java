//Write a method to print all factors of a number
package Function_task;

import java.util.Scanner;

public class Factors {
    public static void factor(int num){
        System.out.println("The factors are: ");
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number of which factor needs to be calculated: ");
        int num = sc.nextInt();
        sc.close();
        factor(num);

    }
    
}
