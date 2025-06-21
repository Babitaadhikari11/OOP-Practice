package Polymorphism;
//this polymorphism is called RunTime polymorphism
// parent clas
//requires inheritance
class Parent{
    public void greet(){
        System.out.println("Parent says hello");
    }
}
// child class
class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Child says hello");
    }
}
public class MethodOverridingEg {
    public static void main(String[] args) {
        Child c = new Child();
        c.greet();
    }
}
