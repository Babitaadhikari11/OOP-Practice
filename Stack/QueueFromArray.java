package Stack;

public class QueueFromArray {
    int [] queue;
    int capacity;
    int front;
    int rear;
    int size;
    public QueueFromArray(int capacity){
        queue= new int[capacity];
        this.capacity=capacity;
        front=0; //front thulo bhaye queue is empty
        rear=-1;
        size = 0;
    }
    public boolean isEmpty(){
        // return front>rear; 
        return size==0; //size 0 bhaye queue is empty
    }
    
    public boolean isFull(){
        return rear==capacity-1; 
    }
 //enqueue ma element add garne
    public void enqueue(int value){
        if (isFull()){
            System.out.println("queue overflow");
        }else{
            // rear ++;
            rear=(rear+1)%capacity;
            queue[rear]=value;
            size++;
            System.out.println("enqueuse: "+value);
        }
    }
    //dequeue ma element remove garne
    //dequeue ma front bata element remove garne
    //front ko value return garne
    //front ko value increment garne
    public int dequeue(){
        if(isEmpty()){
            System.out.println("queue underflow");
            return -99999; //exception handle garna ko lagi

        }else{
            int value = queue[front];
            // front++;
            // return value;
            front=(front+1)%capacity;
            size--;
            return value;
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("queue underflow");
            return -99999;
        }
        else{
            return queue[front];
        }
    }

    
}
