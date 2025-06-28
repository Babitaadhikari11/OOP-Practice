package Stack;

import java.util.Scanner;

public class SupermarketQueue {
    private String[] queue;
    private int front;
    private int rear;
    private int capacity;
    private int currentSize;
    
    public SupermarketQueue(int size) {
        queue = new String[size];
        front = 0;
        rear = -1;
        capacity = size;
        currentSize = 0;
    }
    
    public void addCustomer(String customerName) {
        if (isFull()) {
            System.out.println("queue is full. Please wait.");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = customerName;
        currentSize++;
        System.out.println(customerName + " joined the queue.");
    }
    
    public void serveCustomer() {
        if (isEmpty()) {
            System.out.println("no customers in queue.");
            return;
        }
        String customer = queue[front];
        queue[front] = null;
        front = (front + 1) % capacity;
        currentSize--;
        System.out.println("now serving: " + customer);
    }
    
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("queue is empty.");
            return;
        }
        System.out.println("current queue:");
        int count = 1;
        int index = front;
        for (int i = 0; i < currentSize; i++) {
            System.out.println(count + ". " + queue[index]);
            index = (index + 1) % capacity;
            count++;
        }
    }
    
    public boolean isEmpty() {
        return currentSize == 0;
    }
    
    public boolean isFull() {
        return currentSize == capacity;
    }
    
    public int getSize() {
        return currentSize;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter queue capacity: ");
        int capacity = scanner.nextInt();
        scanner.nextLine(); 
        
        SupermarketQueue queue = new SupermarketQueue(capacity);
        
        while (true) {
            
            System.out.println("1. add customer");
            System.out.println("2. serve next customer");
            System.out.println("3. display queue");
            System.out.println("4. display queue size");
            System.out.println("5. exit");
            System.out.print("enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) {
                case 1:
                    System.out.print("enter customer name: ");
                    String name = scanner.nextLine();
                    queue.addCustomer(name);
                    break;
                    
                case 2:
                    queue.serveCustomer();
                    break;
                    
                case 3:
                    queue.displayQueue();
                    break;
                    
                case 4:
                    System.out.println("number of customers in queue :  " + queue.getSize());
                    break;
                    
                case 5:
                    System.out.println("thank you for using the system.");
                    scanner.close();
                    System.exit(0);
                    
                default:
                    System.out.println("invalid choice. please try again.");
            }
        }
    }
}