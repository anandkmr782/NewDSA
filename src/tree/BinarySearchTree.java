package tree;

import java.util.Scanner;

public class BinarySearchTree {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        Node root=null;
        while(t-- >0)
        {
            int data=sc.nextInt();
            root=insert(root,data);
        }
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.print("Enter the number to be Search: ");
        int s=sc.nextInt();
        if(isPresent(root,s))
        {
            System.out.print("Present");
        }else{
            System.out.print("Not Present");
        }
        sc.close();
    }
    static boolean isPresent(Node root,int s)
    {
        if(root==null)
        {
            return false;
        }
        if(root.data==s)
        {
            return true;
        }
        boolean res1=isPresent(root.right,s);
        if(res1)
        {
            return  true;
        }
        boolean res2=isPresent(root.left,s);
        return res2;

    }
    public static Node insert(Node root,int data)
    {
        if(root==null)
        {
            root=new Node(data);
            return root;
        }
        if(root.data<data)
        {
            root.right=insert(root.right,data);
        }else{
            root.left=insert(root.left,data);
        }
        return root;
    }
    public static void preOrder(Node root)
    {
        if(root==null)
        {
            return ;
        }else{
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void inOrder(Node root)
    {
        if(root==null)
        {
            return;
        }else{
            preOrder(root.left);
            System.out.print(root.data+" ");
            preOrder(root.right);
        }
    }
    public static void postOrder(Node root)
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
}
class Node{
    int data;
    Node left,right;
    Node(int data)
    {
        this.data=data;
        left=null;
        right=null;
    }
}
