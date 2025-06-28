package Stack;

public class StackFromArray {
    int[] stack;
    int capacity;
    int top;
    public StackFromArray(int size){
        stack = new int[size];
        capacity = size;
        //making the stack empty
        top=-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==capacity-1;
    }
    public void push(int value){
        if(isFull()){
            System.out.println("Stack overflow");
            return;
        }
        top++;
        stack[top]=value;
        System.out.println(value+" pushed to stack");
    }
    //pop pick
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack underflow");
            return -99999;
        }else{
            int value = stack[top];
            top--;
            return value;
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack underflow");
            return -9999;
        }else{
            int value = stack[top];
            return value;
        }
    }
    
}
