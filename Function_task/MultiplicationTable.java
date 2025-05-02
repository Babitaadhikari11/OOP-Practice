//Create a method to print the multiplication tables from 1 to 10
package Function_task;

public class MultiplicationTable {
    public static void multiplicationTable(){
        int mul=1;
        for(int i=1;i<=10;i++){
             for(int j=1;j<=10;j++){
                 mul = i * j;
                System.out.println(i + " x " + j + " = " + mul);
             }
        System.out.println();
        }
    }
    public static void main(String[] args) {
        multiplicationTable();
        
    }
    
}
