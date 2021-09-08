package array;

import java.util.Scanner;

public class PairSumClosestToX {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		closestPair(n,arr,k);
		sc.close();

	}
	static void closestPair(int n,int[] arr,int k)
	{
		int res_l=0;
		int res_r=0;
		int l=0,r=n-1,diff=Integer.MAX_VALUE;
		while(r>l)
		{
			if(Math.abs(arr[1]+arr[r]-k)<diff)
			{
				res_l=1;
				res_r=r;
				diff=Math.abs(arr[1]+arr[r]-k);
			}
			if(arr[1]+arr[r]>k)
			{
				r--;
			}else {
				l++;
			}
		}
		System.out.println("The closest pair is: "+arr[res_l]+" and "+arr[res_r]);
	}

}

