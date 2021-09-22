package array;

import java.util.Scanner;
class RotateArray {
	void leftRotate(int arr[], int d, int n)
	{
		for (int i = 0; i < d; i++)
		{
			leftRotatebyOne(arr, n);
		}
			
	}

	void leftRotatebyOne(int arr[], int n)
	{
		int i, temp;
		temp = arr[0];
		for (i = 0; i < n - 1; i++)
		{
			arr[i] = arr[i + 1];
		}
		arr[n-1] = temp;
			
	}
	void printArray(int arr[], int n)
	{
		for (int i = 0; i < n; i++)
		{
			System.out.print(arr[i] + " ");
		}
			
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		RotateArray rotate = new RotateArray();
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		rotate.leftRotate(arr,n-k, n);
		rotate.printArray(arr, n);
		sc.close();
	}
}
