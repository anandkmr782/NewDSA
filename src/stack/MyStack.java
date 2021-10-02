package stack;

import java.util.Scanner;

public class MyStack {
    static int top;
    static Scanner sc=null;
    static int arr[]=new int[10];
    public static void main(String[] args){
        MyStack st=new MyStack();
        st.top=-1;
        sc=new Scanner(System.in);
        int choice=0;
        while(choice!=5)
        {
            System.out.println("1.push  2.pop   3.Display   4.poll   5.Exit");
            System.out.print("Enter the choices: ");
            choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    st.push();
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    st.display();
                    break;
                case 4:
                    st.poll();
                    break;
                case 5:
                    System.out.print("Exiting...");
                    break;
                default:
                    System.out.println("Enter the Valid choice: ");
            }
        }
    }
    static boolean push()
    {
        if(top==10)
        {
            System.out.print("Overflow...");
            return false;
        }else{
            top=top+1;
            System.out.print("Enter the element: ");
            arr[top]=sc.nextInt();
            return true;
        }
    }
    static boolean pop()
    {
        if(top==-1)
        {
            System.out.print("Underflow...");
            return  false;
        }else{
            top=top-1;
            return true;
        }
    }
    static void display()
    {
        for(int i=top;i>=0;i--)
        {
            System.out.println(arr[i]+" ");
        }
    }
    static void poll()
    {
        System.out.println(arr[top]);
    }
}
