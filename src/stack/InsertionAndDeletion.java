package stack;

import java.util.Scanner;
public class InsertionAndDeletion {

	public static void main(String[] args) {
		int choice=0;  
	    Scanner sc = new Scanner(System.in);  
	    Mystack s = new Mystack();  
	    System.out.print("*********Stack operations using array*********");  
	    System.out.print("\n------------------------------------------------");  
	    while(choice != 4)  
	    {  
	        System.out.print("\nChose one from the below options...\n");  
	        System.out.println("\n1.Push\n2.Pop\n3.Show\n4.Exit");  
	        System.out.print("Enter your choice: ");        
	        choice = sc.nextInt();  
	        switch(choice)  
	        {  
	            case 1:  
	            {   
	                s.push(sc);  
	                break;  
	            }  
	            case 2:  
	            {  
	                s.pop();  
	                break;  
	            }  
	            case 3:  
	            {  
	                s.display();  
	                break;  
	            }  
	            case 4:   
	            {  
	                System.out.println("Exiting....");  
	                System.exit(0);  
	                break;   
	            }  
	            default:  
	            {  
	                System.out.println("Please Enter valid choice ");  
	            }   
	        };  
	    }  
	

}

}
class Mystack{
int top;
int maxsize=10;
int a[]=new int[maxsize];

Mystack()
{
	top=-1;
}
boolean isEmpty()
{
	return top<0;
}
boolean push(Scanner sc)
{
	if(top==maxsize-1)
	{
		System.out.println("OverFlow");
		return false;
	}else {
		System.out.print("Enter the value:");
		int p=sc.nextInt();
		top++;
		a[top]=p;
		System.out.print("Item pushed");
		return true;
	}
}
boolean pop()
{
	if(top==-1)
	{
		System.out.print("UnderFlow");
		return false;
	}else {
		top--;
		System.out.print("Item pop");
		return true;
	}
}
 void display ()  
    {  
        System.out.println("Printing stack elements .....");  
        for(int i = top; i>=0;i--)  
        {  
            System.out.println(a[i]);  
        }  
    }  
}