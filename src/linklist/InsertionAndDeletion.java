package linklist;
import java.util.*;
public class InsertionAndDeletion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		MyLinkedList llist=new MyLinkedList();
		for(int i=0;i<n;i++)
		{
			llist.insert(sc.nextInt());
		}
		llist.traverse();
		sc.close();		
	}
}

class MyLinkedList{
	Node head;
	void insert(int data)
	{
		Node toAdd=new Node(data);
		if(head==null)
		{
			head=toAdd;
			return;
		}
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=toAdd;
	}
	void traverse()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data +" ");
			temp=temp.next;
		}
	}
	static class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
}