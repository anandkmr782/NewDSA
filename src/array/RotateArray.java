package array;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int n=sc.nextInt();
		System.out.println("Enter the K value to rotate:");
		int k=sc.nextInt();
		System.out.println("Enter the arrays:");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int b[]=new int[n];
		
		int temp;
		for(int j=0;j<k;j++)
		{
		    temp=a[n-1];
		    for(int i=n-2;i>=0;i--)
		    {
		        b[i+1]=a[i];
		    }
		    b[0]=temp;
		}
		for(int e:b)
		{
			System.out.print(e+" ");
		}
		sc.close();

	}

}
