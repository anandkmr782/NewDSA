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
        System.out.println();
        midOfLinkedList(head);
        System.out.println("Enter the position to be insert a linkedlist: ");
        int pos=sc.nextInt();
        int data=sc.nextInt();
        anyPosition(head,pos,data);
        display(head);
        sc.close();
    }
    public static Node anyPosition(Node head,int pos,int data)
    {
        Node temp=new Node(data);
        if(pos==1)
        {
            temp.next=head;
            head=temp;
            return head;
        }
        Node cur=head;
        int count=0;
        for(int i=1;i<=pos && cur!=null;i++)
        {
            cur=cur.next;
            if(count==pos)
            {
                break;
            }
        }
        if(cur==null)
        {
            return head;
        }
        temp.next=cur.next;
        cur.next=temp;
        head=temp;
        return head;

    }
    public static void midOfLinkedList(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
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
