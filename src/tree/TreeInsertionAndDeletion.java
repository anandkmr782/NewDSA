package tree;
import java.util.*;
public class TreeInsertionAndDeletion {

	static TreeInsertionAndDeletion tt;
	static Scanner sc=null;
	public static void main(String[] args)
	{
		tt=new TreeInsertionAndDeletion();
		sc=new Scanner(System.in);
		Node root=createTree();
		inOrder(root);
		System.out.println();

	}
	static Node createTree()
	{
		Node root=null;
		System.out.println("Enter the data: ");
		int data=sc.nextInt();
		if(data== -1)
		{
			return null;
		}else{
			root=tt.new Node(data);
			System.out.println("Enter the left data: "+data);
			root.left=createTree();
			System.out.println("Enter the right data: "+data);
			root.right=createTree();
		}
		return root;
	}
	static void inOrder(Node root)
	{
		if(root==null)
		{
			return;
		}else{
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	}
public class Node{

	  Node left,right;
	  int data;
	  public Node(int data)
	  {
	    this.data=data;
	  }
	}
}