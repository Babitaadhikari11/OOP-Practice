//Input a number and reverse it using a for loop.
package Loops;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        //String reverse
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string");
        String str=sc.next();
        int length=str.length();
       
        String reversedString="";  
        // length=1 indexing starts from 0 
        for(int i=length-1;i>=0;i--){
            reversedString+=str.charAt(i);
        }
        System.out.println(reversedString);
        sc.close();
    }
    
}