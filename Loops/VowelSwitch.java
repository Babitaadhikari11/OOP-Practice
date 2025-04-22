//Take a character input and use switch to display if it is a vowel (a, e, i, o, u).
package Loops;

import java.util.Scanner;

public class VowelSwitch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a character to be checked: ");
        char ch=sc.next().charAt(0);
        sc.close();
        // Converting to lowercase 
        ch = Character.toLowerCase(ch);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            System.out.println("Vowel");
                break;
        
            default:
            System.out.println("not vowel encountered");
                break;
        }
    }
    

}
