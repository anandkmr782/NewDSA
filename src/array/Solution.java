package array;
import java.util.*;
class Solution {
	public static void main (String[] args) {
		Node head1=null;
		Node head2=null;
		Scanner sc=new Scanner(System.in);
		int t1=sc.nextInt();
		while(t1-- >0)
		{
		    int data=sc.nextInt();
		    head1=insert(head1,data);
		}
		int t2=sc.nextInt();
		while(t2-- >0)
		{
		    int data=sc.nextInt();
		    head2=insert(head2,data);
		}
		//display(head1);
		System.out.println();
		//display(head2);
		System.out.println();
		sum(head1,head2);
		sc.close();
		
	}
	static void sum(Node head1,Node head2)
	{
		int sum1=0;
		int sum2=0;
		Node start1=head1;
		Node start2=head2;
		while(start1!=null)
		{
			sum1=sum1*10+start1.data;
			start1=start1.next;
			
		}
		while(start2!=null)
		{
			sum2=sum2*10+start2.data;
			start2=start2.next;
		}
		int s=sum1+sum2;
		Node res=null;
		while(s>0)
		{
			int rev=s%10;
			res=insert(res,rev);
			s=s/10;
		}
		res=reverse(res);
		display(res);
	}
	static Node reverse(Node head)
	{
		if(head==null)
		{
			return null;
		}
		Node temp=head,next=null,prev=null;
		while(temp!=null)
		{
			next=temp.next;
			temp.next=prev;
			prev=temp;
			temp=next;
		}
		head=prev;
		return head;
	}
	static Node insert(Node head,int data)
    {
        Node toAdd=new Node(data);
        if(head==null)
        {
            head=toAdd;
            return head;
        }else{
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=toAdd;
        }
        return head;
    }
    static void display(Node head)
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
