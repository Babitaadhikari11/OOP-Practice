//Create a method that accepts a character and returns its ASCII value
package Function_task;

import java.util.Scanner;

public class AsciiValue {
    public static void asciiValue(char as){
        System.out.println("The ASCII value of "+as+" is "+(int)as);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a character to know its its ASCII value: ");
        char as=sc.next().charAt(0);
        sc.close();
        asciiValue(as);
    }
    
}
