package Loops;
import java.util.Scanner;
public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a number: ");
        String num = sc.nextLine();
        sc.close();
        int len= num.length();
        System.out.println("Number of digits: "+len);
    }
    
}
    

