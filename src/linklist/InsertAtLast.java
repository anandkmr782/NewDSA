package linklist;

import java.util.Scanner;

public class InsertAtLast {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Node head=null;
        int t=sc.nextInt();
        while(t-->0)
        {
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        display(head);
        sc.close();
    }
    public static Node insert(Node head,int data)
    {
        if(head==null)
        {
            head=new Node(data);
        }else{
            Node cur=head;
            while(cur.next!=null)
            {
                cur=cur.next;
                cur.next=new Node(data);
            }
        }
        return head;
    }
    public static void display(Node head)
    {
        Node start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
}
class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}