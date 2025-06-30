package Revision;

public class PolymorphismSectionB {
    public static int add(int a, int b){
        return a+b;
    }
    public static double add(double a, double b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println("first: "+add(2,3));
        System.out.println("Second : "+add(2.5,3.0));
    }
}
