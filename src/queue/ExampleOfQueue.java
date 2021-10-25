package queue;

public class ExampleOfQueue {
    public static void main(String[] args) {
        queue mq=new queue(5);
        mq.enqueue(10);
        mq.enqueue(20);
        mq.enqueue(30);
        mq.enqueue(40);
        mq.enqueue(50);
        mq.display();
        System.out.println();
        mq.dequeue();
        mq.dequeue();
        mq.display();
        System.out.println();
        mq.displayFront();

    }
}
class queue{
    int rear,front,capacity;
    int arr[];
    queue(int c)
    {
        rear=front=0;
        capacity=c;
        arr=new int[capacity];
    }
    void enqueue(int data)
    {
        if(rear==capacity)
        {
            System.out.println("Overflow");
            return;
        }
        arr[rear]=data;
        rear++;
    }
    void display()
    {
        if(rear==front)
        {
            System.out.println("Queue is Empty");
            return;
        }
        for(int i=front;i<rear;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    void dequeue()
    {
        if(rear==front)
        {
            System.out.println("Queue is Empty");
            return;
        }else{
            for(int i=0;i<rear-1;i++)
            {
                arr[i]=arr[i+1];
            }
            if(rear<capacity)
            {
                arr[rear]=0;
            }
            rear--;
        }
    }
    void displayFront()
    {
        if(rear==front)
        {
            System.out.println("Queue is Empty");
        }else{
            System.out.println(arr[front]);
        }
    }
}

