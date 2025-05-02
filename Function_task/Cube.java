//Create a method to calculate the cube of a given number
package Function_task;

import java.util.Scanner;

public class Cube {
    public static void cubeNum(int num){
        int cube = num*num*num;
        System.out.println("the cube of "+num+ " is "+cube);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for calculating its cube: ");
        int num = sc.nextInt();
        sc.close();
        cubeNum(num);
    }
    
}
