package linklist;

import java.util.Scanner;

public class LinkedListInsertionAtAnyPosition {
    public static void main(String[] args)
    {
        NodeA head=null;
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0)
        {
            int data=sc.nextInt();
            head=insert(head,data);
        }
        print(head);

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
        next=null;
    }
}