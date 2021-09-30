package array;

import java.util.LinkedList;
import java.util.Scanner;

public class TreeOperation {
    static TreeOperation tt;
    static Scanner sc=null;
    public static void main(String[] args)
    {
        tt=new TreeOperation();
        sc=new Scanner(System.in);
        Node root=createTree();
        System.out.println("Level order or Breadth First traversal");
        breadthFirst(root);
        System.out.println();
        System.out.println("Preorder of Tree");
        preOrder(root);
        System.out.println("Inorder of Tree");
        inOrder(root);
        System.out.println("Postorder of Tree");
        postOrder(root);
    }
    static void breadthFirst(Node root)
    {
        if(root==null)
        {
            return;
        }
        LinkedList<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            Node curNode=q.poll();
            System.out.print(curNode.data+" ");
            if(curNode.left!=null)
            {
                q.add(curNode.left);
            }
            if(curNode.right!=null)
            {
                q.add(curNode.right);
            }
        }
    }
    static void preOrder(Node root)
    {
        if(root==null)
        {
            return;
        }else{
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
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
    static void postOrder(Node root)
    {
        if(root==null)
        {
            return;
        }else{
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }
    static Node createTree()
    {
        Node root=null;
        System.out.print("Enter the data: ");
        int data=sc.nextInt();
        if(data==-1)
        {
            return null;
        }else{
            root=tt.new Node(data);
            System.out.println("Enter the left data of: "+data);
            root.left=createTree();
            System.out.println("Enter the right data of: "+data);
            root.right=createTree();

        }
        return root;
    }
    public class Node{
        int data;
        Node left,right;
        Node(int data)
        {
            this.data=data;
        }
    }
}
