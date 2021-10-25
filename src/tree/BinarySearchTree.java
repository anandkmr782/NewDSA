package tree;

import java.util.ArrayList;
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
        System.out.println();
        System.out.print("Enter the number to be Search: ");
        int s=sc.nextInt();
        if(isPresent(root,s))
        {
            System.out.println("Present");
        }else{
            System.out.println("Not Present");
        }
        if(checkBST(root))
        {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        System.out.print("*****************");
        int v=sc.nextInt();
        insertValue(root,v);
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        sc.close();
    }
    static Node insertValue(Node root,int v)
    {
        if(root==null)
        {
            root=new Node(v);
            return root;
        }
        if(root.data<v)
        {
            root.right=insertValue(root.right,v);
        }
        if(root.data>v)
        {
            root.left=insertValue(root.left,v);
        }
        return root;
    }
    static boolean checkBST(Node root)
    {
        if(root==null)
        {
            return true;
        }
        if(root.left!=null && root.left.data>root.data)
        {
            return false;
        }
        if(root.right!=null && root.right.data<root.data)
        {
            return false;
        }
        if(!checkBST(root.left) || !checkBST(root.right))
        {
            return false;
        }
        return true;
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
