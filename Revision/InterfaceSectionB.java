package Revision;

 interface InterfaceSectionB {
    void fly(); // this is abstract method

    
} 
    
class Bird implements InterfaceSectionB{
    @Override
    public void fly(){
        System.out.println("Bird is flying");
    }

}

