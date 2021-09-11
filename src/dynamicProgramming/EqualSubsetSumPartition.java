package dynamicProgramming;

import java.util.Scanner;

public class EqualSubsetSumPartition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(equalSum(n,arr));
		sc.close();
	}
	static boolean equalSum(int n,int[] arr)
	{
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
		}
		if(sum%2!=0)
		{
			return false;
		}else {
			return subSetSum(arr,n,sum/2);
		}
	}
	static boolean subSetSum(int[] arr,int n,int sum)
	{
		if(sum==0)
		{
			return true;
		}
		if(n==0 && sum!=0)
		{
			return false;
		}
		if(arr[n-1]>sum)
		{
			return subSetSum(arr,n-1,sum);
		}
		return subSetSum(arr,n-1,sum)||subSetSum(arr,n-1,sum-arr[n-1]);
	}

}
