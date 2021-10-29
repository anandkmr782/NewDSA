package linklist;

import java.util.Scanner;

public class LinkedListOperation {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        NodeA head=null;
        int t=sc.nextInt();
        while(t-- >0)
        {
            int data=sc.nextInt();
            head=insert(head,data);
        }
        print(head);
        midLinkedList(head);
        //print(head);
    }
    static void midLinkedList(NodeA head)
    {
        NodeA slow=head;
        NodeA fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
    }

    static void print(NodeA head)
    {
        NodeA start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    static NodeA insert(NodeA head,int data)
    {
        NodeA toAdd=new NodeA(data);
        if(head==null)
        {
            head=toAdd;
            return head;
        }else{
            NodeA temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=toAdd;
        }
        return head;
    }
}
class NodeA{
    int data;
    NodeA next;
    NodeA(int data)
    {
        this.data=data;
    }
}
