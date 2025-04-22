// Take marks of five subjects and calculate the total, percentage, and grade using if-else.
package Loops;

import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter marks of 'First' marks on 100: ");
        int first=sc.nextInt();
        System.out.print("Enter marks of 'Second' marks on 100: ");
        int second=sc.nextInt();
        System.out.print("Enter marks of 'Third' marks: on 100 ");
        int third=sc.nextInt();
        System.out.print("Enter marks of 'Fourth' marks on 100: ");
        int fourth=sc.nextInt();
        System.out.print("Enter marks of 'Five' marks on 100: ");
        int fifth=sc.nextInt();
        sc.close();
        int total=500;
        int obtained=(first+second+third+fourth+fifth);
        System.out.println("total obtained marks: "+obtained);
        float percentage = ((float) obtained / total) * 100;
        // System.out.println("percentage "+percentage);
        if(percentage >= 70 ){
            System.out.println("you have scored grade A with percentage of "+percentage +"%");
        }
        else if(percentage >= 60 && percentage < 70 ){
             System.out.println("you have scored grade B with percentage of "+percentage +"%");
        }
        else if (percentage >= 50 && percentage < 60){
              System.out.println("you have scored grade C with percentage of "+percentage +"%");
        }
        else if(percentage>=35 && percentage<59) {
            System.out.println("you have scored grade C with percentage of "+percentage+"%");
        }
        else{
            System.out.println("fail with "+percentage+"%");

        }
        
    }
    
}
