package bruteForceSolution;

import java.util.Scanner;

public class MaxSumSubArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(maxSumSubArray(n,arr));
		sc.close();
	}
	static int maxSumSubArray(int n,int[] arr)
	{
		int maxSum=0;
		int tempSum=0;
		for(int i=0;i<n;i++)
		{
			tempSum=arr[i];
			for(int j=i+1;j<n;j++)
			{
				tempSum=tempSum+arr[j];
				if(tempSum>maxSum)
				{
					maxSum=tempSum;
				}
			}
		}
		return maxSum;
	}
}
