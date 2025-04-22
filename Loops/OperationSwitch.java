// Take two numbers and an operator (+, -, *, /) and perform the operation using switch.
package Loops;
    import java.util.Scanner;
public class OperationSwitch {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a first number: ");
        int first=sc.nextInt();
        System.out.println("Enter a second number: ");
        int second=sc.nextInt();
        System.out.println("Enter an operation to perform operation: ");
        char operat=sc.next().charAt(0);
        sc.close();
        switch (operat) {
            case '+':
            int sum=first+second;
            System.out.println("the sum is: "+sum);
                
            break;

            case '-':
            int diff=first-second;
            System.out.println("the difference is: "+diff);
            break;

            case '*':
            int mul=first*second;
            System.out.println("the multiplication is: "+mul);
            break;

            case '/':
            if(second==0){
                System.out.println("second number must not be zero.");
            }
            else{
                int divison=first/second;
            System.out.println("the division is: "+divison);

            } 
            break;
        
            default:
                break;
        }


    }
    
}

    

