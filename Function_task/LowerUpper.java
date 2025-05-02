//Create a method to count uppercase and lowercase characters in a string
package Function_task;

import java.util.Scanner;

public class LowerUpper {
    public static void lowerUpper(String str){
        int lowerCount=0, upperCount=0;
        for(int i=0;i<=str.length()-1;i++){
            char character = str.charAt(i);
            if(character >= 'A' && character <='Z'){
                upperCount++;
            }
            else if(character >= 'a' && character <='z'){
                lowerCount++;
            }
        }
        System.out.println(upperCount);
        System.out.println(lowerCount);;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the desire string: ");
        String str = sc.nextLine();
        sc.close();
        lowerUpper(str);

    }
    
}
