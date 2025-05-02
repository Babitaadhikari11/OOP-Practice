//Calculate the nth Fibonacci number using the method.
package Function_task;

import java.util.Scanner;

public class Fibonacci {
    public  void fibonacci(int n){
        int a = 0, b = 1,temp=1;

        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

             temp = a + b;
            a = b;
            b = temp;
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number to calculate fibonacci : ");
        int n = sc.nextInt();
        sc.close();
        Fibonacci obj=new Fibonacci();
        obj.fibonacci(n);
    }
    
}
