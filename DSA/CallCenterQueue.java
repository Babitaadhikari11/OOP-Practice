package DSA;



import java.util.Scanner;

public class CallCenterQueue {
    private String[] callQueue;
    private int front;
    private int rear;
    private int capacity;
    private int currentSize;
    
    public CallCenterQueue(int size) {
        callQueue = new String[size];
        front = 0;
        rear = -1;
        capacity = size;
        currentSize = 0;
    }
    
    public void addCall(String callerNumber) {
        if (isFull()) {
            System.out.println("queue is full,  call cannot be added at the moment.");
            return;
        }
        rear = (rear + 1) % capacity;
        callQueue[rear] = callerNumber;
        currentSize++;
        System.out.println("call from " + callerNumber + " added to queue.");
        System.out.println("position in queue: " + currentSize);
    }
    
    public void handleCall() {
        if (isEmpty()) {
            System.out.println("no calls waiting in queue.");
            return;
        }
        String caller = callQueue[front];
        callQueue[front] = null;
        front = (front + 1) % capacity;
        currentSize--;
        System.out.println("now handling call from: " + caller);
        System.out.println("remaining calls in queue: " + currentSize);
    }
    
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("no calls in queue.");
            return;
        }
        System.out.println("current call queue:");
       
        int count = 1;
        int index = front;
        for (int i = 0; i < currentSize; i++) {
            System.out.println("position " + count + ": caller " + callQueue[index]);
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
    
    public int getPendingCalls() {
        return currentSize;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter maximum queue capacity: ");
        int capacity = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        CallCenterQueue queue = new CallCenterQueue(capacity);
        
        while (true) {
            System.out.println("call center queue management system");
            
            System.out.println("1. add new call");
            System.out.println("2. handle next call");
            System.out.println("3. display call queue");
            System.out.println("4. show number of pending calls");
            System.out.println("5. exit");
            
            System.out.print("enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) {
                case 1:
                    System.out.print("enter caller's phone number: ");
                    String number = scanner.nextLine();
                    queue.addCall(number);
                    break;
                    
                case 2:
                    queue.handleCall();
                    break;
                    
                case 3:
                    queue.displayQueue();
                    break;
                    
                case 4:
                    System.out.println("number of calls waiting: " + queue.getPendingCalls());
                    if (queue.getPendingCalls() > 0) {
                        System.out.println("next call to be handled: " + queue.callQueue[queue.front]);
                    }
                    break;
                    
                case 5:
                    System.out.println("thank you for using call center queue management system!");
                    scanner.close();
                    System.exit(0);
                    
                default:
                    System.out.println("invalid choice. please try again.");
            }
        }
    }
}

