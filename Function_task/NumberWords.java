//Write a method to count the number of words in a given string
package Function_task;

import java.util.Scanner;

public class NumberWords {
    public static void numberWords(String s){
        int count=1; //word count
        for(int i=0;i<=s.length()-1;i++){ //since length starts from 1 
            // extracting every character and identifying space as end of word and determining after space there exist new character
            if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')){
                count++;

            }

        }
        System.out.println("number of words: "+count);
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s= sc.nextLine();
        sc.close();
        numberWords(s);
    }
}
