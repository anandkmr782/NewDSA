package searching;

import java.util.Arrays;
import java.util.Scanner;

public class BookAllocation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		System.out.println(maximumNumber(n,arr,k));
		sc.close();

	}
	static int maximumNumber(int n,int[] arr,int k)
	{
		int min=maxOfArr(n,arr);
		int max=sumOfArr(n,arr);
		int res=0;
		while(min<=max)
		{
			int mid=(min+max)/2;
			if(isFeasible(arr,k,mid))
			{
				res=mid;
				max=mid-1;
			}else {
				min=mid+1;
			}
		}
		return res;
	}
	static int maxOfArr(int n,int[]arr)
	{
		Arrays.sort(arr);
		return arr[n-1];
	}
	static int sumOfArr(int n,int[] arr)
	{
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
		}
		return sum;
	}
	static boolean isFeasible(int[] arr,int k,int res)
	{
		int student=1;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(sum+arr[i]>res)
			{
				student++;
				sum=arr[i];
			}else {
				sum=sum+arr[i];
			}
		}
		return student<=k;
	}
	
}
