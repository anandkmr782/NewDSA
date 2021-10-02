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
        sc.close();
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
