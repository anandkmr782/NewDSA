package queue;

public class MyCircularQueue {
    public static void main(String[] args) {
        CircularQueue cq=new CircularQueue(5);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);
        cq.display();
        cq.dequeue();
        cq.dequeue();
        System.out.println();
        cq.display();

    }
}
class CircularQueue{
    int rear,front,capacity;
    int arr[];
    CircularQueue(int c)
    {
        capacity=c;
        front=rear=-1;
        arr=new int[capacity];
    }
    void enqueue(int data)
    {
        if((rear+1)%capacity==front)
        {
            System.out.println("Circular Queue is Full");
            return;
        }
        if(front==-1)
        {
            front=0;
        }
        rear=(rear+1)%capacity;
        arr[rear]=data;
    }
    void dequeue()
    {
        if(front==-1)
        {
            System.out.println("Circular Queue is Empty");
        }
        if(front==rear)
        {
            front=rear=-1;
        }else{
            front=(front+1)%capacity;
        }
    }
    void display()
    {

    }
}
