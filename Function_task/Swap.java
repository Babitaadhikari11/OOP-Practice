//Write a method to swap two numbers using a temporary variable
package Function_task;

public class Swap {
    public static int swap(int a,int b){
        int temporary;
        temporary=a;
        a=b;
        b=temporary;
        System.out.println("the new swapped value of a is "+a+" the new value of b is : "+b);
        return temporary;
    }
    public static void main(String[] args) {
        int a=10,b=20;
        System.out.println("before swapping a = "+a+ " b = "+b);
        swap(a, b);
    }
    
}
