package array;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayLeft {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int arr1[]=rotate(n,k,arr);
		for(int e:arr1)
		{
			System.out.print(e+" ");
		}
		sc.close();

	}
	static int[] rotate(int n,int k,int[] arr)
	{
		for(int i=0;i<k;i++)
		{
			rotateLeft(arr);
		}
		return arr;
	}
	static int[] rotateLeft(int arr[])
	{
		int temp=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
		return arr;
	}

}
