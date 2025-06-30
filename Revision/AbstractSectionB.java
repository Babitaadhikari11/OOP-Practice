package Revision;

abstract class AbstractSectionB {
    abstract void makeSound();
    void eat(){
        System.out.println("the animal eats food.");
    }
    
    
}
class Dog extends AbstractSectionB{
    @Override
    void makeSound(){
        System.out.println("it barks");
    }
}
