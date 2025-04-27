//a Java program that checks if the user input number is a perfect sqaure.
package Test;
import java.util.Scanner;
public class Ques1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        sc.close();
        for(int i=1;i<=num;i++){
            if(i*i==num){
                System.out.println("the number is perfect square.");
            }
            
        }
        
        // System.out.println("the number is not perfect square.");
            

    }

    
}
