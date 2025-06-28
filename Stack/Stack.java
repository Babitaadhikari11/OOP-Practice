
package Stack;
public class Stack {
    private int[] array;
    private int top;
    private static final int DEFAULT_SIZE = 100;

    public Stack() {
        array = new int[DEFAULT_SIZE];
        top = -1;
    }

    public Stack(int size) {
        array = new int[size];
        top = -1;
    }

    public boolean push(int element) {
        if (top == array.length - 1) {
            System.out.println("Stack Overflow");
            return false;
        }
        array[++top] = element;
        return true;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return array[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return array[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Stack elements:");
        for (int i = top; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top element: " + stack.peek());
        System.out.println("Stack size: " + stack.size());
        
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.display();
        
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
        
        stack.pop();  // tried to pop from empty stack
    }
}