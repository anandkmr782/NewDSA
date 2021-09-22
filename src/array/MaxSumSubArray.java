package array;

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
		int maxSumSoFar=0;
		int maxSumEnding=0;
		for(int i=0;i<n;i++)
		{
			maxSumEnding=maxSumEnding+arr[i];
			if(maxSumEnding<0)
			{
				maxSumEnding=0;
			}
			if(maxSumEnding>maxSumSoFar)
			{
				maxSumSoFar=maxSumEnding;
			}
		}
		return maxSumSoFar;
	}
}
