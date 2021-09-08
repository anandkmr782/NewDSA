package bitManipulation;

import java.util.*;

public class SumOfBitDifferencesAmongAllPairs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(sumBitDifferences(n,arr));
		sc.close();
	}
	static int sumBitDifferences(int n,int[] arr)
	{
		int res=0;
		for(int i=0;i<32;i++)
		{
			int count=0;
			for(int j=0;j<n;j++)
			{
				if((arr[j]&(1<<i))!=0)
				{
					count++;
				}
			}
			res=res+(count * (n - count) * 2);
		}
		return res;
	}

}
